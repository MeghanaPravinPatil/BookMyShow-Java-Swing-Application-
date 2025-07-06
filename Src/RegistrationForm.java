
package myfirstproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {
    Connection con = null;
   // Statement stmt = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String sql;
    public RegistrationForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        regi_label.setVisible(false);
        gif_label.setVisible(false);
                
       // setExtendedState(1920);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contact_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lname_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        regi_label = new javax.swing.JLabel();
        gif_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Here!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 70));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 425, 208, 26));

        contact_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contact_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(contact_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 385, 349, 33));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Contact Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 346, 208, 26));

        email_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 306, 349, 33));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Email Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 267, 208, 26));

        lname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lname_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(lname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 227, 349, 33));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 188, 208, 26));

        fname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fname_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(fname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 137, 349, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 208, 26));

        password_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 350, 40));

        regi_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (1).png"))); // NOI18N
        regi_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regi_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regi_labelMouseClicked(evt);
            }
        });
        jPanel1.add(regi_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 190, 60));

        gif_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Spinner@1x-1.8s-224px-224px.gif"))); // NOI18N
        gif_label.setText("jLabel10");
        jPanel1.add(gif_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 210, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 520, 620));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel4.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1920, 1080, 1920, 1080));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sticker by BookMyShow.gif"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 490, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_btn.png"))); // NOI18N
        jLabel10.setText("jLabel2");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel7.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2080, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        regi_label.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void regi_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regi_labelMouseClicked
    regi_label.setEnabled(false);
   
    String fname = fname_txt.getText().trim();
    String lname = lname_txt.getText().trim();
    String contact = contact_txt.getText().trim();
    String email = email_txt.getText().trim();
    String password = String.valueOf(password_txt.getPassword()).trim();
    
    // Regular expressions for validation
    String nameRegex = "^[a-zA-Z\\s]+$"; // Only letters and spaces for names
    String contactRegex = "^\\d{10}$"; // Exactly 10-digit phone number
    String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"; // Standard email format
    String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$"; // At least 6 chars, 1 letter, 1 digit

    if(fname.equals("") || !fname.matches(nameRegex)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid first name ");
    } 
    else if(lname.equals("") || !lname.matches(nameRegex)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid last name ");
    }
    else if(contact.equals("") || !contact.matches(contactRegex)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid 10-digit contact number");
    }
    else if(email.equals("") || !email.matches(emailRegex)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email address");
    }
    else if(password.equals("") || !password.matches(passwordRegex)) {
        JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long and contain at least one letter and one number");
    } else
        {
          regi_label.setVisible(false);
          gif_label.setVisible(true);
          con = DatabaseConnection.getDbConnection();
          sql = "insert into user_info_table(fname,lname,email,contact,password) values(?,?,?,?,?)";
          try{
              pst = con.prepareStatement(sql);
              pst.setString(1, fname_txt.getText());
              pst.setString(2, lname_txt.getText());
              pst.setString(3, email_txt.getText());
              pst.setString(4, contact_txt.getText());
              pst.setString(5, String.valueOf(password_txt.getPassword()));

              pst.executeUpdate();
              //rs = pst.executeQuery();
              JOptionPane.showMessageDialog(null, "Data Saved Successfully");
               // Send Email Confirmation
                sendEmail(email, fname);
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
          new Bookmyshowframe().show();
            dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_regi_labelMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new BookMyShow_MainFrame().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked
// Method to send email
    private void sendEmail(String recipientEmail, String name) {
        final String senderEmail = ; // Your email
        final String senderPassword = ; // Your email password

        // SMTP Properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Authenticate
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

       
             Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail, "BookMyShow"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("🎉 Welcome to BookMyShow, " + name + "!");

            String htmlContent = "<html><body>" +
                    "<div style='font-family:Segoe UI, sans-serif; background:#f7f7f7; padding:20px;'>" +
                    "<div style='max-width:600px;margin:auto;background:#fff;padding:25px;border-radius:8px;box-shadow:0px 0px 10px #ccc;'>" +
                    "<div style='text-align:center;'>" +
                    "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/BookMyShow_Logo.svg/2560px-BookMyShow_Logo.svg.png' style='width:120px;margin-bottom:10px;'/>" +
                    "<h2>Welcome to BookMyShow, " + name + "! 🎉</h2></div>" +
                    "<p>Thank you for signing up!\n Your account has been successfully created.</p>" +
                    "<p>Now you're all set to explore the latest blockbusters, book your favorite seats and enjoy seamless movie experiences.\n</p>" +
                    "<a href='https://bookmyshow.com' style='display:inline-block;background:#e72c30;color:white;padding:12px 20px;text-decoration:none;border-radius:6px;font-weight:bold;'>Start Booking Now</a>" +
                    "<p>If you have any questions?,\t reply to this email or contact support anytime.</p>" +
                    "<div style='margin-top:30px;text-align:center;font-size:13px;color:#888;'>© 2025 BookMyShow. All rights reserved.</div>" +
                    "</div></div></body></html>";

            message.setContent(htmlContent, "text/html; charset=utf-8");

            Transport.send(message);
            System.out.println("✅ Email sent successfully to " + recipientEmail);

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JLabel gif_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel regi_label;
    // End of variables declaration//GEN-END:variables
}
