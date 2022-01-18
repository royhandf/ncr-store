/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Data.*;
import Database.Koneksi;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class halamanPakaian extends javax.swing.JFrame {
    private int koordinatX, koordinatY, mouseX, mouseY;
    private dataPakaianBasket dtPakaian;
    
    public halamanPakaian() {
        initComponents();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPakaian = new dataPakaianBasket();
        dtPakaian.tabel = new DefaultTableModel(header, 0);
        
        dtPakaian.cetakData();
        tabelPakaian.setModel(dtPakaian.tabel);
    }

//    public void lihatData() {
//        tabel.addColumn("Produk");
//        tabel.addColumn("Brand");
//        tabel.addColumn("Series");
//        tabel.addColumn("Ukuran");
//        tabel.addColumn("Warna");
//        tabel.addColumn("Stok");
//        tabel.addColumn("Harga");
//        
//        try {
//            int baris = 0;
//            String sql = "SELECT * FROM databarang WHERE Produk IN ('Jersey','Jaket','Kaos','Celana')";
//            kon = Koneksi.getConnection();
//            ps = kon.prepareStatement(sql);
//            rs = ps.executeQuery(sql);
//            while(rs.next()) {
//                tabel.addRow(new Object[] {
//                    rs.getString(1),
//                    rs.getString(2),
//                    rs.getString(3),
//                    rs.getString(4),
//                    rs.getString(5),
//                    rs.getString(6),
//                    rs.getString(7)
//                });
//                baris++;
//            }
//            tabelPakaian.setModel(tabel);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        } 
//    }
    
//    private void Pencarian() {
//        int baris = tabelPakaian.getRowCount();
//        for(int a = 0 ; a < baris ; a++){
//            tabel.removeRow(0);
//        }
//        
//        String cari = txtCari.getText();
//                
//        try{
//           String sql = "SELECT * FROM databarang WHERE Brand LIKE '%"+cari+"%' OR Series LIKE '%"+cari+"%' OR Warna LIKE '%"+cari+"%' OR Ukuran LIKE '%"+cari+"%' ";
//           kon = Koneksi.getConnection();//memanggil koneksi
//           state = kon.createStatement();//membuat statement
//           rs = state.executeQuery(sql);//menjalanakn query
//           
//           while (rs.next()){
//                //menampung data sementara
//                String Produk = rs.getString("Produk");
//                String Brand = rs.getString("Brand");
//                String Series = rs.getString("Series");
//                String Ukuran = rs.getString("Ukuran");
//                String Warna = rs.getString("Warna");
//                String Stok = rs.getString("Stok");
//                String Harga = rs.getString("Harga");
//                    
//                //masukan semua data kedalam array
//                String[] data = {Produk, Brand, Series, Ukuran, Warna, Stok, Harga};
//                //menambahakan baris sesuai dengan data yang tersimpan diarray
//                tabel.addRow(data);
//            }
//            //mengeset nilai yang ditampung agar muncul di table
//            tabelPakaian.setModel(tabel);
//       } catch (SQLException e) {
//           JOptionPane.showMessageDialog(null, e);
//       }
//    }
    
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPakaian = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnBeli1 = new javax.swing.JButton();
        btnJaket = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnJersey = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnKaos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnCelana = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel3.setText("PAKAIAN");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(40, 30, 450, 50);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("_______________________________");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(40, 30, 850, 70);

        tabelPakaian.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabelPakaian.setForeground(new java.awt.Color(51, 51, 51));
        tabelPakaian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"
            }
        ));
        tabelPakaian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPakaianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPakaian);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(350, 160, 530, 380);

        txtCari.setBackground(new java.awt.Color(255, 255, 255));
        txtCari.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtCari.setForeground(new java.awt.Color(0, 0, 0));
        txtCari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCari.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCariMouseClicked(evt);
            }
        });
        jPanel5.add(txtCari);
        txtCari.setBounds(600, 110, 200, 30);

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/loupe.png"))); // NOI18N
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel5.add(btnCari);
        btnCari.setBounds(810, 110, 50, 30);

        btnKembali.setBackground(new java.awt.Color(0, 0, 0));
        btnKembali.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel5.add(btnKembali);
        btnKembali.setBounds(40, 580, 100, 40);

        btnBeli1.setBackground(new java.awt.Color(0, 0, 0));
        btnBeli1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBeli1.setForeground(new java.awt.Color(255, 255, 255));
        btnBeli1.setText("Beli");
        btnBeli1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeli1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnBeli1);
        btnBeli1.setBounds(780, 570, 100, 40);

        btnJaket.setBackground(new java.awt.Color(0, 0, 0));
        btnJaket.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnJaket.setForeground(new java.awt.Color(255, 255, 255));
        btnJaket.setText("Jaket");
        btnJaket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJaketActionPerformed(evt);
            }
        });
        jPanel5.add(btnJaket);
        btnJaket.setBounds(48, 286, 134, 40);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/jaket.jpg"))); // NOI18N
        jPanel5.add(jLabel5);
        jLabel5.setBounds(50, 160, 130, 130);

        btnJersey.setBackground(new java.awt.Color(0, 0, 0));
        btnJersey.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnJersey.setForeground(new java.awt.Color(255, 255, 255));
        btnJersey.setText("Jersey");
        btnJersey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJersey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJerseyActionPerformed(evt);
            }
        });
        jPanel5.add(btnJersey);
        btnJersey.setBounds(198, 286, 134, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/jersey.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(200, 160, 130, 130);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/jaket.jpg"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(50, 160, 130, 130);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/jersey.jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(200, 160, 130, 130);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Jaket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(48, 286, 134, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Jaket");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(198, 286, 134, 40);

        btnKaos.setBackground(new java.awt.Color(0, 0, 0));
        btnKaos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnKaos.setForeground(new java.awt.Color(255, 255, 255));
        btnKaos.setText("Kaos");
        btnKaos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaosActionPerformed(evt);
            }
        });
        jPanel5.add(btnKaos);
        btnKaos.setBounds(48, 496, 134, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kaos.jpg"))); // NOI18N
        jPanel5.add(jLabel10);
        jLabel10.setBounds(50, 370, 130, 130);

        btnCelana.setBackground(new java.awt.Color(0, 0, 0));
        btnCelana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCelana.setForeground(new java.awt.Color(255, 255, 255));
        btnCelana.setText("Celana");
        btnCelana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCelana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelanaActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelana);
        btnCelana.setBounds(198, 496, 134, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/celana.jpg"))); // NOI18N
        jLabel11.setText("jLabel4");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(200, 370, 130, 130);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 920, 660));

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
        btnClose.setBounds(880, -20, 30, 80);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 920, 40));

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

    private void tabelPakaianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPakaianMouseClicked

    }//GEN-LAST:event_tabelPakaianMouseClicked

    private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked

    }//GEN-LAST:event_txtCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        DefaultTableModel tabel1  = new DefaultTableModel();
        tabel1.addColumn("Produk");
        tabel1.addColumn("Brand");
        tabel1.addColumn("Series");
        tabel1.addColumn("Ukuran");
        tabel1.addColumn("Warna");
        tabel1.addColumn("Stok");
        tabel1.addColumn("Harga");
        
        String cari = txtCari.getText();     
        try {
            int baris = 0;
            String sql = "SELECT * FROM databarang WHERE Brand LIKE '%"+cari+"%' OR Series LIKE '%"+cari+"%' OR Warna LIKE '%"+cari+"%' OR Ukuran LIKE '%"+cari+"%' OR Produk LIKE '%"+cari+"%'";
            Connection kon = Koneksi.getConnection();//memanggil koneksi
            Statement state = kon.createStatement();//membuat statement
            ResultSet rs = state.executeQuery(sql);//menjalanakn query
           
            while(rs.next()) {
                tabel1.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                });
                baris++;
            }
            tabelPakaian.setModel(tabel1);
       } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        halamanUtama menu = new halamanUtama();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnJaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJaketActionPerformed
        dtPakaian = new dataJaket();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPakaian.tabel = new DefaultTableModel(header, 0);
        dtPakaian.cetakData();
        tabelPakaian.setModel(dtPakaian.tabel);
    }//GEN-LAST:event_btnJaketActionPerformed

    private void btnJerseyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJerseyActionPerformed
        dtPakaian = new dataJersey();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPakaian.tabel = new DefaultTableModel(header, 0);
        dtPakaian.cetakData();
        tabelPakaian.setModel(dtPakaian.tabel);
    }//GEN-LAST:event_btnJerseyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnKaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaosActionPerformed
        dtPakaian = new dataKaos();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPakaian.tabel = new DefaultTableModel(header, 0);
        dtPakaian.cetakData();
        tabelPakaian.setModel(dtPakaian.tabel);
    }//GEN-LAST:event_btnKaosActionPerformed

    private void btnCelanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelanaActionPerformed
        dtPakaian = new dataCelana();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPakaian.tabel = new DefaultTableModel(header, 0);
        dtPakaian.cetakData();
        tabelPakaian.setModel(dtPakaian.tabel);
    }//GEN-LAST:event_btnCelanaActionPerformed

    private void btnBeli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeli1ActionPerformed
        int baris = tabelPakaian.getSelectedRow();
        halamanPembelian beli = new halamanPembelian();
        
        String produk = tabelPakaian.getValueAt(baris, 0).toString();
        beli.txtProduk.setText(produk);
        
        String brand = tabelPakaian.getValueAt(baris, 1).toString();
        beli.txtBrand.setText(brand);
        
        String series = tabelPakaian.getValueAt(baris, 2).toString();
        beli.txtSeries.setText(series);
        
        String ukuran = tabelPakaian.getValueAt(baris, 3).toString();
        beli.txtUkuran.setText(ukuran);
        
        String warna = tabelPakaian.getValueAt(baris, 4).toString();
        beli.txtWarna.setText(warna);
        
        String harga = tabelPakaian.getValueAt(baris, 6).toString();
        beli.txtHarga.setText(harga);
        
        beli.show();
        beli.pack();
        dispose();

    }//GEN-LAST:event_btnBeli1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAkun;
    private javax.swing.JLabel btnBarang;
    private javax.swing.JButton btnBeli1;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCelana;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnJaket;
    private javax.swing.JButton btnJersey;
    private javax.swing.JButton btnKaos;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel btnTransaksi;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelPakaian;
    private javax.swing.JTextField txtCari;
    private javax.swing.JLabel txtWelcome;
    public static final javax.swing.JLabel username = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
