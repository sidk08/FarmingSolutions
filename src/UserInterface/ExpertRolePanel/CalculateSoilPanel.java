/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ExpertRolePanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FarmerData.SoilData;
import Business.Organization.ExpertOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class CalculateSoilPanel extends javax.swing.JPanel {

private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private ExpertOrganization expertorganization; 
    private Enterprise enterprise;
    private Organization farmerorganisation;
    private WorkRequest  workrequest; 
    AgriculturalExpert agriExpert;
    //private SoilData soildata;
    
     CalculateSoilPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, WorkRequest request) {
       
        initComponents();
        this.container = container;
        this.account = account;
     //  this.expertorganization = (ExpertOrganization) organization;
        this.enterprise = enterprise;
        this.system = system;

   //     agriExpert = new AgriculturalExpert(container, account,organization,enterprise,system);
        this.farmerorganisation = organization;
       this.workrequest = request;
       
       
       //this.lblSoilType.setText(account.getPerson().getFarmer().addSoilData());
   //his.soildata = this.account.getPerson().getFarmer().addSoilData();   

    
//lblSoilType.setText(soildata.getTypeOfLand());

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSoilType = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNitrogen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtLeed = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPotassim = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtCalcium = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPHVale = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtDescripation = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btnSoilScore = new javax.swing.JButton();
        btnSendFeedback = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        txtPhosporous = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Check Soil Contents , Nutrient  ands its minerals :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 780, 50));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Soil Type : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 140, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("% Nitrogen: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("%Phosphorous");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        lblSoilType.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblSoilType.setForeground(new java.awt.Color(51, 51, 51));
        add(lblSoilType, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 590, 50));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel8.setText("%Potassium");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel9.setText("%Leed");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        txtNitrogen.setBackground(new java.awt.Color(240, 240, 240));
        txtNitrogen.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtNitrogen.setForeground(new java.awt.Color(51, 51, 51));
        txtNitrogen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtNitrogen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 590, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 590, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 590, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 590, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 590, 10));

        txtLeed.setBackground(new java.awt.Color(240, 240, 240));
        txtLeed.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtLeed.setForeground(new java.awt.Color(51, 51, 51));
        txtLeed.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeedActionPerformed(evt);
            }
        });
        add(txtLeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 590, 50));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 590, 10));

        txtPotassim.setBackground(new java.awt.Color(240, 240, 240));
        txtPotassim.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPotassim.setForeground(new java.awt.Color(51, 51, 51));
        txtPotassim.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPotassim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotassimActionPerformed(evt);
            }
        });
        add(txtPotassim, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 590, 50));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 590, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 590, 10));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel10.setText("%Calcium,Magnesium");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 230, 60));

        txtCalcium.setBackground(new java.awt.Color(240, 240, 240));
        txtCalcium.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtCalcium.setForeground(new java.awt.Color(51, 51, 51));
        txtCalcium.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtCalcium, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 600, 50));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 600, 10));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 840, 110, 50));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel11.setText("PH Value of Soil");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 710, 230, 60));

        txtPHVale.setBackground(new java.awt.Color(240, 240, 240));
        txtPHVale.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPHVale.setForeground(new java.awt.Color(51, 51, 51));
        txtPHVale.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtPHVale, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 720, 250, 50));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 770, 210, 10));

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel12.setText("Descripation : ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 720, 230, 60));

        txtDescripation.setBackground(new java.awt.Color(240, 240, 240));
        txtDescripation.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtDescripation.setForeground(new java.awt.Color(51, 51, 51));
        txtDescripation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDescripation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripationActionPerformed(evt);
            }
        });
        add(txtDescripation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 730, 250, 50));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 780, 210, 10));

        btnSoilScore.setBackground(new java.awt.Color(0, 153, 153));
        btnSoilScore.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSoilScore.setText("Calculate Soil Score ");
        btnSoilScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoilScoreActionPerformed(evt);
            }
        });
        add(btnSoilScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, 370, 70));

        btnSendFeedback.setBackground(new java.awt.Color(0, 153, 153));
        btnSendFeedback.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSendFeedback.setText("Send Feedback ");
        btnSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFeedbackActionPerformed(evt);
            }
        });
        add(btnSendFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 830, 370, 50));

        jTextField7.setBackground(new java.awt.Color(0, 153, 153));
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 590, 50));

        jTextField8.setBackground(new java.awt.Color(0, 153, 153));
        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 590, 50));

        txtPhosporous.setBackground(new java.awt.Color(240, 240, 240));
        txtPhosporous.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPhosporous.setForeground(new java.awt.Color(51, 51, 51));
        txtPhosporous.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPhosporous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhosporousActionPerformed(evt);
            }
        });
        add(txtPhosporous, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 590, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 2090, 940));
    }// </editor-fold>//GEN-END:initComponents


    
    private void txtDescripationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripationActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtDescripationActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void txtPhosporousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhosporousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhosporousActionPerformed

    private void txtLeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLeedActionPerformed

    private void btnSoilScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoilScoreActionPerformed
        // TODO add your handling code here:
          try {

            if (this.txtNitrogen.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter value of nitrogen");

            } 
            else if (this.txtPhosporous.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of phosphoris");

            }else if (this.txtPotassim.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of potassium");

            }else if (this.txtLeed.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of leed");

            }else if (this.txtCalcium.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "Please enter name value of Calcium and Maganasium");

            }
            else {

        SoilData soildata = account.getPerson().getFarmer().addSoilData();
        //soildata.setCropPlanted(this.txt.getText());
        
        soildata.setNitroValue(Double.parseDouble(this.txtNitrogen.getText()));
        soildata.setPhosphorValue(Double.parseDouble(this.txtPhosporous.getText()));
        soildata.setPotassiumValue(Double.parseDouble(this.txtCalcium.getText()));
        soildata.setWaterValue(Double.parseDouble(this.txtPotassim.getText()));
       
        
        
          CalculateRandomNumber();
                //JOptionPane.showMessageDialog(null, "Information saved Success Fully");

            }

        } catch (Exception e) {
            System.out.println("exception" + e);
            JOptionPane.showMessageDialog(null, "Please enter above information in correct format");
        }
        
        
    }//GEN-LAST:event_btnSoilScoreActionPerformed
 public void CalculateRandomNumber(){
     
     float random = (float) (Math.random() * 10.0 + 0.0);
    this.txtPHVale.setText(String.valueOf(random));
    
  
 }
    
    private void txtPotassimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotassimActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtPotassimActionPerformed

    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed
        // TODO add your handling code here:
        
        
            String message = txtDescripation.getText().trim();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Description message", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        workrequest.setStatus("Completed");
        workrequest.setResponse(this.txtPHVale.getText() + this.txtDescripation.getText());
        
        
        account.getPerson().getFarmer().getSoilDataList().get(0).setIsSoilScore(this.txtPHVale.getText());


//         AgriculturalExpert manageEnterpriseAdminJPanel = new AgriculturalExpert(container,account,farmerorganisation, enterprise ,system);
//        container.add("AgriculturalExpert", manageEnterpriseAdminJPanel);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container);
//        
        
      //  agriExpert.populateFarmerList();

        
    }//GEN-LAST:event_btnSendFeedbackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton2ActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendFeedback;
    private javax.swing.JButton btnSoilScore;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblSoilType;
    private javax.swing.JTextField txtCalcium;
    private javax.swing.JTextField txtDescripation;
    private javax.swing.JTextField txtLeed;
    private javax.swing.JTextField txtNitrogen;
    private javax.swing.JTextField txtPHVale;
    private javax.swing.JTextField txtPhosporous;
    private javax.swing.JTextField txtPotassim;
    // End of variables declaration//GEN-END:variables
}

