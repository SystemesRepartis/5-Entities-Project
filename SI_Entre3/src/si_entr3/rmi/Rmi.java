package si_entr3.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Rmi extends UnicastRemoteObject implements RmiInterface{

    private Connection connexion;
    
    public Rmi(Connection connexion) throws RemoteException{
        super();
        this.connexion=connexion;
    }

    @Override
    public List<FactureRmiInterface> getFactures() throws RemoteException {
        try{
            PreparedStatement pr=connexion.prepareStatement("select * from facture");
            ResultSet rs=pr.executeQuery();
            List<FactureRmiInterface> fcts=new ArrayList<FactureRmiInterface>(); 
            while(rs.next()){
                fcts.add(new FactureRmi(rs.getInt("code"), rs.getString("nom"), rs.getFloat("montant")));
            }
            return fcts;
        }catch(SQLException ex){
            FactureRmi f=new FactureRmi();
            f.setCode(-2);
            List<FactureRmiInterface> l=new ArrayList<FactureRmiInterface>();
            l.add(f);
            return l;
        }
    }

    @Override
    public FactureRmiInterface getFacture(int code) throws RemoteException {
        try{
            PreparedStatement pr=connexion.prepareStatement("select * from facture where code=?");
            pr.setInt(1, code);
            ResultSet rs=pr.executeQuery();
            if(!rs.next()){
                return null;
            }
            return new FactureRmi(rs.getInt("code"), rs.getString("nom"), rs.getFloat("montant"));
        }catch(SQLException ex){
            FactureRmi f=new FactureRmi();
            f.setCode(-2);
            return f;
        }
    }
}
