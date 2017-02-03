package si_entr3.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RmiMain {
    
    static Connection makeConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Connection to localhost:3306
            String url = "jdbc:mysql://localhost:3306/SIEntre3";
            String user = "root";
            String mdp="";
            return DriverManager.getConnection(url, user, mdp);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args){
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("SIEntr3", new Rmi(makeConnection()));
            System.out.println("Si Entr3 is up and ready...");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(RmiMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
