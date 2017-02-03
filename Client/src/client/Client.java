package client;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.ws.WebServiceException;
import serverws.Server;
import serverws.ServerServices;
import ws.Facture;

public class Client {

    private final ClientPanel clientPanel;
    
    public Client(){
        this.clientPanel=new ClientPanel();
        initComponents();
    }
    
    public ClientPanel getClientPanel(){
        return this.clientPanel;
    }
    
    private void initComponents(){
        
        //Search
        clientPanel.getSearchButtonEntre1().addActionListener(e->getFactEntre1());
        clientPanel.getSearchButtonEntre2().addActionListener(e->getFactEntre2());
        clientPanel.getSearchButtonEntre3().addActionListener(e->getFactEntre3());
        
        
        //All
        clientPanel.getAllButtonEntre1().addActionListener(e->getAllFactEntre1());
        clientPanel.getAllButtonEntre2().addActionListener(e->getAllFactEntre2());
        clientPanel.getAllButtonEntre3().addActionListener(e->getAllFactEntre3());
        
        clientPanel.getTabbedPane().addChangeListener(e->changed());
    }
    
    private void calculateTotals(){
        try{
            ServerServices srs=new Server().getServerServicesPort();
            float sumEntre1=srs.getSumFacturesEntre1();
            if(sumEntre1==-3){
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
            }else if(sumEntre1==-1){
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 1 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
            }else if(sumEntre1==-2){
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
            }else{
                clientPanel.getTotalEntr1().setText(String.valueOf(sumEntre1));
            }
            
            float sumEntre2=srs.getSumFacturesEntre2();
            if(sumEntre2==-3){
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
            }else if(sumEntre2==-1){
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 2 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
            }else if(sumEntre2==-2){
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
            }else{
                clientPanel.getTotalEntr2().setText(String.valueOf(sumEntre2));
            }

            float sumEntre3=srs.getSumFacturesEntre3();
            if(sumEntre3==-3){
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
            }else if(sumEntre3==-1){
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 3 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
            }else if(sumEntre3==-2){
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
            }else{
                clientPanel.getTotalEntr3().setText(String.valueOf(sumEntre3));
            }
            
            float sum=srs.getSumTotalFactures();
            if(sum<0){
                clientPanel.getTotal().setText("");
                //ERROR FORMAT: <entNumber><ErrorType> exp: 10 --> entNumber 1 ErrorType 0
                if(sum==-10){
                    JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-11){
                    JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 1 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-12){
                    JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-20){
                    JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-21){
                    JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 2 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-22){
                    JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-30){
                    JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-31){
                    JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 3 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                }else if(sum==-32){
                    JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                clientPanel.getTotal().setText(String.valueOf(sum));
            }
        }catch(WebServiceException ex){
            JOptionPane.showMessageDialog(clientPanel, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void changed(){
        if(clientPanel.getTabbedPane().getSelectedIndex()==3){
            new Thread(()->calculateTotals()).start();
        }
        
        clientPanel.getSearchCodeEntre1().setText("");
        clientPanel.getCodeEntre1().setText("");
        clientPanel.getNomEntre1().setText("");
        clientPanel.getMontantEntre1().setText("");
        
        clientPanel.getSearchCodeEntre2().setText("");
        clientPanel.getCodeEntre2().setText("");
        clientPanel.getNomEntre2().setText("");
        clientPanel.getMontantEntre2().setText("");
        
        clientPanel.getSearchCodeEntre3().setText("");
        clientPanel.getCodeEntre3().setText("");
        clientPanel.getNomEntre3().setText("");
        clientPanel.getMontantEntre3().setText("");
    }
    
    private void getFactEntre1() {
        String codeString=clientPanel.getSearchCodeEntre1().getText();
        if(codeString.isEmpty()){
            clientPanel.getCodeEntre1().setText("");
            clientPanel.getNomEntre1().setText("");
            clientPanel.getMontantEntre1().setText("");
            return;
        }
        int code;
        try{
            code=Integer.parseInt(codeString);
        }catch(NumberFormatException ex){
            clientPanel.getSearchCodeEntre1().setText("");
            clientPanel.getCodeEntre1().setText("");
            clientPanel.getNomEntre1().setText("");
            clientPanel.getMontantEntre1().setText("");
            return;
        }
        try{
            ServerServices srs=new Server().getServerServicesPort();
            Facture f=srs.getFactureEntre1(code);
            if(f==null){
                JOptionPane.showMessageDialog(clientPanel, "Cette facture n'existe pas", "Facture inexistante", JOptionPane.ERROR_MESSAGE);
                clientPanel.getSearchCodeEntre1().setText("");
                clientPanel.getCodeEntre1().setText("");
                clientPanel.getNomEntre1().setText("");
                clientPanel.getMontantEntre1().setText("");
                return;
            }else if(f.getCode()==-1){
                clientPanel.getSearchCodeEntre1().setText("");
                clientPanel.getCodeEntre1().setText("");
                clientPanel.getNomEntre1().setText("");
                clientPanel.getMontantEntre1().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 1 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(f.getCode()==0){
                clientPanel.getSearchCodeEntre1().setText("");
                clientPanel.getCodeEntre1().setText("");
                clientPanel.getNomEntre1().setText("");
                clientPanel.getMontantEntre1().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(f.getCode()==-2){
                clientPanel.getSearchCodeEntre1().setText("");
                clientPanel.getCodeEntre1().setText("");
                clientPanel.getNomEntre1().setText("");
                clientPanel.getMontantEntre1().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                return;
            }
            clientPanel.getCodeEntre1().setText(String.valueOf(f.getCode()));
            clientPanel.getNomEntre1().setText(f.getNom());
            clientPanel.getMontantEntre1().setText(String.valueOf(f.getMontant()));
        }catch(WebServiceException ex){
            clientPanel.getSearchCodeEntre1().setText("");
            clientPanel.getCodeEntre1().setText("");
            clientPanel.getNomEntre1().setText("");
            clientPanel.getMontantEntre1().setText("");
            JOptionPane.showMessageDialog(clientPanel, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void getFactEntre2() {
        String codeString=clientPanel.getSearchCodeEntre2().getText();
        if(codeString.isEmpty()){
            clientPanel.getCodeEntre2().setText("");
            clientPanel.getNomEntre2().setText("");
            clientPanel.getMontantEntre2().setText("");
            return;
        }
        int code;
        try{
            code=Integer.parseInt(codeString);
        }catch(NumberFormatException ex){
            clientPanel.getSearchCodeEntre2().setText("");
            clientPanel.getCodeEntre2().setText("");
            clientPanel.getNomEntre2().setText("");
            clientPanel.getMontantEntre2().setText("");
            return;
        }
        try{
            ServerServices srs=new Server().getServerServicesPort();
            Facture f=srs.getFactureEntre2(code);
            if(f==null){
                JOptionPane.showMessageDialog(clientPanel, "Cette facture n'existe pas", "Facture inexistante", JOptionPane.ERROR_MESSAGE);
                clientPanel.getSearchCodeEntre2().setText("");
                clientPanel.getCodeEntre2().setText("");
                clientPanel.getNomEntre2().setText("");
                clientPanel.getMontantEntre2().setText("");
                return;
            }else if(f.getCode()==-1){
                clientPanel.getSearchCodeEntre2().setText("");
                clientPanel.getCodeEntre2().setText("");
                clientPanel.getNomEntre2().setText("");
                clientPanel.getMontantEntre2().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 2 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(f.getCode()==0){
                clientPanel.getSearchCodeEntre2().setText("");
                clientPanel.getCodeEntre2().setText("");
                clientPanel.getNomEntre2().setText("");
                clientPanel.getMontantEntre2().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(f.getCode()==-2){
                clientPanel.getSearchCodeEntre2().setText("");
                clientPanel.getCodeEntre2().setText("");
                clientPanel.getNomEntre2().setText("");
                clientPanel.getMontantEntre2().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                return;
            }
            clientPanel.getCodeEntre2().setText(String.valueOf(f.getCode()));
            clientPanel.getNomEntre2().setText(f.getNom());
            clientPanel.getMontantEntre2().setText(String.valueOf(f.getMontant()));
        }catch(WebServiceException ex){
            clientPanel.getSearchCodeEntre2().setText("");
            clientPanel.getCodeEntre2().setText("");
            clientPanel.getNomEntre2().setText("");
            clientPanel.getMontantEntre2().setText("");
            JOptionPane.showMessageDialog(clientPanel, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getFactEntre3() {
        String codeString=clientPanel.getSearchCodeEntre3().getText();
        if(codeString.isEmpty()){
            clientPanel.getCodeEntre3().setText("");
            clientPanel.getNomEntre3().setText("");
            clientPanel.getMontantEntre3().setText("");
            return;
        }
        int code;
        try{
            code=Integer.parseInt(codeString);
        }catch(NumberFormatException ex){
            clientPanel.getSearchCodeEntre3().setText("");
            clientPanel.getCodeEntre3().setText("");
            clientPanel.getNomEntre3().setText("");
            clientPanel.getMontantEntre3().setText("");
            return;
        }
        try{
            ServerServices srs=new Server().getServerServicesPort();
            Facture f=srs.getFactureEntre3(code);
            if(f==null){
                JOptionPane.showMessageDialog(clientPanel, "Cette facture n'existe pas", "Facture inexistante", JOptionPane.ERROR_MESSAGE);
                clientPanel.getSearchCodeEntre3().setText("");
                clientPanel.getCodeEntre3().setText("");
                clientPanel.getNomEntre3().setText("");
                clientPanel.getMontantEntre3().setText("");
                return;
            }else if(f.getCode()==-1){
                clientPanel.getSearchCodeEntre3().setText("");
                clientPanel.getCodeEntre3().setText("");
                clientPanel.getNomEntre3().setText("");
                clientPanel.getMontantEntre3().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 3 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(f.getCode()==0){
                clientPanel.getSearchCodeEntre3().setText("");
                clientPanel.getCodeEntre3().setText("");
                clientPanel.getNomEntre3().setText("");
                clientPanel.getMontantEntre3().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(f.getCode()==-2){
                clientPanel.getSearchCodeEntre3().setText("");
                clientPanel.getCodeEntre3().setText("");
                clientPanel.getNomEntre3().setText("");
                clientPanel.getMontantEntre3().setText("");
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                return;
            }
            clientPanel.getCodeEntre3().setText(String.valueOf(f.getCode()));
            clientPanel.getNomEntre3().setText(f.getNom());
            clientPanel.getMontantEntre3().setText(String.valueOf(f.getMontant()));
        }catch(WebServiceException ex){
            clientPanel.getSearchCodeEntre3().setText("");
            clientPanel.getCodeEntre3().setText("");
            clientPanel.getNomEntre3().setText("");
            clientPanel.getMontantEntre3().setText("");
            JOptionPane.showMessageDialog(clientPanel, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getAllFactEntre1() {
        try{
            ServerServices srs=new Server().getServerServicesPort();
            List<Facture> list=srs.getFacturesEntre1();
            if(!list.isEmpty()){
                if(list.get(0).getCode()==-1){
                    clientPanel.getSearchCodeEntre1().setText("");
                    JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 1 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                    return;
                }else if(list.get(0).getCode()==0){
                    JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                    return;
                }else if(list.get(0).getCode()==-2){
                    JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            TablePanel t=new TablePanel(list);
            JOptionPane.showOptionDialog(null, t, "Listes des Factures de l'entreprise 1", 0, JOptionPane.PLAIN_MESSAGE, null, new String[]{"OK"}, "");
        }catch(WebServiceException ex){
            JOptionPane.showMessageDialog(null, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getAllFactEntre2() {
        try{
            ServerServices srs=new Server().getServerServicesPort();
            List<Facture> list=srs.getFacturesEntre2();
            if(list.get(0).getCode()==-1){
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 2 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(list.get(0).getCode()==0){
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(list.get(0).getCode()==-2){
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                return;
            }
            TablePanel t=new TablePanel(list);
            JOptionPane.showOptionDialog(null, t, "Listes des Factures de l'entreprise 2", 0, JOptionPane.PLAIN_MESSAGE, null, new String[]{"OK"}, "");
        }catch(WebServiceException ex){
            JOptionPane.showMessageDialog(null, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getAllFactEntre3() {
        try{
            ServerServices srs=new Server().getServerServicesPort();
            List<Facture> list=srs.getFacturesEntre3();
            if(list.get(0).getCode()==-1){
                JOptionPane.showMessageDialog(clientPanel, "Serveur de l'entreprise 3 est déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(list.get(0).getCode()==0){
                JOptionPane.showMessageDialog(clientPanel, "Exception côté serveur", "Exception", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(list.get(0).getCode()==-2){
                JOptionPane.showMessageDialog(clientPanel, "Erreur d'accès aux données", "Erreur d'accès aux données", JOptionPane.ERROR_MESSAGE);
                return;
            }
            TablePanel t=new TablePanel(list);
            JOptionPane.showOptionDialog(null, t, "Listes des Factures de l'entreprise 3", 0, JOptionPane.PLAIN_MESSAGE, null, new String[]{"OK"}, "");
        }catch(WebServiceException ex){
            JOptionPane.showMessageDialog(clientPanel, "Serveur est peut être déconnecté!", "Erreur d'accès au serveur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
