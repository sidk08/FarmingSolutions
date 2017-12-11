/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovtRolePanel;

import Business.Enterprise.DistrictEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PiePlot;

/**
 *
 * @author Aastha
 */

public class AnalyseSoilDataJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyseSoilDataJPanel
     */
    private JPanel container;
    private EnterpriseDirectory edr;
    public AnalyseSoilDataJPanel(JPanel container, EnterpriseDirectory edr) {
        initComponents();
        this.container = container;
        this.edr = edr;
        populateComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        distComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        pieChartPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        distComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distComboBoxActionPerformed(evt);
            }
        });
        add(distComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 270, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Select District/City :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));
        add(pieChartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 630, 530));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void distComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distComboBoxActionPerformed
        // TODO add your handling code here:
        draw_pie_chart();
    }//GEN-LAST:event_distComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox distComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pieChartPanel;
    // End of variables declaration//GEN-END:variables

    private void draw_pie_chart() {
       
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "IPhone 5s" , new Double( 20 ) );  
      dataset.setValue( "SamSung Grand" , new Double( 20 ) );   
      dataset.setValue( "MotoG" , new Double( 40 ) );    
      dataset.setValue( "Nokia Lumia" , new Double( 10 ) ); 
      
       JFreeChart chart = ChartFactory.createPieChart(      
         "Mobile Sales",   // chart title 
         dataset,          // data    
         false,             // do not include legend   
         true, 
         false);
       
       PiePlot plot = (PiePlot) chart.getPlot();
       
       pieChartPanel.removeAll();
       ChartPanel chartPanel = new ChartPanel(chart);
       
       pieChartPanel.add(chartPanel);
       pieChartPanel.validate();
       pieChartPanel.setOpaque(false);
    }

    private void populateComboBox() {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         for(Enterprise ent : edr.getEnterpriseList()){
           if(ent instanceof DistrictEnterprise){
               distComboBox.addItem((DistrictEnterprise)ent);
           } 
        }
    }
}