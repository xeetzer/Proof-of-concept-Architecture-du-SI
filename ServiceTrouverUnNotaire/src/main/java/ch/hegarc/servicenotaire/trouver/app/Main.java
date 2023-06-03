package ch.hegarc.servicenotaire.trouver.app;

import ch.hegarc.servicenotaire.trouver.business.Notaire;
import ch.hegarc.servicenotaire.trouver.webservice.TrouverNotaireWebService;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import javax.xml.ws.Endpoint;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws FileNotFoundException {
        Map<String, Notaire> notaires = loadCsv();
        TrouverNotaireWebService service = new TrouverNotaireWebService();
        service.setService(notaires);

        System.out.println("Lancement du serveur web");
        Endpoint.publish("http://0.0.0.0:8080/ws/ServiceTrouverNotaire", service);
    }

    public static Map<String, Notaire> loadCsv() throws FileNotFoundException {
        Map<String, Notaire> notaires = new HashMap<>();
        FileReader reader = new FileReader("liste_notaires.csv");

        final CSVParser parser = new CSVParserBuilder()
                        .withSeparator(';')
                        .withIgnoreQuotations(true)
                        .build();

        try (final CSVReader csvReader = new CSVReaderBuilder(reader)
                .withSkipLines(1)
                .withCSVParser(parser)
                .build();) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                notaires.put(values[5], new Notaire(values));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return notaires;
    }
}
