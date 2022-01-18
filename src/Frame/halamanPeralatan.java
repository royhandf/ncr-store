
package Frame;

import Data.dataBola;
import Data.dataHeadband;
import Data.dataJaket;
import Data.dataKaosKaki;
import Data.dataPeralatanBasket;
import Data.dataSleeve;
import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class halamanPeralatan extends javax.swing.JFrame {
    private int koordinatX, koordinatY, mouseX, mouseY;
    private dataPeralatanBasket dtPeralatan;
    
    public halamanPeralatan() {
        initComponents();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPeralatan = new dataPeralatanBasket();
        dtPeralatan.tabel = new DefaultTableModel(header, 0);
        
        dtPeralatan.cetakData();
        tabelPeralatan.setModel(dtPeralatan.tabel);
    }
    
    public void cariData() {
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
            tabelPeralatan.setModel(tabel1);
       } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }
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
//            tabelPeralatan.setModel(tabel);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        } 
//    }
//    
//    private void Pencarian() {
//        int baris = tabelPeralatan.getRowCount();
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
//            tabelPeralatan.setModel(tabel);
//       } catch (SQLException e) {
//           JOptionPane.showMessageDialog(null, e);
//       }
//    }
    
    public void cetakDataJaket() {
       dataJaket dtJaket = new dataJaket();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JLabel();
        btnAkun = new javax.swing.JLabel();
        btnBarang = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPeralatan = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnBeli1 = new javax.swing.JButton();
        btnSleeve = new javax.swing.JButton();
        btnHeadband = new javax.swing.JButton();
        btnKaosKaki = new javax.swing.JButton();
        btnBola = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel3.setText("PERALATAN BASKET");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(40, 20, 450, 50);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("_______________________________");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(40, 20, 850, 70);

        tabelPeralatan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabelPeralatan.setForeground(new java.awt.Color(51, 51, 51));
        tabelPeralatan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPeralatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPeralatanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPeralatan);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(350, 160, 530, 380);

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
        btnKembali.setBounds(40, 570, 100, 40);

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

        btnSleeve.setBackground(new java.awt.Color(0, 0, 0));
        btnSleeve.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSleeve.setForeground(new java.awt.Color(255, 255, 255));
        btnSleeve.setText("Sleeve");
        btnSleeve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSleeve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSleeveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSleeve);
        btnSleeve.setBounds(48, 286, 134, 40);

        btnHeadband.setBackground(new java.awt.Color(0, 0, 0));
        btnHeadband.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnHeadband.setForeground(new java.awt.Color(255, 255, 255));
        btnHeadband.setText("Headband");
        btnHeadband.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHeadband.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeadbandActionPerformed(evt);
            }
        });
        jPanel5.add(btnHeadband);
        btnHeadband.setBounds(198, 286, 134, 40);

        btnKaosKaki.setBackground(new java.awt.Color(0, 0, 0));
        btnKaosKaki.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnKaosKaki.setForeground(new java.awt.Color(255, 255, 255));
        btnKaosKaki.setText("Kaos Kaki");
        btnKaosKaki.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaosKaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaosKakiActionPerformed(evt);
            }
        });
        jPanel5.add(btnKaosKaki);
        btnKaosKaki.setBounds(48, 496, 134, 40);

        btnBola.setBackground(new java.awt.Color(0, 0, 0));
        btnBola.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBola.setForeground(new java.awt.Color(255, 255, 255));
        btnBola.setText("Bola");
        btnBola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolaActionPerformed(evt);
            }
        });
        jPanel5.add(btnBola);
        btnBola.setBounds(198, 496, 134, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kaoskaki.jpg"))); // NOI18N
        jPanel5.add(jLabel10);
        jLabel10.setBounds(50, 370, 130, 130);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bola.jpg"))); // NOI18N
        jLabel11.setText("jLabel4");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(200, 370, 130, 130);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sleeve.jpg"))); // NOI18N
        jPanel5.add(jLabel5);
        jLabel5.setBounds(50, 160, 130, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/headband.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(200, 160, 130, 130);

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

    private void tabelPeralatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPeralatanMouseClicked
        
    }//GEN-LAST:event_tabelPeralatanMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cariData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked

    }//GEN-LAST:event_txtCariMouseClicked

    private void txtWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWelcomeMouseClicked

    }//GEN-LAST:event_txtWelcomeMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        halamanUtama menu = new halamanUtama();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnSleeveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSleeveActionPerformed
        dtPeralatan = new dataSleeve();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPeralatan.tabel = new DefaultTableModel(header, 0);
        dtPeralatan.cetakData();
        tabelPeralatan.setModel(dtPeralatan.tabel);
    }//GEN-LAST:event_btnSleeveActionPerformed

    private void btnHeadbandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeadbandActionPerformed
        dtPeralatan = new dataHeadband();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPeralatan.tabel = new DefaultTableModel(header, 0);
        dtPeralatan.cetakData();
        tabelPeralatan.setModel(dtPeralatan.tabel);
    }//GEN-LAST:event_btnHeadbandActionPerformed

    private void btnKaosKakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaosKakiActionPerformed
        dtPeralatan = new dataKaosKaki();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPeralatan.tabel = new DefaultTableModel(header, 0);
        dtPeralatan.cetakData();
        tabelPeralatan.setModel(dtPeralatan.tabel);
    }//GEN-LAST:event_btnKaosKakiActionPerformed

    private void btnBolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolaActionPerformed
        dtPeralatan = new dataBola();
        String[] header = {"Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"};
        dtPeralatan.tabel = new DefaultTableModel(header, 0);
        dtPeralatan.cetakData();
        tabelPeralatan.setModel(dtPeralatan.tabel);
    }//GEN-LAST:event_btnBolaActionPerformed

    private void btnBeli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeli1ActionPerformed
        int baris = tabelPeralatan.getSelectedRow();
        halamanPembelian beli = new halamanPembelian();
        
        String produk = tabelPeralatan.getValueAt(baris, 0).toString();
        beli.txtProduk.setText(produk);
        
        String brand = tabelPeralatan.getValueAt(baris, 1).toString();
        beli.txtBrand.setText(brand);
        
        String series = tabelPeralatan.getValueAt(baris, 2).toString();
        beli.txtSeries.setText(series);
        
        String ukuran = tabelPeralatan.getValueAt(baris, 3).toString();
        beli.txtUkuran.setText(ukuran);
        
        String warna = tabelPeralatan.getValueAt(baris, 4).toString();
        beli.txtWarna.setText(warna);
        
        String harga = tabelPeralatan.getValueAt(baris, 6).toString();
        beli.txtHarga.setText(harga);
        
        beli.show();
        beli.pack();
        dispose();
    }//GEN-LAST:event_btnBeli1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAkun;
    private javax.swing.JLabel btnBarang;
    private javax.swing.JButton btnBeli1;
    private javax.swing.JButton btnBola;
    private javax.swing.JButton btnCari;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnHeadband;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnKaosKaki;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSleeve;
    private javax.swing.JLabel btnTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelPeralatan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JLabel txtWelcome;
    public static final javax.swing.JLabel username = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
