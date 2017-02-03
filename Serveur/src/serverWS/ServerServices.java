package serverWS;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import si_entr3.rmi.FactureRmiInterface;
import si_entr3.rmi.RmiInterface;
import ws.Facture;
import ws.SIEntr2;
import ws.SIEntre2Services;

@WebService(serviceName = "Server")
public class ServerServices {
    
    //Entreprise 1
    @WebMethod
    public Facture getFactureEntre1(int code){
        String msg="Fact*"+code;
        Facture f=new Facture();
        try{
            DatagramSocket sock=new DatagramSocket();
            byte[] msgBytes=msg.getBytes();
            InetAddress host=InetAddress.getByName("127.0.0.1");
            int port=4547;
            DatagramPacket sendPaquet=new DatagramPacket(msgBytes, msg.length(), host, port);
            sock.send(sendPaquet);
            
            byte[] buff=new byte[6000];
            DatagramPacket receivePaquet=new DatagramPacket(buff, buff.length);
            
            sock.setSoTimeout(1000);
            sock.receive(receivePaquet);
            String received = new String(receivePaquet.getData(), 0, receivePaquet.getLength());
            if(received.isEmpty()){
                return null;
            }else if(received.equals("-2")){
                f.setCode(-2);
                return f;
            }
            StringTokenizer st=new StringTokenizer(received, "#");
            f.setCode(Integer.parseInt(st.nextToken()));
            f.setNom(st.nextToken());
            f.setMontant(Float.parseFloat(st.nextToken()));
            return f;
        }catch(SocketTimeoutException ex){
            Facture fa=new Facture();
            fa.setCode(-1);
            return fa;
        } catch (Exception ex) {
            Facture fa=new Facture();
            fa.setCode(0);
            return fa;
        }
    }
    
    @WebMethod
    public List<Facture> getFacturesEntre1(){
        String msg="AllFact";
        List<Facture> fcts=new ArrayList<Facture>();
        try{
            DatagramSocket sock=new DatagramSocket();
            byte[] msgBytes=msg.getBytes();
            InetAddress host=InetAddress.getByName("127.0.0.1");
            int port=4547;
            DatagramPacket sendPaquet=new DatagramPacket(msgBytes, msg.length(), host, port);
            sock.send(sendPaquet);
            
            byte[] buff=new byte[6000];
            DatagramPacket receivePaquet=new DatagramPacket(buff, buff.length);
            
            sock.setSoTimeout(1000);
            while(true){
                sock.receive(receivePaquet);
                String received = new String(receivePaquet.getData(), 0, receivePaquet.getLength());
                if(received.isEmpty()){
                    return fcts;
                }else if(received.equals("-2")){
                    Facture fa=new Facture();
                    fa.setCode(-2);
                    List<Facture> l=new ArrayList<Facture>();
                    l.add(fa);
                    return l;
                }else if(received.equals("end")){
                    break;
                }
                StringTokenizer st=new StringTokenizer(received, "#");
                Facture f=new Facture();
                f.setCode(Integer.parseInt(st.nextToken()));
                f.setNom(st.nextToken());
                f.setMontant(Float.parseFloat(st.nextToken()));
                fcts.add(f);
            }
            return fcts;
        }catch(SocketTimeoutException ex){
            Facture fa=new Facture();
            fa.setCode(-1);
            List<Facture> l=new ArrayList<Facture>();
            l.add(fa);
            return l;
        }catch(Exception e){
            Facture fa=new Facture();
            fa.setCode(0);
            List<Facture> l=new ArrayList<Facture>();
            l.add(fa);
            return l;
        }
    }
    
    @WebMethod
    public float getSumFacturesEntre1(){
        List<Facture> fcts=getFacturesEntre1();
        if(fcts.get(0).getCode()==-2){
            return -2;
        }else if(fcts.get(0).getCode()==-1){
            return -1;
        }else if(fcts.get(0).getCode()==0){
            return -3;
        }
        float s=0;
        for(Facture f : fcts){
            s+=f.getMontant();
        }
        return s;
    }
    
    //Entreprise 2
    @WebMethod
    public Facture getFactureEntre2(int code){
        try{
            SIEntre2Services entre2Stub=new SIEntr2().getSIEntre2ServicesPort();
            return entre2Stub.getFacture(code);
        }catch(WebServiceException ex){
            Facture f=new Facture();
            f.setCode(-1);
            return f;
        }
    }
    
