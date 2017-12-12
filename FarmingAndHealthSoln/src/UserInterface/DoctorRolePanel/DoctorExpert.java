/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRolePanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthReportRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */

public class DoctorExpert extends javax.swing.JPanel {

    /**
     * Creates new form DoctorExpert
     */
    private JPanel container; 
    private EcoSystem system;
    private UserAccount account; 
    private Organization organization; 
    private Enterprise enterprise;
    public DoctorExpert() {
        initComponents();
        
    }

    public DoctorExpert(JPanel container, EcoSystem system, UserAccount account, 
                        Organization organization, Enterprise enterprise) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.container = container;
        this.system = system;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        
        populateTable();

//        ImageIcon icon = new ImageIcon(fileNm);
//         pic.setSize(jPanel1.getMaximumSize());
//         System.out.println(jPanel1.getPreferredSize());
        ImageIcon icon;
        icon = new ImageIcon(new ImageIcon("E:\\AED_Work\\FarmingAndHealthSoln\\src\\UserInterface\\crop-imagecopy2.jpg").getImage().getScaledInstance(1980,1080 , Image.SCALE_DEFAULT));
        pic.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        viewDetailsBtn = new javax.swing.JButton();
        healthCheckBtn = new javax.swing.JButton();
        assignBtn = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Health Check anad Reports");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 550, 60));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please Select famer and calculates its Health core as per symptoms given by Farmer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 950, 40));

        requestTable.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Farmer Id", "Status", "Health Score", "Feedback"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 1240, 410));

        viewDetailsBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewDetailsBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 830, 260, 60));

        healthCheckBtn.setBackground(new java.awt.Color(0, 153, 153));
        healthCheckBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        healthCheckBtn.setForeground(new java.awt.Color(255, 255, 255));
        healthCheckBtn.setText("Health Check");
        healthCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthCheckBtnActionPerformed(evt);
            }
        });
        jPanel1.add(healthCheckBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 830, 340, 60));

        assignBtn.setBackground(new java.awt.Color(0, 153, 153));
        assignBtn.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("Assign To Me");
        jPanel1.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 830, 250, 60));

        pic.setText("jLabel3");
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 970));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void healthCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthCheckBtnActionPerformed
        // TODO add your handling code here:
        
        int rowSelect = requestTable.getSelectedRow();
        
        if(rowSelect >= 0){
            HealthReportRequest hrr = (HealthReportRequest)requestTable.getValueAt(rowSelect, 3);
            if(!hrr.getStatus().equalsIgnoreCase("Completed")){
            CalculateHealthScorePanel healthPanel = new CalculateHealthScorePanel(container,hrr, account);
            CardLayout layout = (CardLayout)container.getLayout();
            container.add("workpanel", healthPanel);
            layout.next(container);
            }
            else{
                JOptionPane.showMessageDialog(this, "Request already responded", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Please  select row", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_healthCheckBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton healthCheckBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pic;
    private javax.swing.JTable requestTable;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        
       Iterator<WorkRequest> it = organization.getWorkQueue().getWorkRequestList().iterator(); 
        while(it.hasNext()) {
            HealthReportRequest hrr =(HealthReportRequest) it.next();
            row[0] = hrr.getSender().getPerson();
            row[1] = hrr.getSender().getPerson().getLastName();
            row[2] = hrr.getSender().getPerson().getId();
            row[3] = hrr;
            row[4] = hrr.getHealthdata() == null ? 0.0 : hrr.getHealthdata().getHealthScore();
            row[5] = hrr.getMessage();
            model.addRow(row);
        }
    }
}
