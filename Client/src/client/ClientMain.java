package client;

import java.awt.Dimension;
import javax.swing.JFrame;

public class ClientMain {
    
    public static void main(String[] args) {
        JFrame frame=new JFrame("Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension d=new Dimension(1076, 250);
        frame.setPreferredSize(d);
        frame.setMaximumSize(d);
        frame.setMinimumSize(d);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        frame.add(new Client().getClientPanel());
        frame.setVisible(true);
    }
}
