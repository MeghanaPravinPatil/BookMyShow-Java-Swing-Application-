package myfirstproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bookmyshowframe1 extends javax.swing.JFrame {
    
    double total = 0.0;
    public static int movie_number;
    public static String gst_str,total_str;
    String movie_name_str,movie_str,seat_type_str,seat_no_str,food_str,food_qty_str;

    public Bookmyshowframe1(String movie_name_str,String movie_str,String seat_type_str, String seat_no_str, String food_str, String food_qty_str, String gst_str, String total_str) {
        initComponents();
        setLocationRelativeTo(null);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.movie_name_str = movie_name_str;
        this.movie_str = movie_str;
        this.seat_type_str = seat_type_str;
        this.seat_no_str = seat_no_str;
        this.food_str = food_str;
        this.food_qty_str = food_qty_str;
        this.gst_str = gst_str;
        this.total_str = total_str;
        
        
        seat_label.setText(seat_type_str);
        seat_no_label.setText(seat_no_str);
        snacks_label.setText(food_str);
        snack_qty_label.setText(food_qty_str);
        gst_label.setText(gst_str);
        total_label.setText(total_str);
    }
    
    public Bookmyshowframe1() {
        
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
    }

 public double gstAmount(int amount,double percent)
 {
     return(amount * percent)/100;
    
 }
 
// public void setMovie(){
//        
//        if(Bookmyshowframe1.movie_number == 1)
//        {
//            movie_label.setText("Teri Baton Mein Uljha Jiya");
//            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg"));
//        }
//        else if(Bookmyshowframe1.movie_number == 2)
//        {
//            movie_label.setText("Bai Pan Bhari Deva");
//            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie4.jpg")));
//
//        }
//        else if(Bookmyshowframe1.movie_number == 3)
//        {
//            movie_label.setText("Article 370");
//            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/article370.jpg")));
//        }
//        else if(Bookmyshowframe1.movie_number == 4)
//        {
//            movie_label.setText("Dunidaari");
//            movie_icon_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie5.jpg")));
//        }
//    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_l1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seat_combo = new javax.swing.JComboBox<>();
        seat_no_combo = new javax.swing.JComboBox<>();
        snacks_combo = new javax.swing.JComboBox<>();
        snack_qty_combo = new javax.swing.JComboBox<>();
        new_btn = new javax.swing.JButton();
        proceed_to_next_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        movie3_label = new javax.swing.JLabel();
        movie1_label = new javax.swing.JLabel();
        movie2_label = new javax.swing.JLabel();
        movie4_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        seat_label = new javax.swing.JLabel();
        seat_no_label = new javax.swing.JLabel();
        snacks_label = new javax.swing.JLabel();
        snack_qty_label = new javax.swing.JLabel();
        gst_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        name_l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BookMyShowFrame image.png"))); // NOI18N
        name_l1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        name_l1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        name_l1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel4.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1920, 1080, 1920, 1080));

        seat_combo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        seat_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seat Type", "Platinum - Rs.200", "Diamond - Rs.150", "Gold - Rs.100", "Silver - Rs.50" }));
        seat_combo.setEnabled(false);
        seat_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat_comboActionPerformed(evt);
            }
        });
        getContentPane().add(seat_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 390, 50));

        seat_no_combo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        seat_no_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select No. Of Seats", "1", "2", "3", "4", " " }));
        seat_no_combo.setEnabled(false);
        seat_no_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat_no_comboActionPerformed(evt);
            }
        });
        getContentPane().add(seat_no_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 390, 50));

        snacks_combo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        snacks_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food & Beverage", "Samosa - Rs.100", "PopCorn - Rs.150", "Coka - Rs.160", "Samosa Coka Combo - Rs.260", "Samosa PopCorn Combo - Rs.250", " " }));
        snacks_combo.setEnabled(false);
        snacks_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacks_comboActionPerformed(evt);
            }
        });
        getContentPane().add(snacks_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 390, 50));

        snack_qty_combo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        snack_qty_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food & Beverage Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        snack_qty_combo.setEnabled(false);
        snack_qty_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snack_qty_comboActionPerformed(evt);
            }
        });
        getContentPane().add(snack_qty_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 390, 50));

        new_btn.setBackground(new java.awt.Color(0, 153, 153));
        new_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        new_btn.setText("New");
        new_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        new_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });
        getContentPane().add(new_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 170, 50));

        proceed_to_next_btn.setBackground(new java.awt.Color(204, 0, 0,110));
        proceed_to_next_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proceed_to_next_btn.setText("Proceed to Next");
        proceed_to_next_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proceed_to_next_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed_to_next_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proceed_to_next_btnMouseEntered(evt);
            }
        });
        proceed_to_next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_to_next_btnActionPerformed(evt);
            }
        });
        getContentPane().add(proceed_to_next_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 230, 50));

        cancel_btn.setBackground(new java.awt.Color(102, 102, 102,80));
        cancel_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancel_btn.setText("Cancel Order");
        cancel_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 200, 50));

        movie3_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/article370_blur.jpg"))); // NOI18N
        movie3_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie3_labelMouseClicked(evt);
            }
        });
        getContentPane().add(movie3_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 110, 190, 230));

        movie1_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teribotonmein_blur.jpg"))); // NOI18N
        movie1_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie1_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                movie1_labelMouseEntered(evt);
            }
        });
        getContentPane().add(movie1_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 400, 180, 230));

        movie2_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movie4_blur.jpg"))); // NOI18N
        movie2_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie2_labelMouseClicked(evt);
            }
        });
        getContentPane().add(movie2_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 400, 190, 240));

        movie4_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movie5_blur.jpg"))); // NOI18N
        movie4_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie4_labelMouseClicked(evt);
            }
        });
        getContentPane().add(movie4_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 110, 180, 230));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Total Amount");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 120, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("GST 18%");
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 80, 30));

        total_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 140, 40));

        seat_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(seat_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 140, 40));

        seat_no_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(seat_no_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 140, 40));

        snacks_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(snacks_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 340, 40));

        snack_qty_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(snack_qty_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 140, 40));

        gst_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(gst_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 140, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sticker by BookMyShow.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 490, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BookMyShowFrame image.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel5.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel5.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1990, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seat_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat_comboActionPerformed
        String seattype = seat_combo.getSelectedItem().toString();
        
        if(seattype.equals("Platinum - Rs.200"))
        {
            
           // gstAmount(200.0,18.0);
            gst_label.setText(String.valueOf(gstAmount(200,18.0)));
            total_label.setText(String.valueOf(200 + gstAmount(200,18.0)));
            seat_label.setText("Rs.200");
            seat_no_combo.setEnabled(true);
            seat_no_label.setText("0");
        }
        else if(seattype.equals("Diamond - Rs.150"))
        {
           
            gst_label.setText(String.valueOf( gstAmount(150,18.0)));
            total_label.setText(String.valueOf(150 + gstAmount(150,18.0)));
            seat_label.setText("Rs.150");
            seat_no_combo.setEnabled(true);
            seat_no_label.setText("0");
        }
        else if(seattype.equals("Gold - Rs.100"))
        {
            gst_label.setText(String.valueOf(gstAmount(100,18.0)));
            total_label.setText(String.valueOf(100 + gstAmount(100,18.0)));
            seat_label.setText("Rs.100");
            seat_no_combo.setEnabled(true);
            seat_no_label.setText("0");
        }
        else if(seattype.equals("Silver - Rs.50"))
        {
            gst_label.setText(String.valueOf(gstAmount(50,18.0)));
            total_label.setText(String.valueOf(50 + gstAmount(50,18.0)));
            seat_label.setText("Rs.50");
            seat_no_combo.setEnabled(true);
            seat_no_label.setText("0");
            
        }
      
    }//GEN-LAST:event_seat_comboActionPerformed

    private void seat_no_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat_no_comboActionPerformed
 
 
        int i = 0;
        while(i<=10)
        {
            if(seat_no_combo.getSelectedItem().toString().equals(String.valueOf(i)))
            {
                seat_no_label.setText(String.valueOf(i));
                if(seat_combo.getSelectedItem().equals("Platinum - Rs.200"))
                {
                    gst_label.setText(String.valueOf(gstAmount(200 * i,18.0)));
                    total_label.setText(String.valueOf((200*i)+gstAmount(200 * i,18.0)));
                }
                else if(seat_combo.getSelectedItem().equals("Diamond - Rs.150"))
                {
                    gst_label.setText(String.valueOf(gstAmount(150 * i,18.0)));
                    total_label.setText(String.valueOf((150*i)+gstAmount(150 * i,18.0)));
                }
                else if(seat_combo.getSelectedItem().equals("Gold - Rs.100"))
                {
                    gst_label.setText(String.valueOf(gstAmount(100 * i,18.0)));
                    total_label.setText(String.valueOf((100*i)+gstAmount(100 * i,18.0)));
                }
                else if(seat_combo.getSelectedItem().equals("Silver - Rs.200"))
                {
                    gst_label.setText(String.valueOf(gstAmount(50 * i,18.0)));
                    total_label.setText(String.valueOf((50*i)+gstAmount(50 * i,18.0)));
                }
  
            }
            i = i+1;
        }
        snacks_combo.setEnabled(true);
        
    }//GEN-LAST:event_seat_no_comboActionPerformed

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
      
        seat_combo.setSelectedItem("Select Seat Type");
        seat_no_combo.setSelectedItem("Select No. Of Seats");
        snacks_combo.setSelectedItem("Select Food & Beverage");
        snack_qty_combo.setSelectedItem("Select Food & Beverage Quantity");
        seat_label.setText("");
        seat_no_label.setText("");
        snacks_label.setText("");
        snack_qty_label.setText("");
        gst_label.setText("");
        total_label.setText("");
        
                
        // TODO add your handling code here:
    }//GEN-LAST:event_new_btnActionPerformed
    void saveRecord()
    {
        
        seat_type_str = seat_combo.getSelectedItem().toString();
        seat_no_str = seat_no_combo.getSelectedItem().toString();
        food_str = snacks_combo.getSelectedItem().toString();
        food_qty_str = snack_qty_combo.getSelectedItem().toString();
        gst_str = gst_label.getText().toString();
        total_str = total_label.getText().toString();
        movie_name_str = "";
        
       // movie_str = movie1_label.getIcon().toString();
        
    }
    
    private void proceed_to_next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_to_next_btnActionPerformed
        if(seat_combo.getSelectedItem().equals("Select Seat Type"))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Required Fields");
        }
        else
        {
            saveRecord();
            new PaymentProcess(movie_name_str,movie_str,seat_type_str,seat_no_str,food_str,food_qty_str,gst_str,total_str).show();
            dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_proceed_to_next_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        new BookMyShow_MainFrame().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void snacks_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacks_comboActionPerformed
//Select Food & Beverage
//Samosa - Rs.100
//PopCorn - Rs.150
//Coka - Rs.160
//Samosa Coka Combo - Rs.260
//Samosa PopCorn Combo - Rs.250
       
        String snack_type = snacks_combo.getSelectedItem().toString();
        
        if(snack_type.equals("Samosa - Rs.100"))
        {
            snacks_label.setText("Samosa");
            snack_qty_combo.setEnabled(true);
            snack_qty_label.setText("0");

        }
        else if(snack_type.equals("PopCorn - Rs.150"))
        {
            snacks_label.setText("PopCorn");
            snack_qty_combo.setEnabled(true);
            snack_qty_label.setText("0");

        }
        else if(snack_type.equals("Coka - Rs.160"))
        {
             snacks_label.setText("Coka");
             snack_qty_combo.setEnabled(true);
             snack_qty_label.setText("0");
        }
        else if(snack_type.equals("Samosa Coka Combo - Rs.260"))
        {
             snacks_label.setText("Samosa Coka Combo");
             snack_qty_combo.setEnabled(true);
             snack_qty_label.setText("0");
        }
        else if(snack_type.equals("Samosa PopCorn Combo - Rs.250"))
        {
             snacks_label.setText("Samosa PopCorn Combo");
             snack_qty_combo.setEnabled(true);
             snack_qty_label.setText("0");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_snacks_comboActionPerformed

    private void movie1_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie1_labelMouseClicked
      
        movie1_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg")));
        movie2_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie4_blur.jpg")));
        movie3_label.setIcon(new ImageIcon(getClass().getResource("/Images/article370_blur.jpg")));
        movie4_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie5_blur.jpg")));
        seat_combo.setEnabled(true);
        movie_number = 1;
        
        // movie1_label.getIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg")));
        //movie_str =  movie1_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein.jpg")));
       // new PaymentProcess(movie_str,seat_type_str,seat_no_str,food_str,food_qty_str,gst_str,total_str).setVisible(true);
//        seat_no_combo.setEnabled(true);
//        snacks_combo.setEnabled(true);
//        snack_qty_combo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_movie1_labelMouseClicked

    private void movie2_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie2_labelMouseClicked
        movie1_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein_blur.jpg")));
        movie2_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie4.jpg")));
        movie3_label.setIcon(new ImageIcon(getClass().getResource("/Images/article370_blur.jpg")));
        movie4_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie5_blur.jpg")));
        seat_combo.setEnabled(true);
        movie_number = 2;
        
//        seat_combo.setEnabled(true);
//        seat_no_combo.setEnabled(true);
//        snacks_combo.setEnabled(true);
//        snack_qty_combo.setEnabled(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_movie2_labelMouseClicked

    private void movie3_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie3_labelMouseClicked
        movie1_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein_blur.jpg")));
        movie2_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie4_blur.jpg")));
        movie3_label.setIcon(new ImageIcon(getClass().getResource("/Images/article370.jpg")));
        movie4_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie5_blur.jpg")));
        seat_combo.setEnabled(true);
        movie_number = 3;
       

//        seat_combo.setEnabled(true);
//        seat_no_combo.setEnabled(true);
//        snacks_combo.setEnabled(true);
//        snack_qty_combo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_movie3_labelMouseClicked

    private void movie4_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie4_labelMouseClicked
        movie1_label.setIcon(new ImageIcon(getClass().getResource("/Images/teribotonmein_blur.jpg")));
        movie2_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie4_blur.jpg")));
        movie3_label.setIcon(new ImageIcon(getClass().getResource("/Images/article370_blur.jpg")));
        movie4_label.setIcon(new ImageIcon(getClass().getResource("/Images/movie5.jpg")));
        seat_combo.setEnabled(true);
        movie_number = 4;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_movie4_labelMouseClicked

    private void snack_qty_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snack_qty_comboActionPerformed
       int j = 0,i = 0;
       String snack_type = snacks_combo.getSelectedItem().toString();
        while(j<=10)
        {
            if(snack_qty_combo.getSelectedItem().toString().equals(String.valueOf(j)))
            {
                snack_qty_label.setText(String.valueOf(j));
               
        
                if(snack_type.equals("Samosa - Rs.100"))
                {
                    while(i<=10)
                    {
                        if(seat_no_combo.getSelectedItem().toString().equals(String.valueOf(i)))
                        {
                            seat_no_label.setText(String.valueOf(i));
                            if(seat_combo.getSelectedItem().equals("Platinum - Rs.200"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((200 * i)+(100 * j),18.0)));
                                total_label.setText(String.valueOf(((200 * i)+(100 * j))+gstAmount((200 * i)+(100 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Diamond - Rs.150"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((150 * i)+(100 * j),18.0)));
                                total_label.setText(String.valueOf(((200 * i)+(100 * j))+gstAmount((150 * i)+(100 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Gold - Rs.100"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((100 * i)+(100*j),18.0)));
                                total_label.setText(String.valueOf(((100 * i)+(100 * j))+ gstAmount((100 * i)+(100 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Silver - Rs.50"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((50 * i)+(100 * j),18.0)));
                                total_label.setText(String.valueOf(((50 * i)+(100 * j))+gstAmount((50 * i)+(100 * j),18.0)));
                            }
  
                        }
                     i = i+1;
                    }
                    
                }
                else if(snack_type.equals("PopCorn - Rs.150"))
                {
                   while(i<=10)
                    {
                        if(seat_no_combo.getSelectedItem().toString().equals(String.valueOf(i)))
                        {
                            seat_no_label.setText(String.valueOf(i));
                            if(seat_combo.getSelectedItem().equals("Platinum - Rs.200"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((200 * i)+(150 * j),18.0)));
                                total_label.setText(String.valueOf(((200 * i)+(150 * j))+gstAmount((200 * i)+(150 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Diamond - Rs.150"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((150 * i)+(150 * j),18.0)));
                                total_label.setText(String.valueOf(((150 * i)+(150 * j))+gstAmount((150 * i)+(150 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Gold - Rs.100"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((100 * i)+(150*j),18.0)));
                                total_label.setText(String.valueOf(((100 * i)+(150 * j))+gstAmount((100 * i)+(150 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Silver - Rs.50"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((50 * i)+(150 * j),18.0)));
                                total_label.setText(String.valueOf(((50 * i)+(150 * j))+gstAmount((50 * i)+(150 * j),18.0)));
                            }
  
                        }
                     i = i+1;
                    }
                }
                else if(snack_type.equals("Coka - Rs.160"))
                {
                    while(i<=10)
                    {
                        if(seat_no_combo.getSelectedItem().toString().equals(String.valueOf(i)))
                        {
                            seat_no_label.setText(String.valueOf(i));
                            if(seat_combo.getSelectedItem().equals("Platinum - Rs.200"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((200 * i)+(160 * j),18.0)));
                                total_label.setText(String.valueOf(((200 * i)+(160 * j))+gstAmount((200 * i)+(160 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Diamond - Rs.150"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((150 * i)+(160 * j),18.0)));
                                total_label.setText(String.valueOf(((150 * i)+(160 * j))+gstAmount((150 * i)+(160 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Gold - Rs.100"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((100 * i)+(160*j),18.0)));
                                total_label.setText(String.valueOf(((100 * i)+(160 * j))+gstAmount((100 * i)+(160 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Silver - Rs.50"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((50 * i)+(160 * j),18.0)));
                                total_label.setText(String.valueOf(((50 * i)+(160 * j))+gstAmount((50 * i)+(160 * j),18.0)));
                            }
  
                        }
                     i = i+1;
                    }
                }
                else if(snack_type.equals("Samosa Coka Combo - Rs.260"))
                {
                   while(i<=10)
                    {
                        if(seat_no_combo.getSelectedItem().toString().equals(String.valueOf(i)))
                        {
                            seat_no_label.setText(String.valueOf(i));
                            if(seat_combo.getSelectedItem().equals("Platinum - Rs.200"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((200 * i)+(260 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Diamond - Rs.150"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((150 * i)+(260 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Gold - Rs.100"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((100 * i)+(260*j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Silver - Rs.50"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((50 * i)+(260 * j),18.0)));
                            }
  
                        }
                     i = i+1;
                    }
                }
                else if(snack_type.equals("Samosa PopCorn Combo - Rs.250"))
                {
                  while(i<=10)
                    {
                        if(seat_no_combo.getSelectedItem().toString().equals(String.valueOf(i)))
                        {
                            seat_no_label.setText(String.valueOf(i));
                            if(seat_combo.getSelectedItem().equals("Platinum - Rs.200"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((200 * i)+(250 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Diamond - Rs.150"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((150 * i)+(250 * j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Gold - Rs.100"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((100 * i)+(250*j),18.0)));
                            }
                            else if(seat_combo.getSelectedItem().equals("Silver - Rs.50"))
                            {
                                gst_label.setText(String.valueOf(gstAmount((50 * i)+(250 * j),18.0)));
                            }
  
                        }
                     i = i+1;
                    }
                }
            }
            j = j+1;
            
        
        } // TODO add your handling code here:
    }//GEN-LAST:event_snack_qty_comboActionPerformed

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7AncestorAdded

    private void movie1_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie1_labelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_movie1_labelMouseEntered

    private void proceed_to_next_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceed_to_next_btnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_proceed_to_next_btnMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Bookmyshowframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookmyshowframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookmyshowframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookmyshowframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookmyshowframe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel gst_label;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel movie1_label;
    private javax.swing.JLabel movie2_label;
    private javax.swing.JLabel movie3_label;
    private javax.swing.JLabel movie4_label;
    private javax.swing.JLabel name_l1;
    private javax.swing.JButton new_btn;
    private javax.swing.JButton proceed_to_next_btn;
    private javax.swing.JComboBox<String> seat_combo;
    private javax.swing.JLabel seat_label;
    private javax.swing.JComboBox<String> seat_no_combo;
    private javax.swing.JLabel seat_no_label;
    private javax.swing.JComboBox<String> snack_qty_combo;
    private javax.swing.JLabel snack_qty_label;
    private javax.swing.JComboBox<String> snacks_combo;
    private javax.swing.JLabel snacks_label;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
