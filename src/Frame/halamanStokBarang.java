package Frame;

import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class halamanStokBarang extends javax.swing.JFrame {
    private int mouseX, mouseY;
    private DefaultTableModel tabel;
    private Connection kon;
    private PreparedStatement ps;
    private ResultSet rs;
    private Statement state;
    
    public halamanStokBarang() {
        initComponents();
        lihatData();
        txtProduk.requestFocus();
    }
    
    public void bersihkan() {
        txtProduk.setText("");
        txtBrand.setText("");
        txtSeries.setText("");
        txtUkuran.setText("");
        txtWarna.setText("");
        txtStock.setText("");
        txtHarga.setText("");
    }
    
    private void lihatData() {   
        tabel = new DefaultTableModel();
        tabel.addColumn("Produk");
        tabel.addColumn("Brand");
        tabel.addColumn("Series");
        tabel.addColumn("Ukuran");
        tabel.addColumn("Warna");
        tabel.addColumn("Stok");
        tabel.addColumn("Harga");
        try {
            String sql = "SELECT * FROM databarang";
            kon = Koneksi.getConnection();
            ps = kon.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()) {
                tabel.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                });
            }
            tabelBarang.setModel(tabel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        btnRiwayat = new javax.swing.JLabel();
        btnAkun = new javax.swing.JLabel();
        btnBarang = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        panelclose = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        panelIsi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSeries = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUkuran = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtWarna = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        txtHarga = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        PanelMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMenuMouseDragged(evt);
            }
        });
        PanelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelMenuMousePressed(evt);
            }
        });
        PanelMenu.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/profil.png"))); // NOI18N
        PanelMenu.add(jLabel6);
        jLabel6.setBounds(55, 100, 150, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo black.png"))); // NOI18N
        PanelMenu.add(jLabel2);
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
        PanelMenu.add(txtWelcome);
        txtWelcome.setBounds(40, 240, 180, 30);

        btnRiwayat.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        btnRiwayat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRiwayat.setText("RIWAYAT TRANSAKSI");
        btnRiwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRiwayatMouseClicked(evt);
            }
        });
        PanelMenu.add(btnRiwayat);
        btnRiwayat.setBounds(0, 570, 260, 40);

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
        PanelMenu.add(btnAkun);
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
        PanelMenu.add(btnBarang);
        btnBarang.setBounds(0, 510, 260, 40);

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
        PanelMenu.add(btnHome);
        btnHome.setBounds(0, 390, 260, 40);

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelMenu.add(username);
        username.setBounds(60, 265, 140, 40);

        getContentPane().add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 700));

        panelclose.setBackground(new java.awt.Color(255, 255, 255));
        panelclose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelcloseMouseDragged(evt);
            }
        });
        panelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelcloseMousePressed(evt);
            }
        });
        panelclose.setLayout(null);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cancel.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        panelclose.add(btnClose);
        btnClose.setBounds(940, 10, 30, 40);

        getContentPane().add(panelclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 980, 50));

        panelIsi.setBackground(new java.awt.Color(204, 204, 204));
        panelIsi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelIsiMouseDragged(evt);
            }
        });
        panelIsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelIsiMousePressed(evt);
            }
        });
        panelIsi.setLayout(null);
        panelIsi.add(jLabel1);
        jLabel1.setBounds(120, 330, 0, 0);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DATA BARANG ");
        panelIsi.add(jLabel3);
        jLabel3.setBounds(30, 30, 430, 40);

        btnHapus.setBackground(new java.awt.Color(0, 0, 0));
        btnHapus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(225, 225, 225));
        btnHapus.setText("Hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelIsi.add(btnHapus);
        btnHapus.setBounds(820, 560, 120, 40);

        btnTambah.setBackground(new java.awt.Color(0, 0, 0));
        btnTambah.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(225, 225, 225));
        btnTambah.setText("Tambah");
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        panelIsi.add(btnTambah);
        btnTambah.setBounds(20, 560, 100, 40);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("__________________________________");
        panelIsi.add(jLabel8);
        jLabel8.setBounds(30, 40, 930, 70);

        txtProduk.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProduk.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdukActionPerformed(evt);
            }
        });
        panelIsi.add(txtProduk);
        txtProduk.setBounds(90, 180, 290, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Produk");
        panelIsi.add(jLabel12);
        jLabel12.setBounds(20, 180, 80, 30);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Brand");
        panelIsi.add(jLabel13);
        jLabel13.setBounds(20, 230, 80, 30);

        txtBrand.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBrand.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        panelIsi.add(txtBrand);
        txtBrand.setBounds(90, 230, 290, 30);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Series");
        panelIsi.add(jLabel10);
        jLabel10.setBounds(20, 280, 80, 30);

        txtSeries.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSeries.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeriesActionPerformed(evt);
            }
        });
        panelIsi.add(txtSeries);
        txtSeries.setBounds(90, 280, 290, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ukuran");
        panelIsi.add(jLabel11);
        jLabel11.setBounds(20, 330, 80, 30);

        txtUkuran.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUkuran.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUkuranActionPerformed(evt);
            }
        });
        panelIsi.add(txtUkuran);
        txtUkuran.setBounds(90, 330, 290, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Warna");
        panelIsi.add(jLabel14);
        jLabel14.setBounds(20, 380, 80, 30);

        txtWarna.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtWarna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });
        panelIsi.add(txtWarna);
        txtWarna.setBounds(90, 380, 290, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Stok");
        panelIsi.add(jLabel9);
        jLabel9.setBounds(20, 430, 80, 30);

        txtStock.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        panelIsi.add(txtStock);
        txtStock.setBounds(90, 430, 290, 30);

        btnUbah.setBackground(new java.awt.Color(0, 0, 0));
        btnUbah.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(225, 225, 225));
        btnUbah.setText("Ubah");
        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        panelIsi.add(btnUbah);
        btnUbah.setBounds(150, 560, 100, 40);

        btnBersih.setBackground(new java.awt.Color(0, 0, 0));
        btnBersih.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBersih.setForeground(new java.awt.Color(225, 225, 225));
        btnBersih.setText("Bersih");
        btnBersih.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });
        panelIsi.add(btnBersih);
        btnBersih.setBounds(280, 560, 100, 40);

        tabelBarang.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabelBarang.setForeground(new java.awt.Color(51, 51, 51));
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Produk", "Brand", "Series", "Ukuran", "Warna", "Stok", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelBarang);
        if (tabelBarang.getColumnModel().getColumnCount() > 0) {
            tabelBarang.getColumnModel().getColumn(0).setResizable(false);
            tabelBarang.getColumnModel().getColumn(1).setResizable(false);
            tabelBarang.getColumnModel().getColumn(2).setResizable(false);
            tabelBarang.getColumnModel().getColumn(3).setResizable(false);
            tabelBarang.getColumnModel().getColumn(4).setResizable(false);
            tabelBarang.getColumnModel().getColumn(5).setResizable(false);
            tabelBarang.getColumnModel().getColumn(6).setResizable(false);
        }

        panelIsi.add(jScrollPane2);
        jScrollPane2.setBounds(400, 180, 550, 360);

        txtHarga.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHarga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        panelIsi.add(txtHarga);
        txtHarga.setBounds(90, 480, 290, 30);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Harga");
        panelIsi.add(jLabel15);
        jLabel15.setBounds(20, 480, 80, 30);

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
        panelIsi.add(txtCari);
        txtCari.setBounds(690, 130, 200, 30);

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/loupe.png"))); // NOI18N
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        panelIsi.add(btnCari);
        btnCari.setBounds(900, 130, 50, 30);

        getContentPane().add(panelIsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 980, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWelcomeMouseClicked

    }//GEN-LAST:event_txtWelcomeMouseClicked

    private void PanelMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMenuMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_PanelMenuMouseDragged

    private void PanelMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMenuMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_PanelMenuMousePressed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void panelcloseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcloseMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_panelcloseMouseDragged

    private void panelcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcloseMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panelcloseMousePressed

    private void panelIsiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIsiMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_panelIsiMouseDragged

    private void panelIsiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIsiMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panelIsiMousePressed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        halamanUtama menu = new halamanUtama();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String produk = txtProduk.getText();
        String brand = txtBrand.getText();
        String series = txtSeries.getText();
        String ukuran = txtUkuran.getText();
        String warna = txtWarna.getText();
        String stok = txtStock.getText();
        String harga = txtHarga.getText();
        
        try {
            String sql = "insert into databarang (Produk, Brand, Series, Ukuran, Warna, Stok, Harga) values(?,?,?,?,?,?,?)";
            kon = Koneksi.getConnection();
            ps = kon.prepareStatement(sql);
            
            if (produk.trim().isEmpty() && brand.trim().isEmpty() && series.trim().isEmpty() && ukuran.trim().isEmpty() && warna.trim().isEmpty() && stok.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Silahkan Lengkapi Data");
            } else {
                ps.setString(1, produk.trim());
                ps.setString(2, brand.trim());
                ps.setString(3, series.trim());
                ps.setString(4, ukuran.trim());
                ps.setString(5, warna.trim());
                ps.setString(6, stok.trim());
                ps.setString(7, harga.trim());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            }
            bersihkan();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        lihatData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sql = "DELETE FROM databarang WHERE produk ='"+txtProduk.getText()+"'";
            kon = Koneksi.getConnection();
            ps = kon.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        lihatData();
        bersihkan();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdukActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeriesActionPerformed

    private void txtUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUkuranActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String produk = txtProduk.getText();
        String brand = txtBrand.getText();
        String series = txtSeries.getText();
        String ukuran = txtUkuran.getText();
        String warna = txtWarna.getText();
        String stok = txtStock.getText();
        String harga = txtHarga.getText();
        
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Mengubah Data?", "Konfirmasi", JOptionPane.YES_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            try {
                String sql = "UPDATE databarang SET Produk ='"+produk+"',"
                            +"Brand='"+brand+"',"
                            +"Series='"+series+"',"
                            +"Ukuran='"+ukuran+"',"
                            +"Warna='"+warna+"',"
                            +"Stok='"+stok+"',"
                            +"Harga='"+harga+"' WHERE series='"+series+"'";
                kon = Koneksi.getConnection();
                state = kon.createStatement();
                state.executeUpdate(sql); 
                
                int baris = tabelBarang.getSelectedRow();
                tabel.setValueAt(produk, baris, 0);
                tabel.setValueAt(brand, baris, 1);
                tabel.setValueAt(series, baris, 2);
                tabel.setValueAt(ukuran, baris, 3);
                tabel.setValueAt(warna, baris, 4);
                tabel.setValueAt(stok, baris, 5);
                tabel.setValueAt(harga, baris, 6);
                
                lihatData();
                bersihkan();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        bersihkan();
        txtProduk.requestFocus();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        int baris = tabelBarang.getSelectedRow();
        try {
            String produk = tabelBarang.getValueAt(baris, 0).toString();
            String brand = tabelBarang.getValueAt(baris, 1).toString();
            String series = tabelBarang.getValueAt(baris, 2).toString();
            String ukuran = tabelBarang.getValueAt(baris, 3).toString();
            String warna = tabelBarang.getValueAt(baris, 4).toString();
            String stok = tabelBarang.getValueAt(baris, 5).toString();
            String harga = tabelBarang.getValueAt(baris, 6).toString();
            
            txtProduk.setText(String.valueOf(produk));
            txtBrand.setText(String.valueOf(brand));
            txtSeries.setText(String.valueOf(series));
            txtUkuran.setText(String.valueOf(ukuran));
            txtWarna.setText(String.valueOf(warna));
            txtStock.setText(String.valueOf(stok));
            txtHarga.setText(String.valueOf(harga));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void btnBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseClicked
        halamanStokBarang barang = new halamanStokBarang();
        barang.show();
        dispose();
    }//GEN-LAST:event_btnBarangMouseClicked

    private void btnAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAkunMouseClicked
        halamanProfil akun = new halamanProfil();
        akun.show();
        dispose();
    }//GEN-LAST:event_btnAkunMouseClicked

    private void btnRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMouseClicked
        halamanRiwayat rt = new halamanRiwayat();
        rt.show();
        dispose();
    }//GEN-LAST:event_btnRiwayatMouseClicked

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked
        
    }//GEN-LAST:event_txtCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        int baris = tabelBarang.getRowCount();
        for(int a = 0 ; a < baris ; a++){
            tabel.removeRow(0);
        }
        
        String cari = txtCari.getText();
        try{
           String sql = "SELECT * FROM databarang WHERE Produk  LIKE '%"+cari+"%' OR `Brand` LIKE '%"+cari+"%' ";
           kon = Koneksi.getConnection();//memanggil koneksi
           state = kon.createStatement();//membuat statement
           rs = state.executeQuery(sql);//menjalanakn query
           
           while (rs.next()){
                //menampung data sementara
                String Produk = rs.getString("Produk");
                String Brand = rs.getString("Brand");
                String Series = rs.getString("Series");
                String Ukuran = rs.getString("Ukuran");
                String Warna = rs.getString("Warna");
                String Stok = rs.getString("Stok");
                String Harga = rs.getString("Harga");
                    
                //masukan semua data kedalam array
                String[] data = {Produk, Brand, Series, Ukuran, Warna, Stok, Harga};
                //menambahakan baris sesuai dengan data yang tersimpan diarray
                tabel.addRow(data);
            }
            //mengeset nilai yang ditampung agar muncul di table
            tabelBarang.setModel(tabel);
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btnCariActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel btnAkun;
    private javax.swing.JLabel btnBarang;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCari;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRiwayat;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelIsi;
    private javax.swing.JPanel panelclose;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    public static final javax.swing.JTextField txtProduk = new javax.swing.JTextField();
    private javax.swing.JTextField txtSeries;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtUkuran;
    private javax.swing.JTextField txtWarna;
    private javax.swing.JLabel txtWelcome;
    public static final javax.swing.JLabel username = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
