package ch.hegarc.servicenotaire.correction.webservice;

import ch.hegarc.servicenotaire.correction.service.CorrectionService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.io.IOException;

@WebService
public class CorrectionWebService {
    private final CorrectionService correctionService = new CorrectionService();

    @WebMethod(operationName = "correction")
    public String correction(
            @WebParam(name = "textACorriger")
            @XmlElement(required = true) String textACorriger
    ) throws IOException {
        return correctionService.correction(textACorriger);
    }
}
