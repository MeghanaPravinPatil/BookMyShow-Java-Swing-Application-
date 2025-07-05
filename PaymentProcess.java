
package myfirstproject;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PaymentProcess extends javax.swing.JFrame {

    public PaymentProcess() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public static String movie_number,gst_str,total_str;
    String movie_name_str,movie_str,seat_type_str,seat_no_str,food_str,food_qty_str;

    public PaymentProcess(String movie_name_str,String movie_str,String seat_type_str, String seat_no_str, String food_str, String food_qty_str, String gst_str, String total_str) {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel1.setBackground(new Color(213, 134, 145, 130));

        setMovie();
        
        this.movie_name_str = movie_name_str;
        this.movie_str = movie_str;
        this.seat_type_str = seat_type_str;
        this.seat_no_str = seat_no_str;
        this.food_str = food_str;
        this.food_qty_str = food_qty_str;
        this.gst_str = gst_str;
        this.total_str = total_str;
        
       // movie_label.setText(movie_name_str);
        movie_icon_label.setText(movie_str);
        seat_label.setText(seat_type_str);
        seat_no_label.setText(seat_no_str);
        snacks_label.setText(food_str);
        snack_qty_label.setText(food_qty_str);
        gst_label.setText("GST 18%          "+gst_str+" Rs.");
        total_label.setText("Total Amount       "+total_str+" Rs.");
    }
    public Void setMovie(){
        
        if(Bookmyshowframe1.movie_number == 1)
        {
            //movie_label.setText("Teri Baton Mein Uljha Jiya");
            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg")));
        }
        else if(Bookmyshowframe1.movie_number == 2)
        {
          //  movie_label.setText("Bai Pan Bhari Deva");
            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie4.jpg")));

        }
        else if(Bookmyshowframe1.movie_number == 3)
        {
           // movie_label.setText("Article 370");
            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/article370.jpg")));
        }
        else if(Bookmyshowframe1.movie_number == 4)
        {
           // movie_label.setText("Dunidaari");
            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie5.jpg")));
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        movie_icon_label = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        seat_label = new javax.swing.JLabel();
        seat_no_label = new javax.swing.JLabel();
        snacks_label = new javax.swing.JLabel();
        snack_qty_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        gst_label = new javax.swing.JLabel();
        Back_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sticker by BookMyShow.gif"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 510, 80));

        panel1.setBackground(new java.awt.Color(255, 255, 102,110));
        panel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(movie_icon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 210, 240));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setText("Your Movie");
        panel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 140, 40));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Your Seat Type ");
        panel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 29));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Number Of Seats ");
        panel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 29));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Your  Food ");
        panel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 29));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Your Food Qty ");
        panel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, 29));

        seat_label.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        seat_label.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(seat_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 270, 30));

        seat_no_label.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        seat_no_label.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(seat_no_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 210, 30));

        snacks_label.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        snacks_label.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(snacks_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 280, 30));

        snack_qty_label.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        snack_qty_label.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(snack_qty_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 270, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153,110));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirm Your Movie Ticket");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 610, 89));

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 730, 110));

        total_label.setBackground(new java.awt.Color(255, 204, 0,70));
        total_label.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        total_label.setForeground(new java.awt.Color(255, 255, 255));
        total_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, new java.awt.Color(153, 153, 255,70)));
        total_label.setOpaque(true);
        panel1.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 630, 71));

        gst_label.setBackground(new java.awt.Color(255, 204, 0,70));
        gst_label.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        gst_label.setForeground(new java.awt.Color(255, 255, 255));
        gst_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gst_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, new java.awt.Color(204, 204, 255,70)));
        gst_label.setOpaque(true);
        panel1.add(gst_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 630, 80));

        Back_btn.setBackground(new java.awt.Color(102, 102, 102,110));
        Back_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Back_btn.setText("Back");
        Back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });
        panel1.add(Back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 240, 60));

        next_btn.setBackground(new java.awt.Color(0, 153, 102,110));
        next_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        next_btn.setText("Pay");
        next_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });
        panel1.add(next_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 240, 60));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 780, 740));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatconfirm back1.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2040, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        new Bookmyshowframe1("","","","","","","","").show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_btnActionPerformed

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
        new Congrats().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_next_btnActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JLabel gst_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel movie_icon_label;
    private javax.swing.JButton next_btn;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel seat_label;
    private javax.swing.JLabel seat_no_label;
    private javax.swing.JLabel snack_qty_label;
    private javax.swing.JLabel snacks_label;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
