
package serveur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.xml.ws.Endpoint;
import ws.SIEntre2Services;


public class SIEntr2Main {
    
    static Connection makeConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Connection to localhost:3306
            String url = "jdbc:mysql://localhost:3306/SIEntre2";
            String user = "root";
            String mdp="";
            
            return DriverManager.getConnection(url, user, mdp);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String url="http://localhost:8585/";
        Endpoint.publish(url, new SIEntre2Services(makeConnection()));
        System.out.println("Server up and running at "+url);
    }
}
