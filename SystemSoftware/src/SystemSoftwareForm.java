
import java.util.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Arrays;

public class SystemSoftwareForm extends javax.swing.JFrame {

    public SystemSoftwareForm() {
        initComponents();
        jComboBoxWs.setSelectedItem(null);
        jLabelWsSelected.setText(" No Weather Station Selected"); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelWsSelected = new javax.swing.JLabel();
        jLabelTemp = new javax.swing.JLabel();
        jLabelGPS = new javax.swing.JLabel();
        jLabelHumid = new javax.swing.JLabel();
        jLabelWind = new javax.swing.JLabel();
        jLabelSoil = new javax.swing.JLabel();
        connect = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxWs = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelWsSelected.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelWsSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWsSelected.setText("No Weather Station Selected");
        jLabelWsSelected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTemp.setText(" Temperature :");
        jLabelTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelGPS.setText(" GPS Position : ");
        jLabelGPS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelHumid.setText(" Humidity :");
        jLabelHumid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelWind.setText(" Wind Speed : ");
        jLabelWind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelSoil.setText(" Soil PH :");
        jLabelSoil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        connect.setText("Connect");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWsSelected, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jLabelGPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelHumid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSoil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelWind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(connect)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelWsSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHumid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSoil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(connect)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxWs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Weather Station 1", " Weather Station 2", " Weather Station 3", " Weather Station 4" }));
        jComboBoxWs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Select a Weather Station");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxWs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxWs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxWsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWsActionPerformed
            /*

        String value = (String)jComboBoxWs.getSelectedItem();
        
        //WeatherStation ws1 = new WeatherStation(1,"Nottingham, Clifton",23,0.43,7,55);
        //WeatherStation ws2 = new WeatherStation(1,"Nottingham, Derby",14,0.52,6,40);
        //WeatherStation ws3 = new WeatherStation(1,"Hertfordshire, Hatfield",26,0.33,7,35);
        //WeatherStation ws4 = new WeatherStation(1,"London, London King's Cross",10,0.56,8,43);
        
        jLabelWsSelected.setText(value +" Conditions : ");
        if(value == " Weather Station 1"){
            jLabelGPS.setText(" GPS Position : " + ws1.getGps());
            jLabelTemp.setText(" temperature : " + ws1.getTemperature());
            jLabelHumid.setText(" humidity : " + ws1.getHumidity());
            jLabelSoil.setText(" soilPH : " + ws1.getSoilPH());
            jLabelWind.setText(" windSpeed : " + ws1.getWindSpeed());
        }
        if(value == " Weather Station 2"){
            jLabelGPS.setText(" GPS Position : " + ws2.getGps());
            jLabelTemp.setText(" temperature : " + ws2.getTemperature());
            jLabelHumid.setText(" humidity : " + ws2.getHumidity());
            jLabelSoil.setText(" soilPH : " + ws2.getSoilPH());
            jLabelWind.setText(" windSpeed : " + ws2.getWindSpeed());
        }
        if(value == " Weather Station 3"){
            jLabelGPS.setText(" GPS Position : " + ws1.getGps());
            jLabelTemp.setText(" temperature : " + ws3.getTemperature());
            jLabelHumid.setText(" humidity : " + ws3.getHumidity());
            jLabelSoil.setText(" soilPH : " + ws3.getSoilPH());
            jLabelWind.setText(" windSpeed : " + ws3.getWindSpeed());
        }
        if(value == " Weather Station 4"){
            jLabelGPS.setText(" GPS Position : " );
            jLabelTemp.setText(" temperature : " );
            jLabelHumid.setText(" humidity : " );
            jLabelSoil.setText(" soilPH : " );
            jLabelWind.setText(" windSpeed : " );
        }     
    }//GEN-LAST:event_jComboBoxWsActionPerformed

*/
    }   

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
            
        connect.setEnabled(false);
        
