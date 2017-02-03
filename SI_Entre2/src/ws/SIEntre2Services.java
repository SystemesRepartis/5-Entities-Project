package ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "SI_Entr2")
public class SIEntre2Services {
    
    private Connection connexion;
    
    public SIEntre2Services(Connection connexion){
        this.connexion=connexion;
    }
    
    @WebMethod
    public List<Facture> getFactures(){
        try {
            PreparedStatement ps=connexion.prepareStatement("select * from facture");
            ResultSet rs=ps.executeQuery();
            List<Facture> fcts=new ArrayList<Facture>();
            while(rs.next()){
                fcts.add(new Facture(rs.getInt("code"), rs.getString("nom"), rs.getFloat("montant")));
            }
            return fcts;
        } catch (SQLException ex) {
            Facture f=new Facture();
            f.setCode(-2);
            List<Facture> l=new ArrayList<Facture>();
            l.add(f);
            return l;
        }
    }
    
    @WebMethod
    public Facture getFacture(int code){
        try {
            PreparedStatement ps=connexion.prepareStatement("select * from facture where code=?");
            ps.setInt(1, code);
            ResultSet rs=ps.executeQuery();
            if(!rs.next()){
                return null;
            }
            return new Facture(rs.getInt("code"), rs.getString("nom"), rs.getFloat("montant"));
        } catch (SQLException ex) {
            Facture f=new Facture();
            f.setCode(-2);
            return f;
        }
    }
}
