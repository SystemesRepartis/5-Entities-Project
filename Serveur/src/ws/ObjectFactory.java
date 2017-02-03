
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _GetFacturesResponse_QNAME = new QName("http://ws/", "getFacturesResponse");
    private final static QName _GetFactureResponse_QNAME = new QName("http://ws/", "getFactureResponse");
    private final static QName _GetFactures_QNAME = new QName("http://ws/", "getFactures");
    private final static QName _GetFacture_QNAME = new QName("http://ws/", "getFacture");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFacturesResponse }
     * 
     */
    public GetFacturesResponse createGetFacturesResponse() {
        return new GetFacturesResponse();
    }

    /**
     * Create an instance of {@link GetFactureResponse }
     * 
     */
    public GetFactureResponse createGetFactureResponse() {
        return new GetFactureResponse();
    }

    /**
     * Create an instance of {@link GetFactures }
     * 
     */
    public GetFactures createGetFactures() {
        return new GetFactures();
    }

    /**
     * Create an instance of {@link GetFacture }
     * 
     */
    public GetFacture createGetFacture() {
        return new GetFacture();
    }

    /**
     * Create an instance of {@link Facture }
     * 
     */
    public Facture createFacture() {
        return new Facture();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFacturesResponse")
    public JAXBElement<GetFacturesResponse> createGetFacturesResponse(GetFacturesResponse value) {
        return new JAXBElement<GetFacturesResponse>(_GetFacturesResponse_QNAME, GetFacturesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFactureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFactureResponse")
    public JAXBElement<GetFactureResponse> createGetFactureResponse(GetFactureResponse value) {
        return new JAXBElement<GetFactureResponse>(_GetFactureResponse_QNAME, GetFactureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFactures }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFactures")
    public JAXBElement<GetFactures> createGetFactures(GetFactures value) {
        return new JAXBElement<GetFactures>(_GetFactures_QNAME, GetFactures.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFacture")
    public JAXBElement<GetFacture> createGetFacture(GetFacture value) {
        return new JAXBElement<GetFacture>(_GetFacture_QNAME, GetFacture.class, null, value);
    }

}
