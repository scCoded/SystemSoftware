
import java.util.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class SystemSoftwareForm extends javax.swing.JFrame {

    private static Map<String,int[]> weatherStations = new HashMap<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(2);
    
    
    
    public SystemSoftwareForm() {
        initComponents();
        jComboBoxWs.setSelectedItem(null);
        jLabelWsSelected.setText(" No Weather Station Selected"); 
    }

    public static void main(String args[])
    {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new SystemSoftwareForm().setVisible(true);
            }
            
        });
    }
    
   public static void updateStationData(String key, int[] data)
    {
        weatherStations.put(key, data);
        System.out.println("slot for ID " + key + " has been added to the server map");  
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
        
        Socket socket = null;
        try {
            String host = "127.0.0.1";
            socket = new Socket("localhost", 3000);
            
            System.out.println("socket open");
            
            ServerHandler serverThread = new ServerHandler(socket);
            pool.execute(serverThread);
            
            
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_connectActionPerformed
 
    
    
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




class ServerHandler implements Runnable 
{
    private Socket server;
    private BufferedReader in;
    private PrintWriter out;
    
    
    public ServerHandler(Socket serverSocket) throws IOException 
    {
        this.server = serverSocket;
        in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        out = new PrintWriter(server.getOutputStream(), true);   
    }
    
    public void requestAll() {
        System.out.printf("request all begun:");
        out.println("requestAllStationData");
        
    }
    
    
    @Override
    public void run()
    {
        System.out.printf("Thread begun:");
        try 
        {
            String request;
            String[] requestArray = {};
            
            requestAll();
            
            while ((request = in.readLine()) != null)
            {
                System.out.printf("Request from the server: ", request);
                requestArray = request.split(",");
                
                

                if (requestArray[0].equals("updateStationData"))
                {
                    String key = requestArray[1];
                    int[] data = {Integer.parseInt(requestArray[2]),
                        Integer.parseInt(requestArray[3]),
                        Integer.parseInt(requestArray[4]),
                        Integer.parseInt(requestArray[5])
                        };
                    SystemSoftwareForm.updateStationData(key, data);
                }
                else
                {
                    //out.println("request not found");
                }
                    
                    
                
            }           
        }
        catch (IOException e)
        {
        e.printStackTrace();
        }
        finally
        {
            try
            {
                if (out != null)
                {
                    out.close();
                }
                if (in != null)
                {
                    in.close();
                    server.close();
                }   
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}