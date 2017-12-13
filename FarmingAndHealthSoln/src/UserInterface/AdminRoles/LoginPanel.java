/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRoles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Utilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
 
    JPanel container;
    JPanel leftpanel;
    EcoSystem system;
    Network ntwrk;
      JLabel text1 = new JLabel("Enter UserName");
    
    public LoginPanel() {
        initComponents();
        
    }

    public LoginPanel(JPanel userProcessContainer, EcoSystem system,JPanel leftpanel) {
    initComponents();
    
    this.container = userProcessContainer;
    this.system = system;
    this.leftpanel = leftpanel;
//    Component[] comp = leftpanel.getComponents();
    for(Component comp : leftpanel.getComponents()){
        if(comp instanceof JButton){
            JButton btn = (JButton)comp;
            if(btn.getText().equalsIgnoreCase("logout")){
                btn.setEnabled(true);
            }
            if(btn.getText().equalsIgnoreCase("login")){
                btn.setEnabled(false);
            }
        }
    }
      
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.setBackground(new java.awt.Color(240, 240, 240));
        txtUserName.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtUserName.setText("Enter Username");
        txtUserName.setToolTipText("hkjhkj");
        txtUserName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 221, 400, 40));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Password :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 130, 50));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("User Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 50));

        txtPassword.setBackground(new java.awt.Color(240, 240, 240));
        txtPassword.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 400, 40));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 190, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 268, 410, -1));

        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setMaximumSize(new java.awt.Dimension(48, 48));
        jLabel2.setMinimumSize(new java.awt.Dimension(48, 48));
        jLabel2.setPreferredSize(new java.awt.Dimension(48, 48));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 40, 40));
        add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 770));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 410, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2050, 1490));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        // TODO add your handling code here:
        txtUserName.setText("");
         this.jSeparator1.setBackground(Color.BLACK);
            this.jSeparator2.setBackground(Color.BLACK);
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        if(txtUserName.getText().isEmpty()){
            
            text1.setVisible(true);
            //txtUserName.setText("sajfafas");
        }else{
            
            text1.setVisible(false);
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
//        shakeButton();
        String userName = txtUserName.getText();
       // Get Password
       char[] passwordCharArray = txtPassword.getPassword();
       String password = String.valueOf(passwordCharArray);

       //Step1: Check in the system user account directory if you have the user
       
       UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
       Enterprise inEnterprise = null;
       Organization inOrganization = null;
       if (userAccount == null) {
           //Step2: Go inside each network to check each enterprise
           for (Network network : system.getNetworkList()) {
               //Step 2-a: Check against each enterprise
               for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                   userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                   if (userAccount == null) {
                       //Step3: Check against each organization inside that enterprise
                       for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                           userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                           
                           if (userAccount != null) {
                           //    System.out.println("organi"+ organization.getName());
                               inEnterprise = enterprise;
                               inOrganization = organization;
                               ntwrk = network;
                               break;
                           }
                       }
                   } else {
                       inEnterprise = enterprise;
                       break;
                   }
                   if (inOrganization != null) {
                       break;
                   }
               }
               if (inEnterprise != null) {
                   break;
               }
           }
       }
//   if(txtUserName.getText() == null)
//           {
//           jSeparator1.setBackground(Color.red);
//           return;
//           }
//   else if(txtPassword.getText() == null)
//            {
//            jSeparator2.setBackground(Color.red);
//            return;
//            }
    if (userAccount == null) {
          JOptionPane.showMessageDialog(null, "Invalid Credentails!");
           Utilities.shakeButton(txtUserName);
           Utilities.shakeButton(txtPassword);
          
            this.jSeparator1.setBackground(Color.red);
            this.jSeparator2.setBackground(Color.red);
            return;
             } 
       else {
           CardLayout layout = (CardLayout) container.getLayout();  
           container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise,ntwrk, system));
           layout.next(container);
       }
        btnLogin.setEnabled(false);
       txtUserName.setEnabled(false);
       txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here
        this.jSeparator1.setBackground(Color.BLACK);
            this.jSeparator2.setBackground(Color.BLACK);
    }//GEN-LAST:event_txtPasswordActionPerformed

    
  private void shakeButton() {
    final Point point = this.Menu.getLocation();
    final int delay = 75;
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 25; i++) {
          try {

            moveButton(new Point(point.x + 50, point.y));
          
        add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 770));
            Thread.sleep(delay);
        //    moveButton(point);
          //  Thread.sleep(delay);
           // moveButton(new Point(point.x - 5, point.y));
            //Thread.sleep(delay);
            //moveButton(point);
           // Thread.sleep(delay);
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        }
      }
    };
    Thread t = new Thread(r);
    t.start();
  }

  private void moveButton(final Point p) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
     Menu.setLocation(p);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
