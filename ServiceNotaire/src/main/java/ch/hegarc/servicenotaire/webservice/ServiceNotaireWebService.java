package ch.hegarc.servicenotaire.webservice;

import ch.hegarc.servicenotaire.business.ResumeActe;
import ch.hegarc.servicenotaire.correction.webservice.IOException_Exception;
import ch.hegarc.servicenotaire.service.IServiceNotaire;
import ch.hegarc.servicenotaire.service.ServiceNotaire;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.io.IOException;

@WebService
public class ServiceNotaireWebService implements IServiceNotaire {
    IServiceNotaire serviceNotaire = new ServiceNotaire();

    @WebMethod(operationName = "correctionOrthographique")
    public ResumeActe correctionOrthographique(@WebParam(name = "acte") @XmlElement(required = true) ResumeActe resumeActe,
                                               @WebParam(name = "email") @XmlElement(required = true) String email,
                                               @WebParam(name = "motDePasse") @XmlElement(required = true) String password) throws IOException_Exception, IOException {
        return serviceNotaire.correctionOrthographique(resumeActe, email, password);
    }
}
