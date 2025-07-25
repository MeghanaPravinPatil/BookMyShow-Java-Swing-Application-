/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

import java.awt.Color;

/**
 *
 * @author Meghana Patil
 */
public class BookMyShow_MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form BookMyShow_MainFrame
     */
    public BookMyShow_MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movie4_label = new javax.swing.JLabel();
        movie3_label = new javax.swing.JLabel();
        movie1_label = new javax.swing.JLabel();
        movie2_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        login_labl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regi_labl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movie4_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movie5_blur.jpg"))); // NOI18N
        movie4_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie4_labelMouseClicked(evt);
            }
        });
        getContentPane().add(movie4_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 180, 240));

        movie3_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/article370_blur.jpg"))); // NOI18N
        movie3_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie3_labelMouseClicked(evt);
            }
        });
        getContentPane().add(movie3_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 240));

        movie1_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teribotonmein_blur.jpg"))); // NOI18N
        movie1_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie1_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                movie1_labelMouseEntered(evt);
            }
        });
        getContentPane().add(movie1_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 180, 240));

        movie2_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movie4_blur.jpg"))); // NOI18N
        movie2_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie2_labelMouseClicked(evt);
            }
        });
        getContentPane().add(movie2_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 190, 240));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sticker by BookMyShow.gif"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 580, 80));

        login_labl.setBackground(new java.awt.Color(0, 153, 153));
        login_labl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        login_labl.setForeground(new java.awt.Color(255, 255, 255));
        login_labl.setText("Login");
        login_labl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_labl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_lablMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_lablMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_lablMouseExited(evt);
            }
        });
        getContentPane().add(login_labl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 20, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" seat selection. ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 660, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("From the first show to the last row, we’ve got you covered ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 650, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("with instant bookings, seamless payments, and smart ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 660, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/At The Movies Popcorn Sticker by André Rieu.gif"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 430, 470, 370));

        regi_labl1.setBackground(new java.awt.Color(0, 153, 153));
        regi_labl1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        regi_labl1.setForeground(new java.awt.Color(255, 255, 255));
        regi_labl1.setText("Register");
        regi_labl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regi_labl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regi_labl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regi_labl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regi_labl1MouseExited(evt);
            }
        });
        getContentPane().add(regi_labl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 20, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatconfirm back1.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1980, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movie4_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie4_labelMouseClicked
     
        // TODO add your handling code here:
    }//GEN-LAST:event_movie4_labelMouseClicked

    private void movie3_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie3_labelMouseClicked
      
        //        seat_combo.setEnabled(true);
        //        seat_no_combo.setEnabled(true);
        //        snacks_combo.setEnabled(true);
        //        snack_qty_combo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_movie3_labelMouseClicked

    private void movie1_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie1_labelMouseClicked

    
        // movie1_label.getIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg")));
        //movie_str =  movie1_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg")));
        // new PaymentProcess(movie_str,seat_type_str,seat_no_str,food_str,food_qty_str,gst_str,total_str).setVisible(true);
        //        seat_no_combo.setEnabled(true);
        //        snacks_combo.setEnabled(true);
        //        snack_qty_combo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_movie1_labelMouseClicked

    private void movie1_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie1_labelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_movie1_labelMouseEntered

    private void movie2_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie2_labelMouseClicked
       
        //        seat_combo.setEnabled(true);
        //        seat_no_combo.setEnabled(true);
        //        snacks_combo.setEnabled(true);
        //        snack_qty_combo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_movie2_labelMouseClicked

    private void login_lablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_lablMouseClicked
        new Bookmyshowframe().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_login_lablMouseClicked

    private void login_lablMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_lablMouseEntered
        login_labl.setForeground(Color.blue);
        // TODO add your handling code here:
    }//GEN-LAST:event_login_lablMouseEntered

    private void login_lablMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_lablMouseExited
        login_labl.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_login_lablMouseExited

    private void regi_labl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regi_labl1MouseClicked
        new RegistrationForm().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_regi_labl1MouseClicked

    private void regi_labl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regi_labl1MouseEntered
        regi_labl1.setForeground(Color.red);

        // TODO add your handling code here:
    }//GEN-LAST:event_regi_labl1MouseEntered

    private void regi_labl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regi_labl1MouseExited
        regi_labl1.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_regi_labl1MouseExited

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
            java.util.logging.Logger.getLogger(BookMyShow_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMyShow_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel login_labl;
    private javax.swing.JLabel movie1_label;
    private javax.swing.JLabel movie2_label;
    private javax.swing.JLabel movie3_label;
    private javax.swing.JLabel movie4_label;
    private javax.swing.JLabel regi_labl1;
    // End of variables declaration//GEN-END:variables
}