        String host = "127.0.0.1";
        int port = 3000;
        try (Socket socket = new Socket("localhost", port))
        {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        
        
        /*
        String value = (String)jComboBoxWs.getSelectedItem();
  
        // refresh temperature, humidity, soilPH, windspeed

         Random rand = new Random();
         int newTempDiff = rand.nextInt(3);
         int addSubTemp = rand.nextInt(2);
         
         int temp = ws1.getTemperature();
         int temp2 = ws2.getTemperature();
         int temp3 = ws3.getTemperature();
         int temp4 = ws4.getTemperature();
         
         double newHumdityDiff = rand.nextDouble()*(0.1*(0.20-0.01) + 0.1);
         int addSubHumdity = rand.nextInt(2);
         double humid = ws1.getHumidity();
         double humid2 = ws2.getHumidity();
         double humid3 = ws3.getHumidity();
         double humid4 = ws4.getHumidity();
         
         int newSoilPH = rand.nextInt(3);
         int addSubSoil = rand.nextInt(2);
         int soil = ws1.getSoilPH();
         int soil2 = ws2.getSoilPH();
         int soil3 = ws3.getSoilPH();
         int soil4 = ws4.getSoilPH();
         
         int newWindSpeed = rand.nextInt(3);
         int addSubWindSpeed = rand.nextInt(2);
         int windSpeed = ws1.getWindSpeed();
         int windSpeed2 = ws2.getWindSpeed();
         int windSpeed3 = ws3.getWindSpeed();
         int windSpeed4 = ws4.getWindSpeed();
         
         
        if (value == " Weather Station 1") {    
            if(addSubTemp == 0){
             //Decrease temperature
             temp = temp - newTempDiff;
         }else{
             //Increase temperature
             temp = temp + newTempDiff;
         }
            
            ws1.setTemperature(temp);
            jLabelTemp.setText(" Temperature : " + ws1.getTemperature());
            
            if (addSubHumdity ==0){
             //Decreases humdity
             humid = humid - newHumdityDiff;
            }else {
             //Increase humdity 
             humid = humid + newHumdityDiff;
         }
         ws1.setHumidity(humid);
         jLabelHumid.setText(" Humidity : " + ws1.getHumidity());
         
         if (addSubSoil ==0){
             //Decreases Soil PH
             soil = soil - newSoilPH;
            }else {
             //Increase Soil PH 
             soil = soil + newSoilPH;
         }
         ws1.setSoilPH(soil);
         jLabelSoil.setText(" SoilPH : " + ws1.getSoilPH());
         
         if (addSubWindSpeed ==0){
             //Decreases wind speed
             windSpeed = windSpeed - newWindSpeed;
            }else {
             //Increase wind speed
             windSpeed = windSpeed + newWindSpeed;
         }
         ws1.setWindSpeed(windSpeed);
         jLabelWind.setText(" Wind Speed : " + ws1.getWindSpeed());
        }
        else if(value == " Weather Station 2")
        {  
            if(addSubTemp == 0){
             //Decrease temperature
             temp2 = temp2 - newTempDiff;
         }else{
             //Increase temperature
             temp2 = temp2 + newTempDiff;
         }
         ws2.setTemperature(temp2);
         jLabelTemp.setText(" Temperature : " + ws2.getTemperature());
         
         if (addSubHumdity ==0){
             //Decreases humdity
             humid2 = humid2 - newHumdityDiff;
            }else {
             //Increase humdity 
             humid2 = humid2 + newHumdityDiff;
         }
         ws2.setHumidity(humid2);
         jLabelHumid.setText(" Humidity : " + ws2.getHumidity());
         
         if (addSubSoil ==0){
             //Decreases Soil PH
             soil2 = soil2 - newSoilPH;
            }else {
             //Increase Soil PH 
             soil2 = soil2 + newSoilPH;
         }
         ws2.setSoilPH(soil2);
         jLabelSoil.setText(" SoilPH : " + ws2.getSoilPH());
         
          if (addSubWindSpeed ==0){
             //Decreases wind speed
             windSpeed2 = windSpeed2 - newWindSpeed;
            }else {
             //Increase wind speed
             windSpeed2 = windSpeed2 + newWindSpeed;
         }
         ws2.setWindSpeed(windSpeed2);
         jLabelWind.setText(" Wind Speed : " + ws2.getWindSpeed()); 
        }
        else if(value == " Weather Station 3")
        {    
            if(addSubTemp == 0){
             //Decrease temperature
             temp3 = temp3 - newTempDiff;
         }else{
             //Increase temperature
             temp3 = temp3 + newTempDiff;
         }
         ws3.setTemperature(temp3);
         jLabelTemp.setText(" Temperature : " + ws3.getTemperature());
         
 
         if (addSubHumdity ==0){
             //Decreases humdity
             humid3 = humid3 - newHumdityDiff;
            }else {
             //Increase humdity 
             humid3 = humid3 + newHumdityDiff;
         }
         ws3.setHumidity(humid3);
         jLabelHumid.setText(" Humidity : " + ws3.getHumidity());
         
            if (addSubSoil ==0){
             //Decreases Soil PH
             soil3 = soil3 - newSoilPH;
            }else {
             //Increase Soil PH 
             soil3 = soil3 + newSoilPH;
         }
         ws3.setSoilPH(soil3);
         
         jLabelSoil.setText(" SoilPH : " + ws3.getSoilPH());
         
          if (addSubWindSpeed ==0){
             //Decreases wind speed
             windSpeed3 = windSpeed3 - newWindSpeed;
            }else {
             //Increase wind speed
             windSpeed3 = windSpeed3 + newWindSpeed;
         }
         ws3.setWindSpeed(windSpeed3);
         jLabelWind.setText(" Wind Speed : " + ws3.getWindSpeed());
         
        }
        else if(value == " Weather Station 4")
        {     
            if(addSubTemp == 0){
             //Decrease temperature
             temp4 = temp4 - newTempDiff;
         }else{
             //Increase temperature
             temp4 = temp4 + newTempDiff;
         }
         ws4.setTemperature(temp4);
         jLabelTemp.setText(" Temperature : " + ws4.getTemperature());
         if (addSubHumdity ==0){
             //Decreases humdity
             humid4 = humid4 - newHumdityDiff;
            }else {
             //Increase humdity 
             humid4 = humid4 + newHumdityDiff;
         }
         ws4.setHumidity(humid4);
         jLabelHumid.setText(" Humidity : " + ws4.getHumidity());
         
         if (addSubSoil ==0){
             //Decreases Soil PH
             soil4 = soil4 - newSoilPH;
            }else {
             //Increase Soil PH 
             soil4 = soil4 + newSoilPH;
         }
         ws4.setSoilPH(soil4);
         
         jLabelSoil.setText(" SoilPH : " + ws4.getSoilPH());
         
          if (addSubWindSpeed ==0){
             //Decreases wind speed
             windSpeed4 = windSpeed4 - newWindSpeed;
            }else {
             //Increase wind speed
             windSpeed4 = windSpeed4 + newWindSpeed;
         }
         ws4.setWindSpeed(windSpeed4);
         jLabelWind.setText(" Wind Speed : " + ws4.getWindSpeed());
        */
//        }
    }//GEN-LAST:event_connectActionPerformed
//    

    
    
    public static void main(String args[])
    {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new SystemSoftwareForm().setVisible(true);
            }
            
        });
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect;
    private javax.swing.JComboBox<String> jComboBoxWs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGPS;
    private javax.swing.JLabel jLabelHumid;
    private javax.swing.JLabel jLabelSoil;
    private javax.swing.JLabel jLabelTemp;
    private javax.swing.JLabel jLabelWind;
    private javax.swing.JLabel jLabelWsSelected;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}