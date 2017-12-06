/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author raunak
 */
public class ManageNetworkJPanel_2 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    HashMap<String,String> statesMap = new HashMap<String,String>();
    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel_2(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        readfile();
        populateNetworkTable();
        populateStateListBox();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        submitBtn = new javax.swing.JButton();
        stateAbbrTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        stateListBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 231, 740, 160));

        submitBtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 153, 153));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 470, 110, 30));
        add(stateAbbrTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, 70, 30));

        backBtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 153, 153));
        backBtn.setText(" Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 130, 30));

        stateListBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateListBoxActionPerformed(evt);
            }
        });
        add(stateListBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 230, 30));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("States :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1280, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        String name = (String) stateListBox.getSelectedItem();              //stateAbbrTxt.getText();
        
        if(!system.checkNetworkName(name)){
            Network network = system.addNetwork();
            network.setName(name);
        }
        else{
            JOptionPane.showMessageDialog(this, "State already exit", "Error", JOptionPane.ERROR_MESSAGE);
        }
        populateNetworkTable();
        populateStateListBox();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
//         Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        SystemAdminPanelForm_2 sysAdminwjp = (SystemAdminPanelForm_2) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void stateListBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateListBoxActionPerformed
        // TODO add your handling code here:
        
        String selectState = (String) stateListBox.getSelectedItem();
        
        for(Entry<String, String> state : statesMap.entrySet()){
            if(state.getValue().equalsIgnoreCase(selectState)){
                stateAbbrTxt.setText((String)state.getKey());
            }
        }
        
    }//GEN-LAST:event_stateListBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField stateAbbrTxt;
    private javax.swing.JComboBox stateListBox;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

    private void populateStateListBox(){        // throws FileNotFoundException, IOException, ParseException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    stateListBox.removeAllItems();
    for(Entry<String, String> state : statesMap.entrySet()){
//        if(!system.checkNetworkName(state.getValue())){
            stateListBox.addItem(state.getValue());
//        }
       }
    
    }

    private void readfile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     JSONParser parser = new JSONParser();
     try{ 
        JSONArray a = (JSONArray) parser.parse(new FileReader("US_States.json"));
   
        for (Object o : a){
            JSONObject person = (JSONObject) o;
            String name = (String) person.get("name");
            String abbr = (String) person.get("abbreviation");
            statesMap.putIfAbsent(abbr, name);
        }
    }
    catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
