

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
        this.setLocationRelativeTo(null);//center form in the screen
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameBox = new javax.swing.JTextField();
        passwordBox = new javax.swing.JPasswordField();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 233));
        setPreferredSize(new java.awt.Dimension(350, 280));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameBox.setText("Username");
        usernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameBoxActionPerformed(evt);
            }
        });
        getContentPane().add(usernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 96, 123, -1));

        passwordBox.setText("..............");
        passwordBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordBoxKeyPressed(evt);
            }
        });
        getContentPane().add(passwordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, -1));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("         Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 20));

        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        loginBtn1.setText("Login");
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 178, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        System. exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void usernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameBoxActionPerformed

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed
               if(usernameBox.getText().trim().isEmpty())
        {      
          if(passwordBox.getPassword().length==0)
          {
              JOptionPane.showMessageDialog(null, "ERROR : Username and Password empty! ");
          }
          else
          {
              JOptionPane.showMessageDialog(null, "ERROR : Username empty! ");
          }
        }
        else
        {      
            if(passwordBox.getPassword().length!=0)  //if password not empty checks file txt
            {
                String csvFile = (System.getProperty("user.dir") + "/users.txt");
                String line = "";
                String cvsSplitBy = ",";
                String passText = new String(passwordBox.getPassword());
                String userText = new String(usernameBox.getText());
                boolean found = false;
                try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile)))
                {
                    while ((line = csvReader.readLine()) != null)
                    {
                        String[] user = line.split(cvsSplitBy);
                       
                       
                        if(user[0].equals(userText) && user[1].equals(passText))
                        {
                            SystemSoftwareForm.runner(null);
                            this.dispose();
                            found = true;
                            break;
     
                        }
                    }
                    if(!found)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR : Invalid credentials! ");
                        passwordBox.setText("");
                        usernameBox.setText("");
                    }

                    
               
                } catch (IOException e) {        
                    e.printStackTrace();
                }
               
               
            }
            else
            {
               JOptionPane.showMessageDialog(null, "ERROR : Password empty! ");
            }
        }
    }//GEN-LAST:event_loginBtn1ActionPerformed

    private void passwordBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordBoxKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
              if(passwordBox.getPassword().length!=0)  //if password not empty checks file txt
            {
                String csvFile = (System.getProperty("user.dir") + "/users.txt");
                String line = "";
                String cvsSplitBy = ",";
                String passText = new String(passwordBox.getPassword());
                String userText = new String(usernameBox.getText());
                boolean found = false;
                try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile)))
                {
                    while ((line = csvReader.readLine()) != null)
                    {
                        String[] user = line.split(cvsSplitBy);
                       
                       
                        if(user[0].equals(userText) && user[1].equals(passText))
                        {
                            SystemSoftwareForm.runner(null);
                            this.dispose();
                            found = true;
                            break;
     
                        }
                    }
                    if(!found)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR : Invalid credentials! ");
                        passwordBox.setText("");
                        usernameBox.setText("");
                    }

                    
               
                } catch (IOException e) {        
                    e.printStackTrace();
                }
               
               
            }
            else
            {
               JOptionPane.showMessageDialog(null, "ERROR : Password empty! ");
            }
         }
    }//GEN-LAST:event_passwordBoxKeyPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn1;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JTextField usernameBox;
    // End of variables declaration//GEN-END:variables
}
