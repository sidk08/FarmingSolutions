/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRolePanel;

import Business.FarmerData.Farmer;
import Business.FarmerData.HealthData;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthReportRequest;
//import Business.WorkQueue.SoilTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CalculateHealthScorePanel extends javax.swing.JPanel {

    /**
     * Creates new form CalculateSoilPanel
     */
    private JPanel container;
//    private WorkRequest wr;
//    private UserAccount sender;
    private UserAccount receiver;
    private HealthReportRequest hrr;
    public CalculateHealthScorePanel(JPanel container, HealthReportRequest hrr,UserAccount receiver) {
        initComponents();
        this.container = container;
        this.hrr = hrr;
//        this.sender = sender;
        this.receiver = receiver;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        heightText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        temperatureTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        healthScoreTxt = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        descrTxt = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        sendFeedbackBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        bphighTxt = new javax.swing.JTextField();
        sugarTxt = new javax.swing.JTextField();
        bpLowTxt2 = new javax.swing.JTextField();
        weightTxt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculate Health Score");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 510, 50));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("High :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 70, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sugar : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Weight : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Height :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Temperature : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        heightText.setBackground(new java.awt.Color(0, 153, 153));
        heightText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(heightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 590, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 590, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 590, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 140, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 590, 10));

        temperatureTxt.setBackground(new java.awt.Color(0, 153, 153));
        temperatureTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(temperatureTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 590, 50));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 590, 10));

        jTextField3.setBackground(new java.awt.Color(0, 153, 153));
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 590, 50));

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 740, 140, 50));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Health Score : ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 150, 60));

        healthScoreTxt.setBackground(new java.awt.Color(0, 153, 153));
        healthScoreTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        healthScoreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthScoreTxtActionPerformed(evt);
            }
        });
        add(healthScoreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 220, 50));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 220, 20));

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Response :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 170, 60));

        descrTxt.setBackground(new java.awt.Color(0, 153, 153));
        descrTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        descrTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descrTxtActionPerformed(evt);
            }
        });
        add(descrTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 500, 240, 50));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 240, 20));

        sendFeedbackBtn.setBackground(new java.awt.Color(0, 153, 153));
        sendFeedbackBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        sendFeedbackBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendFeedbackBtn.setText("Send Feedback ");
        sendFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendFeedbackBtnActionPerformed(evt);
            }
        });
        add(sendFeedbackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 740, 360, 50));

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Blood Pressure : ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 180, -1));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 140, 10));

        jLabel14.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Low :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 70, -1));

        bphighTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bphighTxtActionPerformed(evt);
            }
        });
        add(bphighTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, 130, 30));

        sugarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugarTxtActionPerformed(evt);
            }
        });
        add(sugarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 560, 30));

        bpLowTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpLowTxt2ActionPerformed(evt);
            }
        });
        add(bpLowTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 106, 130, 30));

        weightTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTxt1ActionPerformed(evt);
            }
        });
        add(weightTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 560, 30));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2010, 940));
    }// </editor-fold>//GEN-END:initComponents

    private void descrTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descrTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descrTxtActionPerformed

    private void sendFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendFeedbackBtnActionPerformed
        // TODO add your handling code here:
        Farmer farmer = hrr.getSender().getPerson().getFarmer();
        int bplow;
        int bphigh;
        int sugar;
        double weight;
        int height;
        double temp; 
        try{
            bplow = Integer.parseInt(bphighTxt.getText());
            bphigh = Integer.parseInt(bphighTxt.getText());
            sugar = Integer.parseInt(sugarTxt.getText());
            weight = Double.parseDouble(sugarTxt.getText());
            height = Integer.parseInt(heightText.getText());
            temp = Double.parseDouble(temperatureTxt.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter Numerical values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String descr = descrTxt.getText().trim();
        
        if(descr.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter reponse", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        HealthData hdata = farmer.addHealthData();
        hdata.setBphigh(bphigh);
        hdata.setBplow(bplow);
        hdata.setSugar(sugar);
        hdata.setHeight(height);
        hdata.setWeight(weight);
        hdata.setTemperature(temp);
        
        
        hdata.calculateHealthScore();
        healthScoreTxt.setText(String.valueOf(hdata.getHealthScore()));
        hrr.setHealthdata(hdata);
        hrr.setStatus("Completed");
        hrr.setReceiver(receiver);
        hrr.setResolveDate(new Date());
        hrr.setResponse(descr);
        
    }//GEN-LAST:event_sendFeedbackBtnActionPerformed

    private void healthScoreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthScoreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthScoreTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorExpert doctorExpert = (DoctorExpert) component;
        doctorExpert.populateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void bphighTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bphighTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bphighTxtActionPerformed

    private void sugarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sugarTxtActionPerformed

    private void bpLowTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpLowTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpLowTxt2ActionPerformed

    private void weightTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bpLowTxt2;
    private javax.swing.JTextField bphighTxt;
    private javax.swing.JTextField descrTxt;
    private javax.swing.JTextField healthScoreTxt;
    private javax.swing.JTextField heightText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton sendFeedbackBtn;
    private javax.swing.JTextField sugarTxt;
    private javax.swing.JTextField temperatureTxt;
    private javax.swing.JTextField weightTxt1;
    // End of variables declaration//GEN-END:variables
}