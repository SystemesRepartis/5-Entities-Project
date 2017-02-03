/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ClientPanel extends javax.swing.JPanel {

    public ClientPanel() {
        initComponents();
    }

    public JTextField getTotal() {
        return total;
    }

    public JTextField getTotalEntr1() {
        return totalEntr1;
    }

    public JTextField getTotalEntr2() {
        return totalEntr2;
    }

    public JTextField getTotalEntr3() {
        return totalEntr3;
    }
    
    public JTabbedPane getTabbedPane(){
        return tabbedPane;
    }

    public JButton getAllButtonEntre1() {
        return allButtonEntre1;
    }

    public JButton getAllButtonEntre2() {
        return allButtonEntre2;
    }

    public JButton getAllButtonEntre3() {
        return allButtonEntre3;
    }

    public JTextField getCodeEntre1() {
        return codeEntre1;
    }

    public JTextField getCodeEntre2() {
        return codeEntre2;
    }

    public JTextField getCodeEntre3() {
        return codeEntre3;
    }

    public JTextField getMontantEntre1() {
        return montantEntre1;
    }

    public JTextField getMontantEntre2() {
        return montantEntre2;
    }

    public JTextField getMontantEntre3() {
        return montantEntre3;
    }

    public JTextField getNomEntre1() {
        return nomEntre1;
    }

    public JTextField getNomEntre2() {
        return nomEntre2;
    }

    public JTextField getNomEntre3() {
        return nomEntre3;
    }

    public JButton getSearchButtonEntre1() {
        return searchButtonEntre1;
    }

    public JButton getSearchButtonEntre2() {
        return searchButtonEntre2;
    }

    public JButton getSearchButtonEntre3() {
        return searchButtonEntre3;
    }

    public JTextField getSearchCodeEntre1() {
        return searchCodeEntre1;
    }

    public JTextField getSearchCodeEntre2() {
        return searchCodeEntre2;
    }

    public JTextField getSearchCodeEntre3() {
        return searchCodeEntre3;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        searchCodeEntre1 = new javax.swing.JTextField();
        searchButtonEntre1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        codeEntre1 = new javax.swing.JTextField();
        nomEntre1 = new javax.swing.JTextField();
        montantEntre1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        allButtonEntre1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchCodeEntre2 = new javax.swing.JTextField();
        searchButtonEntre2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codeEntre2 = new javax.swing.JTextField();
        nomEntre2 = new javax.swing.JTextField();
        montantEntre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        allButtonEntre2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        searchCodeEntre3 = new javax.swing.JTextField();
        searchButtonEntre3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        codeEntre3 = new javax.swing.JTextField();
        nomEntre3 = new javax.swing.JTextField();
        montantEntre3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        allButtonEntre3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        totalEntr1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        totalEntr2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        totalEntr3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entreprise 1"));

        searchCodeEntre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        searchButtonEntre1.setText("Trouver Facture");
        searchButtonEntre1.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Code Facture");

        codeEntre1.setEditable(false);
        codeEntre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        nomEntre1.setEditable(false);
        nomEntre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        montantEntre1.setEditable(false);
        montantEntre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Code");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Montant");

        allButtonEntre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        allButtonEntre1.setText("Tous les Factures");
        allButtonEntre1.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(searchCodeEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(searchButtonEntre1)
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(codeEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nomEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(montantEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(allButtonEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCodeEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButtonEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(codeEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montantEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allButtonEntre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Entreprise 1", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entreprise 2"));

        searchCodeEntre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        searchButtonEntre2.setText("Trouver Facture");
        searchButtonEntre2.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Code Facture");

        codeEntre2.setEditable(false);
        codeEntre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        nomEntre2.setEditable(false);
        nomEntre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        montantEntre2.setEditable(false);
        montantEntre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Code");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Nom");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Montant");

        allButtonEntre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        allButtonEntre2.setText("Tous les Factures");
        allButtonEntre2.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addComponent(searchCodeEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(searchButtonEntre2)
                .addGap(144, 144, 144)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(codeEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nomEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(montantEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(allButtonEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCodeEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButtonEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(codeEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montantEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allButtonEntre2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Enterprise 2", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Entreprise 2"));

        searchCodeEntre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        searchButtonEntre3.setText("Trouver Facture");
        searchButtonEntre3.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Code Facture");

        codeEntre3.setEditable(false);
        codeEntre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        nomEntre3.setEditable(false);
        nomEntre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        montantEntre3.setEditable(false);
        montantEntre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Code");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Nom");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Montant");

        allButtonEntre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        allButtonEntre3.setText("Tous les Factures");
        allButtonEntre3.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(19, 19, 19)
                .addComponent(searchCodeEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(searchButtonEntre3)
                .addGap(144, 144, 144)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(codeEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(nomEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(montantEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(allButtonEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCodeEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButtonEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(codeEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montantEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allButtonEntre3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Enterprise 3", jPanel4);

        totalEntr1.setEditable(false);
        totalEntr1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Total Entreprise 1");

        totalEntr2.setEditable(false);
        totalEntr2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Total Entreprise 2");

        totalEntr3.setEditable(false);
        totalEntr3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Total Entreprise 3");

        total.setEditable(false);
        total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setText("Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addGap(19, 19, 19)
                .addComponent(totalEntr1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(jLabel18)
                .addGap(19, 19, 19)
                .addComponent(totalEntr2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(19, 19, 19)
                .addComponent(totalEntr3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(37, 37, 37)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalEntr1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(totalEntr2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(totalEntr3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(20, 20, 20))
        );

        tabbedPane.addTab("Total", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allButtonEntre1;
    private javax.swing.JButton allButtonEntre2;
    private javax.swing.JButton allButtonEntre3;
    private javax.swing.JTextField codeEntre1;
    private javax.swing.JTextField codeEntre2;
    private javax.swing.JTextField codeEntre3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField montantEntre1;
    private javax.swing.JTextField montantEntre2;
    private javax.swing.JTextField montantEntre3;
    private javax.swing.JTextField nomEntre1;
    private javax.swing.JTextField nomEntre2;
    private javax.swing.JTextField nomEntre3;
    private javax.swing.JButton searchButtonEntre1;
    private javax.swing.JButton searchButtonEntre2;
    private javax.swing.JButton searchButtonEntre3;
    private javax.swing.JTextField searchCodeEntre1;
    private javax.swing.JTextField searchCodeEntre2;
    private javax.swing.JTextField searchCodeEntre3;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalEntr1;
    private javax.swing.JTextField totalEntr2;
    private javax.swing.JTextField totalEntr3;
    // End of variables declaration//GEN-END:variables

}
