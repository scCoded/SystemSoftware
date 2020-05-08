
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemSoftwareForm extends javax.swing.JFrame {

    private static Map<String, int[]> weatherStations = new HashMap<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(2);
    public static String[] User = new String[2];
    public static String serverReply = null;
    public static ArrayList<String[]> fieldInfo = new ArrayList<>();

    public SystemSoftwareForm() {

        initComponents();
        jComboBoxWs.setSelectedItem(null);
        jLabelWsSelected.setText(" No Weather Station Selected");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                connectSocket();

                loginPage login = new loginPage(null);
                login.setVisible(true);

            }
        });
    }

    public static void runningMan(String args[]) {
        new SystemSoftwareForm().setVisible(true);

        try {
            requestFieldInfo();
        } catch (IOException ex) {
            Logger.getLogger(SystemSoftwareForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateStationData(String key, int[] data) {
        weatherStations.put(key, data);
        System.out.println("slot for ID " + key + " has been added to the server map");

        updateComboBox();
        updateGUIValues();
    }

    public static void updateComboBox() {
        String value = (String) jComboBoxWs.getSelectedItem();
        int i = 0;
        int x = 0;
        List<String> stations = new ArrayList();
        for (Map.Entry<String, int[]> entry : weatherStations.entrySet()) {
            stations.add(entry.getKey());
            x++;

            if (value == entry.getKey()) {
                jComboBoxWs.setSelectedIndex(i);
            }
            i++;
        }
        jComboBoxWs.setModel(new javax.swing.DefaultComboBoxModel(stations.toArray()));

       //jLabelNoS.setText(" Number Of Stations : " + x);
    }

    public static void updateGUIValues() {
        String value = (String) jComboBoxWs.getSelectedItem();

        jLabelGPS.setText(" GPS Position : " + weatherStations.get(value)[0] + " , " + weatherStations.get(value)[1]);
        jLabelGPS.setToolTipText("GPS coordinates of the weather station.");
        
        jLabelTemp.setText(" temperature : " + weatherStations.get(value)[2]);
        jLabelTemp.setToolTipText("Temperature measured in Celsius degrees.");
        
        jLabelHumid.setText(" humidity : " + weatherStations.get(value)[3]);
        jLabelHumid.setToolTipText("Humidity measured in percentages.");
        
        jLabelWind.setText(" Wind Speed : " + weatherStations.get(value)[4]);
        jLabelWind.setToolTipText("Speed of wind measured in KM/H.");
        
        jLabelRain.setText(" Rain Measurement : " + weatherStations.get(value)[5]);
        jLabelRain.setToolTipText("Mililitres of rain per hour.");
        
        jLabelVisibility.setText(" Visibility : " + weatherStations.get(value)[6]);
        jLabelVisibility.setToolTipText("Visibility given in kilometers.");
        
        jLabelChance.setText(" Chance of Rain(%) : " + weatherStations.get(value)[7]);
        jLabelChance.setToolTipText("Chance of Rain within the next hour given in percentages.");
    }

    public static void requestFieldInfo() throws FileNotFoundException, IOException {
        String csvFile = (System.getProperty("user.dir") + "/FieldInfo.txt");
        String line = "";
        String cvsSplitBy = ",";
        String[] field = null;
        String name = null;
        String size = null;

        try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = csvReader.readLine()) != null) {
                field = line.split(cvsSplitBy);
                        

                fieldInfo.add(field);
            }

        }

        name = Arrays.toString(fieldInfo.get(0));
        size = Arrays.toString(fieldInfo.get(1));

       /* jLabelFieldName.setText(" Field Name : " + name);
        jLabelFieldName.setToolTipText("This is the name of the field.");
        jLabelFieldSize.setText(" Field Name : " + size);
        jLabelFieldSize.setToolTipText("Size of the field in hectares.");*/
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
        jLabelRain = new javax.swing.JLabel();
        jLabelChance = new javax.swing.JLabel();
        jLabelVisibility = new javax.swing.JLabel();
        saveText = new javax.swing.JTextField();
        save = new javax.swing.JButton();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelWsSelected.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelWsSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWsSelected.setText("No Weather Station Selected");
        jLabelWsSelected.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelTemp.setText(" Temperature :");
        jLabelTemp.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelGPS.setText(" GPS Position : ");
        jLabelGPS.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelHumid.setText(" Humidity :");
        jLabelHumid.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelWind.setText(" Wind Speed : ");
        jLabelWind.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelRain.setText("Rain Measurement:");
        jLabelRain.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelChance.setText("Chance of Rain (%) :");
        jLabelChance.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabelVisibility.setText("Visibility:");
        jLabelVisibility.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        saveText.setText("Save ");
        saveText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTextActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
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
                    .addComponent(jLabelRain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelWind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelChance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVisibility, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save)
                        .addGap(7, 7, 7)))
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
                .addComponent(jLabelWind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRain, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelChance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jComboBoxWs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Weather Station 1", " Weather Station 2", " Weather Station 3", " Weather Station 4" }));
        jComboBoxWs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Select a Weather Station");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxWs, 0, 184, Short.MAX_VALUE)
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

        String value = (String) jComboBoxWs.getSelectedItem();

        //WeatherStation ws1 = new WeatherStation(1,"Nottingham, Clifton",23,0.43,7,55);
        //WeatherStation ws2 = new WeatherStation(1,"Nottingham, Derby",14,0.52,6,40);
        //WeatherStation ws3 = new WeatherStation(1,"Hertfordshire, Hatfield",26,0.33,7,35);
        //WeatherStation ws4 = new WeatherStation(1,"London, London King's Cross",10,0.56,8,43);
        if (value != null) {
            jLabelWsSelected.setText(value + " Conditions : XXX");
            updateGUIValues();

        }
    }//GEN-LAST:event_jComboBoxWsActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

       // TODO add your handling code here:
        String fileName= saveText.getText() +" .txt";
        String value = (String) jComboBoxWs.getSelectedItem();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        try{
                FileWriter fout = new FileWriter(fileName, true);
                BufferedWriter x = new BufferedWriter(fout);
                PrintWriter pout = new PrintWriter(x);
                pout.println ("" + LocalDateTime.now());
                pout.println("ID = "+ jComboBoxWs.getSelectedItem()+ ",");
                pout.println("GPS Position: "+ weatherStations.get(value)[0]+","+ weatherStations.get(value)[1] );
                pout.println("Temperature: " + weatherStations.get(value)[2]);
                pout.println("Humdity: " +weatherStations.get(value)[3]);
                pout.println("Wind Speed: "+ weatherStations.get(value)[4]);
                pout.println("Rain Measurement: "+ weatherStations.get(value)[5]);
                pout.println("Visibility: " +weatherStations.get(value)[6]);
                pout.println("Chance of Rain (%): "+ weatherStations.get(value)[7]);
     
                pout.close();
                x.close();
                fout.close();
                //for system data and time for save
        
    }//GEN-LAST:event_saveActionPerformed
