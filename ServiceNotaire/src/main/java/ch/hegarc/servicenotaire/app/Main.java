package ch.hegarc.servicenotaire.app;

import ch.hegarc.servicenotaire.webservice.ServiceNotaireWebService;

import javax.xml.ws.Endpoint;
import java.io.*;

public class Main {

    public static void main(String[] argv) throws FileNotFoundException {
        System.out.println("Lancement du serveur web");
        Endpoint.publish("http://0.0.0.0:8000/ws/ServiceNotaire", new ServiceNotaireWebService());
    }
}
