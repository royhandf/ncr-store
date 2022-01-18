package Data;

import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dataPeralatanBasket extends basketballStore {
    public Connection kon;
    public PreparedStatement ps;
    public ResultSet rs;
    public Statement state;
    public DefaultTableModel tabel;
    
    public dataPeralatanBasket() {
        
    }
    
    @Override
    public void cetakData() {
        try {
            int baris = 0;
            String sql = "SELECT * FROM databarang WHERE Produk IN ('Sleeve','Bola','Kaos kaki','Headband')";
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
                baris++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
//    @Override
//    public void insertData() {
//        try {
//            kon = Koneksi.getConnection();
//            String sql = "INSERT INTO databarang values (?,?,?,?,?,?,?)";
//            ps = kon.prepareStatement(sql);
//            ps.setString(1, getProduk());
//            ps.setString(2, getBrand());
//            ps.setString(3, getSeries());
//            ps.setString(4, getUkuran());
//            ps.setString(5, getWarna());
//            ps.setString(6, getStok());
//            ps.setString(7, getHarga());
//            
//            int i = ps.executeUpdate();
//            if (i == 1) {
//                JOptionPane.showMessageDialog(null, "Aksesoris"+getBrand()+ " " +getSeries()+ " Berhasil Ditambahkan");
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Data Belum Terisi Semua");
//        }
//    }
//    
//    @Override
//    public void updateData() {
//        try {
//            kon = Koneksi.getConnection();
//            String sql = "UPDATE databarang SET Warna = ?, Stok = ?, Harga = ? WHERE Produk = '"+ getProduk() + "'";
//            ps = kon.prepareStatement(sql);
//            ps.setString(5, getWarna());
//            ps.setString(6, getStok());
//            ps.setString(7, getHarga());
//            
//            int i = ps.executeUpdate();
//            if (i == 1) {
//                JOptionPane.showMessageDialog(null, "Aksesoris"+getBrand()+ " " +getSeries()+ " Berhasil Diubah");
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Data Belum Terisi Semua");
//        }
//    }
//    
//    @Override
//    public void hapusData() {
//        kon = null;
//        state = null;
//        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data Ini?", "Konfirmasi", JOptionPane.YES_OPTION);
//        if (konfirmasi == JOptionPane.YES_OPTION) {
//            try {
//                kon = Koneksi.getConnection();
//                String sql = "DELETE FROM databarang WHERE Produk = '"+getProduk()+"'";
//                ps = kon.prepareStatement(sql);
//                int i = ps.executeUpdate();
//                if (i == 1) {
//                    JOptionPane.showMessageDialog(null, getBrand()+" "+getSeries()+" Berhasil Dihapus");
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//    }
}
