/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovtRolePanel;
import java.awt.CardLayout;
import java.net.URL;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import javax.swing.JPanel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Aastha
 */
public class WeatherDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WeatherDetailsJPanel
     */
    private JPanel container;
    public WeatherDetailsJPanel(JPanel container) throws ParseException { initComponents();
        this.container = container;
        JSONObject json=null;
        try {

		URL url = new URL("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output = br.readLine();
//                JSONParser parser = new JSONParser();
//                JSONObject json = (JSONObject) parser.parse(output);
		System.out.println("Output from Server .... \n");
		if (output != null) {
//			System.out.println(output);
                    try{
                        JSONParser parser = new JSONParser();
                        json = (JSONObject) parser.parse(output);
                        
                    }
                    catch(ParseException e){
                        e.printStackTrace();
                    }
//                        jTextArea1.setText(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }
        
        JSONArray weatherArray = (JSONArray) json.get("weather");
        String main = "";
        String desc = "";
        for (Object o : weatherArray){
            JSONObject prediction = (JSONObject) o;
            main = (String) prediction.get("main");
            desc = (String) prediction.get("description");
        }
        
        txtfieldweather.setText(main);
        txtfielddesc.setText(desc);
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
        weatheroutput = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        txtfieldweather = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtfielddesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        weatheroutput.setText("Weather :");
        jPanel1.add(weatheroutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 62, 25));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 650, 90, 30));
        jPanel1.add(txtfieldweather, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 200, 30));

        jLabel1.setText("Description : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));
        jPanel1.add(txtfielddesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Weather Forecast");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 300, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/crop-imagecopy2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed
// private void readfile() {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//     JSONParser parser = new JSONParser();
//     try{ 
//        JSONArray a = (JSONArray) parser.parse(json);
//   
//        for (Object o : a){
//            JSONObject person = (JSONObject) o;
//            String name = (String) person.get("name");
//            String abbr = (String) person.get("abbreviation");
//            statesMap.putIfAbsent(abbr, name);
//        }
//    }
//    catch (FileNotFoundException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    } catch (IOException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    } catch (ParseException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfielddesc;
    private javax.swing.JTextField txtfieldweather;
    private javax.swing.JLabel weatheroutput;
    // End of variables declaration//GEN-END:variables



}
