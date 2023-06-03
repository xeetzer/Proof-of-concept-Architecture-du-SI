package ch.hegarc.servicenotaire.trouver.webservice;

import ch.hegarc.servicenotaire.trouver.business.Notaire;
import ch.hegarc.servicenotaire.trouver.service.ITrouverNotaireService;
import ch.hegarc.servicenotaire.trouver.service.TrouverNotaireService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@WebService
public class TrouverNotaireWebService {
    ITrouverNotaireService service;

    @WebMethod(exclude = true)
    public void setService(Map<String, Notaire> notaires) {
        service = new TrouverNotaireService();
        service.setNotaires(notaires);
    }

    @WebMethod(operationName = "getAll")
    public Collection<Notaire> getNotaires() {
        return service.getNotaires();
    }

    @WebMethod(operationName = "find")
    public List<Notaire> findNotaire(
            @WebParam(name = "search")
            @XmlElement(required = true, nillable = true)
            String recherche
    ) {
        return service.findNotaire(recherche);
    }

    @WebMethod(operationName = "authenticate")
    public boolean authentifierNotaire(
            @WebParam(name = "email")
            @XmlElement(required = true)
            String email,
            @WebParam(name = "password")
            @XmlElement(required = true)
            String password
    ) {
        return service.authentifierNotaire(email, password);
    }
}
