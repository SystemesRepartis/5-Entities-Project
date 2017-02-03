
package serveur;

import javax.xml.ws.Endpoint;
import serverWS.ServerServices;

public class Serveur {
    public static void main(String[] args) {
        String url="http://localhost:8586/";
        Endpoint.publish(url, new ServerServices());
        System.out.println("Server up and running at "+url);
    }
}
