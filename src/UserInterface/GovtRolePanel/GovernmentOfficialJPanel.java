/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovtRolePanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Aastha
 */
public class GovernmentOfficialJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentOfficialJPanel
     */
    private JPanel container;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    private EcoSystem system;
    public GovernmentOfficialJPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analyseSoil = new javax.swing.JButton();
        analyseHealth = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        analyseSoil.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        analyseSoil.setText("Analyse Soil Data");
        analyseSoil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyseSoilActionPerformed(evt);
            }
        });
        add(analyseSoil);
        analyseSoil.setBounds(440, 270, 320, 40);

        analyseHealth.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        analyseHealth.setText("Analyse Health Data");
        analyseHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyseHealthActionPerformed(evt);
            }
        });
        add(analyseHealth);
        analyseHealth.setBounds(440, 430, 320, 40);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -4, 1330, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void analyseSoilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyseSoilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analyseSoilActionPerformed

    private void analyseHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyseHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analyseHealthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyseHealth;
    private javax.swing.JButton analyseSoil;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}