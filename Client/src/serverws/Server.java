
package serverws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Server", targetNamespace = "http://serverWS/", wsdlLocation = "http://localhost:8586/Server?wsdl")
public class Server
    extends Service
{

    private final static URL SERVER_WSDL_LOCATION;
    private final static WebServiceException SERVER_EXCEPTION;
    private final static QName SERVER_QNAME = new QName("http://serverWS/", "Server");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8586/Server?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVER_WSDL_LOCATION = url;
        SERVER_EXCEPTION = e;
    }

    public Server() {
        super(__getWsdlLocation(), SERVER_QNAME);
    }

    public Server(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVER_QNAME, features);
    }

    public Server(URL wsdlLocation) {
        super(wsdlLocation, SERVER_QNAME);
    }

    public Server(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVER_QNAME, features);
    }

    public Server(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Server(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServerServices
     */
    @WebEndpoint(name = "ServerServicesPort")
    public ServerServices getServerServicesPort() {
        return super.getPort(new QName("http://serverWS/", "ServerServicesPort"), ServerServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerServices
     */
    @WebEndpoint(name = "ServerServicesPort")
    public ServerServices getServerServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serverWS/", "ServerServicesPort"), ServerServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVER_EXCEPTION!= null) {
            throw SERVER_EXCEPTION;
        }
        return SERVER_WSDL_LOCATION;
    }

}
