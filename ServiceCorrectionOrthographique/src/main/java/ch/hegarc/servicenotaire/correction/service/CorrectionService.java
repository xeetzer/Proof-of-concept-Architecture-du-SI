package ch.hegarc.servicenotaire.correction.service;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import ch.hegarc.servicenotaire.correction.integration.BingSpellCheckResponse;
import ch.hegarc.servicenotaire.correction.integration.FlaggedTokens;
import ch.hegarc.servicenotaire.correction.integration.TextGearsGrammarCheck;
import ch.hegarc.servicenotaire.correction.integration.TextGearsGrammarCheckError;
import com.google.gson.*;
import javax.net.ssl.HttpsURLConnection;

public class CorrectionService implements ICorrectionService {

    static String host = "https://api.textgears.com";
    static String path = "/grammar";
    static String key = "JB5Scr7Bu0oEvtLQ";
    static String language = "fr-FR";

    @Override
    public String correction(String textACorriger) throws IOException {
        // Passer le text à TextGears
        URL url = new URL(host + path);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);

        Gson gson = new Gson();
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("key", key);
        requestBody.put("text", textACorriger);
        requestBody.put("language", language);

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeBytes(gson.toJson(requestBody));
        wr.flush();
        wr.close();

        // Récupérer la réponse et extraire le mots faux
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            response.append(line);
        }
        in.close();

        // Renvoyer le texte original avec les mots faux souligner en rouge
        return tracerErreures(new StringBuilder(textACorriger), response.toString());
    }

    public static String tracerErreures(StringBuilder textACorriger, String json) {
        Gson gson = new Gson();
        TextGearsGrammarCheck check = gson.fromJson(json, TextGearsGrammarCheck.class);
        if (!check.status) {
            return textACorriger.toString();
        }

        int offsetChange = 0;
        for (TextGearsGrammarCheckError error : check.response.errors) {
            String replacement = "<del>" + error.bad + "</del>";
            textACorriger.replace(error.offset + offsetChange, error.offset + error.length + offsetChange, replacement);

            offsetChange += replacement.length() - error.length;
        }
        return textACorriger.toString();
    }
}
