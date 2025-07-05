
package myfirstproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bookmyshowframe extends javax.swing.JFrame {
 Connection con = null;
   // Statement stmt = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String sql;
    public Bookmyshowframe() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setExtendedState(1920);
        logout_btn.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        login = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jMenu1.setText("Home");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102,90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 440, 89));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Email ID ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 169, 34));

        email_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 289, 31));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 169, 37));

        password_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 300, 37));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (2).png"))); // NOI18N
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 260, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 500, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 670, 680));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel4.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1920, 1080, 1920, 1080));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sticker by BookMyShow.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 460, 80));

        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout_btn.png"))); // NOI18N
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_btnMouseClicked(evt);
            }
        });
        getContentPane().add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 10, 100, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_btn.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel7.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2170, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
    String email = email_txt.getText().trim();
    String password = String.valueOf(password_txt.getPassword()).trim();

    // Regular expressions for validation (reuse from registration)
    String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"; 
    String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$";

    if (email.equals("") || !email.matches(emailRegex)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email address");
    } else if (password.equals("") || !password.matches(passwordRegex)) {
        JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long and contain at least one letter and one number");
    } else {
        con = DatabaseConnection.getDbConnection();
        sql = "SELECT * FROM user_info_table WHERE email = ? AND password = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Insert email and password into login_table after successful login
                String insertSQL = "INSERT INTO login_table (email, password, login_time, logout_time) VALUES (?, ?, CURRENT_TIMESTAMP, NULL)";
                PreparedStatement insertPst = con.prepareStatement(insertSQL);
                insertPst.setString(1, email);
                insertPst.setString(2, password);
                insertPst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Login Successful!");
                logout_btn.setVisible(true);
                new Bookmyshowframe1().setVisible(true);
                dispose(); // Close the login form
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email or password. Please try again.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e);
        }
    } 
    }//GEN-LAST:event_loginMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new BookMyShow_MainFrame().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseClicked
        new BookMyShow_MainFrame().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Bookmyshowframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookmyshowframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookmyshowframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookmyshowframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookmyshowframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logout_btn;
    private javax.swing.JPasswordField password_txt;
    // End of variables declaration//GEN-END:variables
}
