
package Frame;

import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class halamanRiwayat extends javax.swing.JFrame {
    private int mouseX, mouseY;
    public DefaultTableModel tabel;
    public Connection kon;
    public Statement state;
    public ResultSet rs;
    
    public halamanRiwayat() {
        initComponents();
        String header[] = {"Nama", "Produk", "Brand", "Series", "Ukuran", "Warna", "Jumlah", "Total Biaya"};
        tabel = new DefaultTableModel(header, 0);
        lihatData();
        tabelRiwayat.setModel(tabel);
    }

    public void lihatData() {
        try {
            kon = Koneksi.getConnection();
            state = kon.createStatement();
            String sql = "SELECT * FROM pembelian";
            rs = state.executeQuery(sql);
            while(rs.next()) {
                Object[] obj = new Object[25];
                obj[0] = rs.getString("nama");
                obj[1] = rs.getString("produk");
                obj[2] = rs.getString("brand");
                obj[3] = rs.getString("series");
                obj[4] = rs.getString("ukuran");
                obj[5] = rs.getString("warna");
                obj[6] = rs.getString("jumlah");
                obj[7] = rs.getString("harga");
                tabel.addRow(obj);
            }
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
        btnCariData = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelRiwayat = new javax.swing.JTable();

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

        getContentPane().add(panelclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -10, 970, 50));

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
        jLabel3.setText("RIWAYAT PEMBAYARAN");
        panelIsi.add(jLabel3);
        jLabel3.setBounds(40, 20, 430, 40);

        btnCariData.setBackground(new java.awt.Color(255, 255, 255));
        btnCariData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/loupe.png"))); // NOI18N
        panelIsi.add(btnCariData);
        btnCariData.setBounds(920, 100, 30, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("_______________________________");
        panelIsi.add(jLabel8);
        jLabel8.setBounds(40, 20, 850, 70);

        tabelRiwayat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabelRiwayat.setForeground(new java.awt.Color(51, 51, 51));
        tabelRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nama", "produk", "brand", "series", "ukuran", "warna", "jumlah", "harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRiwayatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelRiwayat);
        if (tabelRiwayat.getColumnModel().getColumnCount() > 0) {
            tabelRiwayat.getColumnModel().getColumn(0).setResizable(false);
            tabelRiwayat.getColumnModel().getColumn(2).setResizable(false);
            tabelRiwayat.getColumnModel().getColumn(3).setResizable(false);
            tabelRiwayat.getColumnModel().getColumn(4).setResizable(false);
            tabelRiwayat.getColumnModel().getColumn(5).setResizable(false);
            tabelRiwayat.getColumnModel().getColumn(6).setResizable(false);
            tabelRiwayat.getColumnModel().getColumn(7).setResizable(false);
        }

        panelIsi.add(jScrollPane2);
        jScrollPane2.setBounds(40, 130, 840, 460);

        getContentPane().add(panelIsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 920, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWelcomeMouseClicked

    }//GEN-LAST:event_txtWelcomeMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        halamanUtama menu = new halamanUtama();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

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

    private void tabelRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRiwayatMouseClicked

    }//GEN-LAST:event_tabelRiwayatMouseClicked

    private void panelIsiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIsiMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_panelIsiMouseDragged

    private void panelIsiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIsiMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panelIsiMousePressed

    private void btnRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMouseClicked
        halamanRiwayat rt = new halamanRiwayat();
        rt.show();
        dispose();
    }//GEN-LAST:event_btnRiwayatMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel btnAkun;
    private javax.swing.JLabel btnBarang;
    private javax.swing.JButton btnCariData;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRiwayat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelIsi;
    private javax.swing.JPanel panelclose;
    private javax.swing.JTable tabelRiwayat;
    private javax.swing.JLabel txtWelcome;
    public static final javax.swing.JLabel username = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
