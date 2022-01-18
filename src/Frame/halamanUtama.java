package Frame;


public class halamanUtama extends javax.swing.JFrame {
    private int mouseX, mouseY, koordinatX, koordinatY;
    
    
    public halamanUtama() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JLabel();
        btnAkun = new javax.swing.JLabel();
        btnBarang = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAksesoris = new javax.swing.JButton();
        btnSepatu = new javax.swing.JButton();
        btnPakaian = new javax.swing.JButton();
        btnPeralatan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1050, 14, 34, 15);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

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

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/aksesoris.png"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(700, 170, 180, 360);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/nike.png"))); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(40, 170, 180, 360);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pakaian.png"))); // NOI18N
        jPanel5.add(jLabel10);
        jLabel10.setBounds(260, 170, 180, 360);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/perlengkapan.png"))); // NOI18N
        jPanel5.add(jLabel11);
        jLabel11.setBounds(480, 170, 180, 360);

        btnAksesoris.setBackground(new java.awt.Color(0, 0, 0));
        btnAksesoris.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnAksesoris.setForeground(new java.awt.Color(255, 255, 255));
        btnAksesoris.setText("AKSESORIS");
        btnAksesoris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAksesoris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAksesorisActionPerformed(evt);
            }
        });
        jPanel5.add(btnAksesoris);
        btnAksesoris.setBounds(700, 528, 180, 40);

        btnSepatu.setBackground(new java.awt.Color(0, 0, 0));
        btnSepatu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSepatu.setForeground(new java.awt.Color(255, 255, 255));
        btnSepatu.setText("SEPATU");
        btnSepatu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepatuActionPerformed(evt);
            }
        });
        jPanel5.add(btnSepatu);
        btnSepatu.setBounds(40, 528, 180, 40);

        btnPakaian.setBackground(new java.awt.Color(0, 0, 0));
        btnPakaian.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnPakaian.setForeground(new java.awt.Color(255, 255, 255));
        btnPakaian.setText("PAKAIAN");
        btnPakaian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPakaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPakaianActionPerformed(evt);
            }
        });
        jPanel5.add(btnPakaian);
        btnPakaian.setBounds(260, 528, 180, 40);

        btnPeralatan.setBackground(new java.awt.Color(0, 0, 0));
        btnPeralatan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPeralatan.setForeground(new java.awt.Color(255, 255, 255));
        btnPeralatan.setText("PERALATAN BASKET");
        btnPeralatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeralatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeralatanActionPerformed(evt);
            }
        });
        jPanel5.add(btnPeralatan);
        btnPeralatan.setBounds(480, 528, 180, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("PRODUK");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(40, 30, 450, 50);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("_______________________________");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(40, 30, 850, 70);

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

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cancel.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel6.add(btnExit);
        btnExit.setBounds(880, -20, 30, 80);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 920, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        koordinatX = evt.getXOnScreen();
        koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void txtWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWelcomeMouseClicked

    }//GEN-LAST:event_txtWelcomeMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        koordinatX = evt.getXOnScreen();
        koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        koordinatX = evt.getXOnScreen();
        koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
       
    }//GEN-LAST:event_jPanel4MousePressed

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

    private void btnAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAkunMouseClicked
        halamanProfil akun = new halamanProfil();
        akun.show();
        dispose();
    }//GEN-LAST:event_btnAkunMouseClicked

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        halamanRiwayat rt = new halamanRiwayat();
        rt.show();
        dispose();
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnAksesorisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAksesorisActionPerformed
        halamanAksesoris akses = new halamanAksesoris();
        akses.show();
        dispose();
    }//GEN-LAST:event_btnAksesorisActionPerformed

    private void btnPakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPakaianActionPerformed
        halamanPakaian pakaian = new halamanPakaian();
        pakaian.show();
        dispose();
    }//GEN-LAST:event_btnPakaianActionPerformed

    private void btnPeralatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeralatanActionPerformed
        halamanPeralatan alat = new halamanPeralatan();
        alat.show();
        dispose();
    }//GEN-LAST:event_btnPeralatanActionPerformed

    private void btnSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepatuActionPerformed
        halamanSepatu sepatu = new halamanSepatu();
        sepatu.show();
        dispose();
    }//GEN-LAST:event_btnSepatuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAksesoris;
    private javax.swing.JLabel btnAkun;
    private javax.swing.JLabel btnBarang;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnPakaian;
    private javax.swing.JButton btnPeralatan;
    private javax.swing.JButton btnSepatu;
    private javax.swing.JLabel btnTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel txtWelcome;
    public static final javax.swing.JLabel username = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
