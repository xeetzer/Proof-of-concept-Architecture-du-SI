
package ch.hegarc.servicenotaire.trouver.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.hegarc.servicenotaire.trouver.webservice package. 
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

    private final static QName _Authenticate_QNAME = new QName("http://webservice.trouver.servicenotaire.hegarc.ch/", "authenticate");
    private final static QName _GetAll_QNAME = new QName("http://webservice.trouver.servicenotaire.hegarc.ch/", "getAll");
    private final static QName _AuthenticateResponse_QNAME = new QName("http://webservice.trouver.servicenotaire.hegarc.ch/", "authenticateResponse");
    private final static QName _Find_QNAME = new QName("http://webservice.trouver.servicenotaire.hegarc.ch/", "find");
    private final static QName _GetAllResponse_QNAME = new QName("http://webservice.trouver.servicenotaire.hegarc.ch/", "getAllResponse");
    private final static QName _FindResponse_QNAME = new QName("http://webservice.trouver.servicenotaire.hegarc.ch/", "findResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.hegarc.servicenotaire.trouver.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link Notaire }
     * 
     */
    public Notaire createNotaire() {
        return new Notaire();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.trouver.servicenotaire.hegarc.ch/", name = "authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.trouver.servicenotaire.hegarc.ch/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.trouver.servicenotaire.hegarc.ch/", name = "authenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.trouver.servicenotaire.hegarc.ch/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.trouver.servicenotaire.hegarc.ch/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.trouver.servicenotaire.hegarc.ch/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

}
