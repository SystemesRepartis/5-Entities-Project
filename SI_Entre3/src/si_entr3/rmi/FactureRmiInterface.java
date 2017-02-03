package si_entr3.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactureRmiInterface extends Remote{
    public void setCode(int code) throws RemoteException;
    public void setNom(String nom) throws RemoteException;
    public void setMontant(float montant) throws RemoteException;
    public int getCode() throws RemoteException;
    public String getNom() throws RemoteException;
    public float getMontant() throws RemoteException;
}
