package ch.hegarc.servicenotaire.service;

import ch.hegarc.servicenotaire.business.ResumeActe;
import ch.hegarc.servicenotaire.correction.webservice.IOException_Exception;

import java.io.IOException;

public interface IServiceNotaire {
    ResumeActe correctionOrthographique(ResumeActe resumeActe, String nom, String prenom) throws IOException, IOException_Exception;
}
