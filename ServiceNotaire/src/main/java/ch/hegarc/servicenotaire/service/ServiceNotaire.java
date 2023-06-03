package ch.hegarc.servicenotaire.service;

import ch.hegarc.servicenotaire.business.ResumeActe;
import ch.hegarc.servicenotaire.correction.webservice.CorrectionWebService;
import ch.hegarc.servicenotaire.correction.webservice.CorrectionWebServiceService;
import ch.hegarc.servicenotaire.correction.webservice.IOException_Exception;
import ch.hegarc.servicenotaire.trouver.webservice.TrouverNotaireWebService;
import ch.hegarc.servicenotaire.trouver.webservice.TrouverNotaireWebServiceService;

import javax.jws.WebService;
import javax.ws.rs.NotAuthorizedException;

@WebService
public class ServiceNotaire implements IServiceNotaire {
    TrouverNotaireWebService trouverNotaires = new TrouverNotaireWebServiceService().getTrouverNotaireWebServicePort();
    CorrectionWebService correction = new CorrectionWebServiceService().getCorrectionWebServicePort();

    @Override
    public ResumeActe correctionOrthographique(ResumeActe resumeActe, String nom, String prenom) throws IOException_Exception {
        authenticate(nom, prenom);

        String natureActeCorrection = correction.correction(resumeActe.getNatureActe());
        resumeActe.setNatureActe(natureActeCorrection);
        return resumeActe;
    }

    private void authenticate(String nom, String prenom) {
        if (!trouverNotaires.authenticate(nom, prenom)) {
            throw new NotAuthorizedException("Authentification failed");
        }
    }
}
