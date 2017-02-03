package si_entr3.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactureRmi extends UnicastRemoteObject implements FactureRmiInterface{
    private int code;
    private String nom;
    private float montant;
    
    public FactureRmi() throws RemoteException{
        super();
    }
    
    public FactureRmi(int code, String nom, float montant) throws RemoteException{
        super();
        this.code=code;
        this.nom=nom;
        this.montant=montant;
    }

    @Override
    public int getCode() throws RemoteException{
        return code;
    }

    @Override
    public void setCode(int code) throws RemoteException{
        this.code = code;
    }

    @Override
    public String getNom() throws RemoteException{
        return nom;
    }

    @Override
    public void setNom(String nom) throws RemoteException{
        this.nom = nom;
    }

    @Override
    public float getMontant() throws RemoteException{
        return montant;
    }

    @Override
    public void setMontant(float montant) throws RemoteException{
        this.montant = montant;
    }
    
    
}
