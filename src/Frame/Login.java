package Frame;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private int mouseX, mouseY;
    Connection kon;
    Statement state;
    ResultSet rs;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnregis = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        panelClose = new javax.swing.JPanel();
        btnexit = new javax.swing.JLabel();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(590, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelLoginMouseDragged(evt);
            }
        });
        panelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelLoginMousePressed(evt);
            }
        });
        panelLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Email");
        panelLogin.add(jLabel1);
        jLabel1.setBounds(180, 90, 180, 25);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        panelLogin.add(jLabel2);
        jLabel2.setBounds(180, 160, 180, 25);

        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        panelLogin.add(txtPass);
        txtPass.setBounds(170, 190, 200, 30);

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
        panelLogin.add(btnregis);
        btnregis.setBounds(320, 260, 180, 40);

        btnlogin.setBackground(new java.awt.Color(0, 0, 0));
        btnlogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        panelLogin.add(btnlogin);
        btnlogin.setBounds(40, 260, 180, 40);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo white.png"))); // NOI18N
        panelLogin.add(logo);
        logo.setBounds(180, 30, 180, 50);

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        panelLogin.add(txtEmail);
        txtEmail.setBounds(170, 120, 200, 30);

        getContentPane().add(panelLogin);
        panelLogin.setBounds(-5, 40, 540, 340);

        panelClose.setBackground(new java.awt.Color(255, 255, 255));
        panelClose.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelCloseMouseDragged(evt);
            }
        });
        panelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCloseMousePressed(evt);
            }
        });
        panelClose.setLayout(null);

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cancel.png"))); // NOI18N
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnexitMousePressed(evt);
            }
        });
        panelClose.add(btnexit);
        btnexit.setBounds(520, 12, 30, 30);

        getContentPane().add(panelClose);
        panelClose.setBounds(-20, -10, 560, 50);

        setSize(new java.awt.Dimension(530, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void panelCloseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_panelCloseMouseDragged

    private void panelCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panelCloseMousePressed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        String sql = "SELECT * FROM pegawai WHERE email = '"+txtEmail.getText()+"'";
        try {  
            kon = Koneksi.getConnection();
            state = kon.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()) {
                if (rs.getString("password").equals(txtPass.getText())) {
                    halamanUtama menu = new halamanUtama();
                    menu.username.setText(rs.getString(2));
                    
                    halamanRiwayat riwayat = new halamanRiwayat();
                    riwayat.username.setText(rs.getString(2));
                    
                    halamanStokBarang barang = new halamanStokBarang();
                    barang.username.setText(rs.getString(2));
                    
                    halamanProfil akun = new halamanProfil();
                    akun.txtUsername.setText(" "+rs.getString(2));
                    akun.txtEmail.setText(" "+rs.getString(1));
                    akun.txtTelepon.setText(" "+rs.getString(4));
                    akun.txtKelamin.setText(" "+rs.getString(5));
                    
                    halamanPembelian beli = new halamanPembelian();
                    beli.txtNama.setText(rs.getString(2));
                    
                    halamanSepatu.username.setText(rs.getString(2));
                    halamanPakaian.username.setText(rs.getString(2));
                    halamanAksesoris.username.setText(rs.getString(2));
                    halamanPeralatan.username.setText(rs.getString(2));
                    menu.show();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Password Salah");
                    txtPass.setText("");
                    txtPass.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "User Tidak Ditemukan");
                txtEmail.setText("");
                txtPass.setText("");
                txtEmail.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Login");
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnexitMousePressed

    private void panelLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_panelLoginMouseDragged

    private void panelLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panelLoginMousePressed

    private void btnregisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregisMouseClicked
        
    }//GEN-LAST:event_btnregisMouseClicked

    private void btnregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisActionPerformed
        Register reg = new Register();
        reg.show();
        dispose();
    }//GEN-LAST:event_btnregisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(() -> {
            Login log1 = new Login();
            log1.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
