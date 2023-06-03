
package ch.hegarc.servicenotaire.correction.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.hegarc.servicenotaire.correction.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Correction_QNAME = new QName("http://webservice.correction.servicenotaire.hegarc.ch/", "correction");
    private final static QName _IOException_QNAME = new QName("http://webservice.correction.servicenotaire.hegarc.ch/", "IOException");
    private final static QName _CorrectionResponse_QNAME = new QName("http://webservice.correction.servicenotaire.hegarc.ch/", "correctionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.hegarc.servicenotaire.correction.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CorrectionResponse }
     * 
     */
    public CorrectionResponse createCorrectionResponse() {
        return new CorrectionResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Correction }
     * 
     */
    public Correction createCorrection() {
        return new Correction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Correction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.correction.servicenotaire.hegarc.ch/", name = "correction")
    public JAXBElement<Correction> createCorrection(Correction value) {
        return new JAXBElement<Correction>(_Correction_QNAME, Correction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.correction.servicenotaire.hegarc.ch/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.correction.servicenotaire.hegarc.ch/", name = "correctionResponse")
    public JAXBElement<CorrectionResponse> createCorrectionResponse(CorrectionResponse value) {
        return new JAXBElement<CorrectionResponse>(_CorrectionResponse_QNAME, CorrectionResponse.class, null, value);
    }

}
