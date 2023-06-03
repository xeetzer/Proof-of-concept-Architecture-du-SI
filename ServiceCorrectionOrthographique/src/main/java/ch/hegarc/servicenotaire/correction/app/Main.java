package ch.hegarc.servicenotaire.correction.app;

import ch.hegarc.servicenotaire.correction.webservice.CorrectionWebService;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] argv) {
        System.out.println("Lancement du serveur web");
        Endpoint.publish("http://0.0.0.0:8081/ws/ServiceCorrection", new CorrectionWebService());
    }
}