    @WebMethod
    public List<Facture> getFacturesEntre2(){
        try{
            SIEntre2Services entre2Stub=new SIEntr2().getSIEntre2ServicesPort();
            return entre2Stub.getFactures();
        }catch(WebServiceException ex){
            Facture f=new Facture();
            f.setCode(-1);
            List<Facture> l=new ArrayList<Facture>();
            l.add(f);
            return l;
        }
    }
    
    @WebMethod
    public float getSumFacturesEntre2(){
        List<Facture> fcts=getFacturesEntre2();
        if(fcts.get(0).getCode()==-2){
            return -2;
        }else if(fcts.get(0).getCode()==-1){
            return -1;
        }else if(fcts.get(0).getCode()==0){
            return -3;
        }
        float s=0;
        for(Facture f : fcts){
            s+=f.getMontant();
        }
        return s;
    }
    
    //Entreprise 3
    @WebMethod
    public Facture getFactureEntre3(int code){
        try {
            if (System.getSecurityManager() == null) {   
                System.setSecurityManager(new SecurityManager());
            }
            RmiInterface entre3Stub=(RmiInterface) Naming.lookup("rmi://localhost:1099/SIEntr3");
            FactureRmiInterface f=entre3Stub.getFacture(code);
            if(f!=null){
                Facture fact=new Facture();
                fact.setCode(f.getCode());
                fact.setNom(f.getNom());
                fact.setMontant(f.getMontant());
                return fact;
            }
            return null;
        }catch (ConnectException ex){
            Facture f=new Facture();
            f.setCode(-1);
            return f;
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Facture f=new Facture();
            f.setCode(0);
            return f;
        }
    }
    
    @WebMethod
    public List<Facture> getFacturesEntre3(){
        try {
            if (System.getSecurityManager() == null) {   
                System.setSecurityManager(new SecurityManager());
            }
            RmiInterface entre3Stub=(RmiInterface) Naming.lookup("rmi://localhost:1099/SIEntr3");
            List<Facture> facts=new ArrayList<Facture>();
            List<FactureRmiInterface> factsI=entre3Stub.getFactures();
            for(FactureRmiInterface f : factsI){
                Facture fact=new Facture();
                fact.setCode(f.getCode());
                fact.setNom(f.getNom());
                fact.setMontant(f.getMontant());
                facts.add(fact);
            }
            return facts;
        }catch(ConnectException ex){
            Facture f=new Facture();
            f.setCode(-1);
            List<Facture> l=new ArrayList<Facture>();
            l.add(f);
            return l;
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Facture f=new Facture();
            f.setCode(0);
            List<Facture> l=new ArrayList<Facture>();
            l.add(f);
            return l;
        }
    }
    
    @WebMethod
    public float getSumFacturesEntre3(){
        List<Facture> fcts=getFacturesEntre3();
        if(fcts.get(0).getCode()==-2){
            return -2;
        }else if(fcts.get(0).getCode()==-1){
            return -1;
        }else if(fcts.get(0).getCode()==0){
            return -3;
        }
        float s=0;
        for(Facture f : fcts){
            s+=f.getMontant();
        }
        return s;
    }
    
    //TOTAL
    @WebMethod
    public float getSumTotalFactures(){
        float sumFacutreEntre1=getSumFacturesEntre1();
        float sumFacutreEntre2=getSumFacturesEntre2();
        float sumFacutreEntre3=getSumFacturesEntre3();
        if(sumFacutreEntre1==-1){
            return -11;
        }else if(sumFacutreEntre2==-1){
            return -21;
        }else if(sumFacutreEntre3==-1){
            return -31;
        }else if(sumFacutreEntre1==-2){
            return -12;
        }else if(sumFacutreEntre2==-2){
            return -22;
        }else if(sumFacutreEntre3==-2){
            return -32;
        }else if(sumFacutreEntre1==-3){
            return -10;
        }else if(sumFacutreEntre2==-3){
            return -20;
        }else if(sumFacutreEntre3==-3){
            return -30;
        }
        return sumFacutreEntre1+sumFacutreEntre2+sumFacutreEntre3;
    }
}
