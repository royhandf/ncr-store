package Frame;

import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    Connection con;
    Statement state;
    
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnregis = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radiobtnLaki = new javax.swing.JRadioButton();
        radiobtnPerempuan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cancel.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(490, 2, 24, 46);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo white.png"))); // NOI18N
        jPanel2.add(logo);
        logo.setBounds(180, 20, 180, 50);

        btnregis.setBackground(new java.awt.Color(255, 153, 0));
        btnregis.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnregis.setForeground(new java.awt.Color(255, 255, 255));
        btnregis.setText("Register");
        btnregis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregisMouseClicked(evt);
            }
        });
        btnregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisActionPerformed(evt);
            }
        });
        jPanel2.add(btnregis);
        btnregis.setBounds(170, 450, 200, 40);

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel2.add(txtPass);
        txtPass.setBounds(170, 250, 200, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 220, 200, 25);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(180, 150, 180, 25);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 80, 180, 25);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(170, 110, 200, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Jenis Kelamin");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 360, 200, 25);

        radiobtnLaki.setBackground(new java.awt.Color(255, 255, 255));
        btnGrup.add(radiobtnLaki);
        radiobtnLaki.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        radiobtnLaki.setForeground(new java.awt.Color(0, 0, 0));
        radiobtnLaki.setText("Laki-laki");
        radiobtnLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnLakiActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnLaki);
        radiobtnLaki.setBounds(170, 390, 90, 27);

        radiobtnPerempuan.setBackground(new java.awt.Color(255, 255, 255));
        btnGrup.add(radiobtnPerempuan);
        radiobtnPerempuan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        radiobtnPerempuan.setForeground(new java.awt.Color(0, 0, 0));
        radiobtnPerempuan.setText("Perempuan");
        radiobtnPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnPerempuanActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnPerempuan);
        radiobtnPerempuan.setBounds(270, 390, 110, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("No. Telepon");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 290, 200, 25);

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtUser);
        txtUser.setBounds(170, 180, 200, 30);

        txtTelepon.setBackground(new java.awt.Color(255, 255, 255));
        txtTelepon.setForeground(new java.awt.Color(0, 0, 0));
        txtTelepon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtTelepon);
        txtTelepon.setBounds(170, 320, 200, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregisMouseClicked
        
    }//GEN-LAST:event_btnregisMouseClicked

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisActionPerformed
       String email = txtEmail.getText();
       String password = txtPass.getText();
       String username = txtUser.getText();
       String telepon = txtTelepon.getText();
//       
//       txtEmail.setText("email");
//       txtPass.setText("password");
//       txtUser.setText("username");
//       txtTelepon.setText("telepon");
       String jenisKelamin;
       if (radiobtnLaki.isSelected()) {
           jenisKelamin = "Laki-laki";
       } else {
           jenisKelamin = "Perempuan";
       }
       try {
           state =  Koneksi.getConnection().createStatement();
           state.executeUpdate("INSERT INTO pegawai VALUES ('"+ email +"','"+ username +"','"+ password +"','"+ telepon +"','"+ jenisKelamin +"');");
           state.close();
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           Login log = new Login();
           log.show();
           dispose();
       } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan");
        }
    }//GEN-LAST:event_btnregisActionPerformed

    private void radiobtnPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnPerempuanActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void radiobtnLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnLakiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.ButtonGroup btnGrup;
    private javax.swing.JButton btnregis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton radiobtnLaki;
    private javax.swing.JRadioButton radiobtnPerempuan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
