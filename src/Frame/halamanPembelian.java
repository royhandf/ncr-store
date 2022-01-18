/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class halamanPembelian extends javax.swing.JFrame {
    private int koordinatX, koordinatY, mouseX, mouseY;
    private DefaultTableModel tabel;
    private Connection kon;
    private Statement state;
    private ResultSet rs;
    private PreparedStatement ps;
    
    public halamanPembelian() {
        initComponents();
        txtJumlah.requestFocus();
    }

//    private void total(){
//        String harga = txtTotal.getText();
//        String jumlah = txtJumlah.getText();
//        
//        int hargaa = Integer.parseInt(harga);
//        try{
//        int jumlahh = Integer.parseInt(jumlah);
//        
//        int total = hargaa * jumlahh;
//        String total_harga = String.valueOf(total);
//        
//        txtTotal.setText(total_harga);
//        }catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(null, "Only Number");
//            txtJumlah.setText(null);
//        }
//    }
    
    public void bersihkan() {
        txtNama.setText("");
        txtProduk.setText("");
        txtBrand.setText("");
        txtSeries.setText("");
        txtUkuran.setText("");
        txtWarna.setText("");
        txtJumlah.setText("");
        txtTotal.setText("");
        txtHarga.setText("");
        txtBayar.setText("");
        txtKembalian.setText("");
    }
    
    public void insertPembelian() {
        String nama = txtNama.getText();
        String produk = txtProduk.getText();
        String brand = txtBrand.getText();
        String series = txtSeries.getText();
        String ukuran = txtUkuran.getText();
        String warna = txtWarna.getText();
        String jumlah = txtJumlah.getText();
        String harga = txtTotal.getText();
        
        try {
            String sql = "INSERT INTO `pembelian`(`nama`, `produk`, `brand`, `series`, `ukuran`, `warna`, `jumlah`, `harga`) VALUES (?,?,?,?,?,?,?,?)";
            kon = Koneksi.getConnection();
            ps = kon.prepareStatement(sql);
            
            ps.setString(1, nama.trim());
            ps.setString(2, produk.trim());
            ps.setString(3, brand.trim());
            ps.setString(4, series.trim());
            ps.setString(5, ukuran.trim());
            ps.setString(6, warna.trim());
            ps.setString(7, jumlah.trim());
            ps.setString(8, harga.trim());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Melakukan Transaksi");
            
            switch (jumlah) {
                case "1": {
                        String sql2 = "update databarang set stok = 4 where Series='"+series+"'";
                        state = kon.createStatement();
                        state.executeUpdate(sql2);
                        break;
                } case "2": {
                        String sql2 = "update databarang set stok = 3 where Series='"+series+"'";
                        state = kon.createStatement();
                        state.executeUpdate(sql2);
                        break;
                } case "3": {
                        String sql2 = "update databarang set stok = 2 where Series='"+series+"'";
                        state = kon.createStatement();
                        state.executeUpdate(sql2);
                        break;
                } case "4": {
                        String sql2 = "update databarang set stok = 1 where Series='"+series+"'";
                        state = kon.createStatement();
                        state.executeUpdate(sql2);
                        break;
                } case "5": {
                        String sql2 = "update databarang set stok = 0 where Series='"+series+"'";
                        state = kon.createStatement();
                        state.executeUpdate(sql2);
                        break;
                } default: {
                    
                }
            }
            
            bersihkan();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JLabel();
        btnAkun = new javax.swing.JLabel();
        btnBarang = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/profil.png"))); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(55, 100, 150, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo black.png"))); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 30, 230, 60);

        txtWelcome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(255, 255, 255));
        txtWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWelcome.setText("Selamat Datang");
        txtWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWelcomeMouseClicked(evt);
            }
        });
        jPanel4.add(txtWelcome);
        txtWelcome.setBounds(40, 240, 180, 30);

        btnTransaksi.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTransaksi.setText("RIWAYAT TRANSAKSI");
        btnTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
        });
        jPanel4.add(btnTransaksi);
        btnTransaksi.setBounds(0, 570, 260, 40);

        btnAkun.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnAkun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAkun.setText("MY ACCOUNT");
        btnAkun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAkunMouseClicked(evt);
            }
        });
        jPanel4.add(btnAkun);
        btnAkun.setBounds(0, 450, 260, 40);

        btnBarang.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBarang.setText("DATA BARANG");
        btnBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBarangMouseClicked(evt);
            }
        });
        jPanel4.add(btnBarang);
        btnBarang.setBounds(0, 510, 260, 40);

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setText("HOME");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jPanel4.add(btnHome);
        btnHome.setBounds(0, 390, 260, 40);

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(username);
        username.setBounds(60, 265, 140, 40);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 700));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(null);
        jPanel5.add(jLabel1);
        jLabel1.setBounds(120, 330, 0, 0);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("PEMBELIAN");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(30, 10, 450, 50);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 46)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("_________________________________");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(30, 10, 870, 70);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Harga ");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(40, 510, 290, 30);

        txtJumlah.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtJumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtJumlahMouseReleased(evt);
            }
        });
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });
        jPanel5.add(txtJumlah);
        txtJumlah.setBounds(380, 140, 480, 35);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Produk");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(40, 160, 330, 30);

        txtProduk.setEditable(false);
        txtProduk.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtProduk.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdukActionPerformed(evt);
            }
        });
        jPanel5.add(txtProduk);
        txtProduk.setBounds(40, 190, 270, 35);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Brand");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(40, 230, 320, 30);

        txtBrand.setEditable(false);
        txtBrand.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtBrand.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        jPanel5.add(txtBrand);
        txtBrand.setBounds(40, 260, 270, 35);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Warna");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(40, 440, 290, 30);

        txtKembalian.setEditable(false);
        txtKembalian.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtKembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });
        jPanel5.add(txtKembalian);
        txtKembalian.setBounds(380, 470, 480, 40);

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel5.add(btnReset);
        btnReset.setBounds(380, 540, 480, 40);

        btnBayar.setBackground(new java.awt.Color(0, 0, 0));
        btnBayar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("BAYAR");
        btnBayar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        jPanel5.add(btnBayar);
        btnBayar.setBounds(380, 360, 480, 50);

        txtWarna.setEditable(false);
        txtWarna.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtWarna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });
        jPanel5.add(txtWarna);
        txtWarna.setBounds(40, 470, 270, 35);

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel5.add(txtTotal);
        txtTotal.setBounds(380, 230, 480, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JUMLAH");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(380, 110, 480, 20);

        txtBayar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBayarKeyReleased(evt);
            }
        });
        jPanel5.add(txtBayar);
        txtBayar.setBounds(380, 310, 480, 40);

        txtHarga.setEditable(false);
        txtHarga.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtHarga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        jPanel5.add(txtHarga);
        txtHarga.setBounds(40, 540, 270, 35);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("TOTAL BIAYA");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(380, 200, 480, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nama Pembeli");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(40, 90, 330, 30);

        txtNama.setEditable(false);
        txtNama.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel5.add(txtNama);
        txtNama.setBounds(40, 120, 270, 35);

        txtSeries.setEditable(false);
        txtSeries.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSeries.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeriesActionPerformed(evt);
            }
        });
        jPanel5.add(txtSeries);
        txtSeries.setBounds(40, 330, 270, 35);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Series");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(40, 300, 290, 30);

        txtUkuran.setEditable(false);
        txtUkuran.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtUkuran.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUkuranActionPerformed(evt);
            }
        });
        jPanel5.add(txtUkuran);
        txtUkuran.setBounds(40, 400, 270, 35);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Ukuran");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(40, 370, 290, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KEMBALIAN");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(380, 440, 480, 20);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 930, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(null);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cancel.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel6.add(btnClose);
        btnClose.setBounds(890, -20, 30, 80);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 930, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWelcomeMouseClicked

    }//GEN-LAST:event_txtWelcomeMouseClicked

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        halamanRiwayat rt = new halamanRiwayat();
        rt.show();
        dispose();
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAkunMouseClicked
        halamanProfil akun = new halamanProfil();
        akun.show();
        dispose();
    }//GEN-LAST:event_btnAkunMouseClicked

    private void btnBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseClicked
        halamanStokBarang barang = new halamanStokBarang();
        barang.show();
        dispose();
    }//GEN-LAST:event_btnBarangMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        halamanUtama menu = new halamanUtama();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        koordinatX = evt.getXOnScreen();
        koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed

    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        koordinatX = evt.getXOnScreen();
        koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        koordinatX = evt.getXOnScreen();
        koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        int beli = Integer.parseInt(txtJumlah.getText());
        int harga1 = Integer.parseInt(txtHarga.getText());
        
        int total = beli * harga1;
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdukActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        int total = Integer.parseInt(txtTotal.getText());
        int bayar = Integer.parseInt(txtBayar.getText());
        
        int kembalian = bayar - total;
        txtKembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtJumlahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJumlahMouseReleased
       
    }//GEN-LAST:event_txtJumlahMouseReleased

    private void txtJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyReleased
        int a, b, c;
        
        a = Integer.valueOf(txtHarga.getText());
        b = Integer.valueOf(txtJumlah.getText());
        c = a * b;
        txtTotal.setText("" + c);
    }//GEN-LAST:event_txtJumlahKeyReleased

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        bersihkan();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyReleased
        
    }//GEN-LAST:event_txtBayarKeyReleased

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        int total = Integer.parseInt(txtTotal.getText());
        int bayar = Integer.parseInt(txtBayar.getText());
        if (bayar >= total) {
            int kembalian = bayar - total;
            txtKembalian.setText(String.valueOf(kembalian));
        } else {
            JOptionPane.showMessageDialog(null, "Uang Tidak Mencukupi");
        }
        
        insertPembelian();
    }//GEN-LAST:event_btnBayarActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeriesActionPerformed

    private void txtUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUkuranActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAkun;
    private javax.swing.JLabel btnBarang;
    private javax.swing.JButton btnBayar;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel btnTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtBayar;
    public static final javax.swing.JTextField txtBrand = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtHarga = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtJumlah = new javax.swing.JTextField();
    private javax.swing.JTextField txtKembalian;
    public static final javax.swing.JTextField txtNama = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtProduk = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtSeries = new javax.swing.JTextField();
    private javax.swing.JTextField txtTotal;
    public static final javax.swing.JTextField txtUkuran = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtWarna = new javax.swing.JTextField();
    private javax.swing.JLabel txtWelcome;
    public static final javax.swing.JLabel username = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
