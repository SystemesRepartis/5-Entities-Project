
package si_entr3.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RmiInterface extends Remote{
    public List<FactureRmiInterface> getFactures()throws RemoteException;
    public FactureRmiInterface getFacture(int code) throws RemoteException;
}
