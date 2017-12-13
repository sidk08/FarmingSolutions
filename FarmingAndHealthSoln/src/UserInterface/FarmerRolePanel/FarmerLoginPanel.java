/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRolePanel;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Enterprise.Enterprise;
import Business.FarmerData.Farmer;
import Business.Network.Network;
import Business.Organization.ExpertOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ExpertRolePanel.FarmerDetailsInformationJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FarmerLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerLoginPanel
     */
    JPanel container;
    EcoSystem system;
    
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    private Farmer farmer;
    private Person person;
    private UserAccount account;
    

    public FarmerLoginPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = business;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsoilProfile = new javax.swing.JButton();
        btnConsultDoctor = new javax.swing.JButton();
        btnConsultAgricul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsoilProfile.setBackground(new java.awt.Color(0, 153, 153));
        btnsoilProfile.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnsoilProfile.setText("Soil Profile ");
        btnsoilProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsoilProfileActionPerformed(evt);
            }
        });
        add(btnsoilProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 530, 60));

        btnConsultDoctor.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultDoctor.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnConsultDoctor.setText(" Consult Doctor");
        btnConsultDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultDoctorActionPerformed(evt);
            }
        });
        add(btnConsultDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 530, 60));

        btnConsultAgricul.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultAgricul.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnConsultAgricul.setText("Consult  Agricultural Expert");
        btnConsultAgricul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultAgriculActionPerformed(evt);
            }
        });
        add(btnConsultAgricul, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 530, 60));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Farmer Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 530, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1670, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsoilProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsoilProfileActionPerformed
        // TODO add your handling code here:
        FarmerDetailsInformationJPanel manageEnterpriseAdminJPanel = new FarmerDetailsInformationJPanel(container,account, organization,enterprise,system,farmer);
        container.add("FarmerDetailsInformationJPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnsoilProfileActionPerformed

    private void btnConsultDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultDoctorActionPerformed
        // TODO add your handling code here:
        
        FarmerDocRequestPanel docRequest = new FarmerDocRequestPanel(container, account, organization, enterprise, network, system);
        container.add("FarmerDocRequestPanel", docRequest);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
       
    }//GEN-LAST:event_btnConsultDoctorActionPerformed

    private void btnConsultAgriculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultAgriculActionPerformed
        // TODO add your handling code here:
         FarmerRequestPanel manageEnterpriseAdminJPanel = new FarmerRequestPanel(container,account,organization,enterprise,system,farmer);
        container.add("FarmerRequestPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnConsultAgriculActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultAgricul;
    private javax.swing.JButton btnConsultDoctor;
    private javax.swing.JButton btnsoilProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