catch (IOException ex) {
            Logger.getLogger(SystemSoftwareForm.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    private void saveTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveTextActionPerformed

       
    private static void connectSocket() {
        Socket socket = null;
        try {
            String host = /*"178.62.9.119"*/ "localhost";
            socket = new Socket(host, 3000);

            System.out.println("socket open");

            ServerHandler serverThread = new ServerHandler(socket);
            pool.execute(serverThread);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> jComboBoxWs;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabelChance;
    private static javax.swing.JLabel jLabelGPS;
    private static javax.swing.JLabel jLabelHumid;
    private static javax.swing.JLabel jLabelRain;
    private static javax.swing.JLabel jLabelTemp;
    private static javax.swing.JLabel jLabelVisibility;
    private static javax.swing.JLabel jLabelWind;
    private static javax.swing.JLabel jLabelWsSelected;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton save;
    private javax.swing.JTextField saveText;
    // End of variables declaration//GEN-END:variables
}

class ServerHandler implements Runnable {

    private Socket server;
    private BufferedReader in;
    private static PrintWriter out;

    public ServerHandler(Socket serverSocket) throws IOException {
        this.server = serverSocket;
        in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        out = new PrintWriter(server.getOutputStream(), true);
    }

    public static void requestAll() {
        System.out.printf("request all begun:");
        out.println("requestAllStationData");

    }

    public static void requestLogin() {
        String username = SystemSoftwareForm.User[0];
        String password = SystemSoftwareForm.User[1];

        System.out.printf("request login:");
        out.println("requestCredentials," + username + "," + password);
    }

    @Override
    public void run() {
        String[] users = {};

        System.out.printf("Thread begun:");
        try {
            String request;
            String[] requestArray = {};
            while (true) {
                java.util.concurrent.TimeUnit.MILLISECONDS.sleep(1);
                if (loginPage.pleaseWork == true) {
                    requestLogin();
                    break;
                }
            }
            requestTimer timer = new requestTimer();
            timer.start();

            while ((request = in.readLine()) != null) {
                System.out.printf("Request from the server: ", request);
                requestArray = request.split(",");

                if (requestArray[0].equals("updateStationData")) {
                    String key = requestArray[1];
                    int[] data = {
                        Integer.parseInt(requestArray[2]),
                        Integer.parseInt(requestArray[3]),
                        Integer.parseInt(requestArray[4]),
                        Integer.parseInt(requestArray[5]),
                        Integer.parseInt(requestArray[6]),
                        Integer.parseInt(requestArray[7]),
                        Integer.parseInt(requestArray[8]),
                        Integer.parseInt(requestArray[9])
                    };
                    SystemSoftwareForm.updateStationData(key, data);
                } else if (requestArray[0].equals("ACCEPT")) {
                    SystemSoftwareForm.serverReply = "ACCEPT";
                    System.out.println(SystemSoftwareForm.serverReply);
                } else if (requestArray[0].equals("DECLINE")) {
                    SystemSoftwareForm.serverReply = "DECLINE";
                    System.out.println(SystemSoftwareForm.serverReply);
                } else {
                    //out.println("request not found");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                    server.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class requestTimer extends Thread {

    @Override
    public void run() {
        try {

            while (true) {
                WeatherSensor.sleep(12000);
                ServerHandler.requestAll();
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherSensor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
