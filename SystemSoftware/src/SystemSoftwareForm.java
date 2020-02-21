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
                    .addComponent(jLabelWind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(90, Short.MAX_VALUE))
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
        String value = (String)jComboBoxWs.getSelectedItem();
        
        WeatherStation ws1 = new WeatherStation(1,"Nottingham, Clifton",23,0.43,7,55);
        WeatherStation ws2 = new WeatherStation(1,"Nottingham, Derby",14,0.52,6,40);
        WeatherStation ws3 = new WeatherStation(1,"Hertfordshire, Hatfield",26,0.33,7,35);
        WeatherStation ws4 = new WeatherStation(1,"London, London King's Cross",10,0.56,8,43);
        
        jLabelWsSelected.setText(value +" Conditions : ");
        if(value == " Weather Station 1"){
            jLabelGPS.setText(" GPS Position : " + ws1.getGps());
            jLabelTemp.setText(" GPS Position : " + ws1.getTemperature());
            jLabelHumid.setText(" GPS Position : " + ws1.getHumidity());
            jLabelSoil.setText(" GPS Position : " + ws1.getSoilPH());
            jLabelWind.setText(" GPS Position : " + ws1.getWindSpeed());
        }
        if(value == " Weather Station 2"){
            jLabelGPS.setText(" GPS Position : " + ws2.getGps());
            jLabelTemp.setText(" GPS Position : " + ws2.getTemperature());
            jLabelHumid.setText(" GPS Position : " + ws2.getHumidity());
            jLabelSoil.setText(" GPS Position : " + ws2.getSoilPH());
            jLabelWind.setText(" GPS Position : " + ws2.getWindSpeed());
        }
        if(value == " Weather Station 3"){
            jLabelGPS.setText(" GPS Position : " + ws3.getGps());
            jLabelTemp.setText(" GPS Position : " + ws3.getTemperature());
            jLabelHumid.setText(" GPS Position : " + ws3.getHumidity());
            jLabelSoil.setText(" GPS Position : " + ws3.getSoilPH());
            jLabelWind.setText(" GPS Position : " + ws3.getWindSpeed());
        }
        if(value == " Weather Station 4"){
            jLabelGPS.setText(" GPS Position : " + ws4.getGps());
            jLabelTemp.setText(" GPS Position : " + ws4.getTemperature());
            jLabelHumid.setText(" GPS Position : " + ws4.getHumidity());
            jLabelSoil.setText(" GPS Position : " + ws4.getSoilPH());
            jLabelWind.setText(" GPS Position : " + ws4.getWindSpeed());
        }
       
    }//GEN-LAST:event_jComboBoxWsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new SystemSoftwareForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
