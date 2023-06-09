
package ch.hegarc.servicenotaire.correction.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CorrectionWebService", targetNamespace = "http://webservice.correction.servicenotaire.hegarc.ch/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CorrectionWebService {


    /**
     * 
     * @param textACorriger
     * @return
     *     returns java.lang.String
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "correction", targetNamespace = "http://webservice.correction.servicenotaire.hegarc.ch/", className = "ch.hegarc.servicenotaire.correction.webservice.Correction")
    @ResponseWrapper(localName = "correctionResponse", targetNamespace = "http://webservice.correction.servicenotaire.hegarc.ch/", className = "ch.hegarc.servicenotaire.correction.webservice.CorrectionResponse")
    @Action(input = "http://webservice.correction.servicenotaire.hegarc.ch/CorrectionWebService/correctionRequest", output = "http://webservice.correction.servicenotaire.hegarc.ch/CorrectionWebService/correctionResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://webservice.correction.servicenotaire.hegarc.ch/CorrectionWebService/correction/Fault/IOException")
    })
    public String correction(
        @WebParam(name = "textACorriger", targetNamespace = "")
        String textACorriger)
        throws IOException_Exception
    ;

}
