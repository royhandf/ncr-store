package Data;

import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dataSepatuBasket extends basketballStore {
    public Connection kon;
    public PreparedStatement ps;
    public ResultSet rs;
    public Statement state;
    public DefaultTableModel tabel;
    
    public dataSepatuBasket() {
        
    }
    
    @Override
    public void cetakData() {
        try {
            kon = Koneksi.getConnection();
            state = kon.createStatement();
            String sql = "SELECT * FROM databarang WHERE Produk = 'Sepatu'";
            rs = state.executeQuery(sql);
            while(rs.next()) {
                Object[] obj = new Object[25];
                obj[0] = rs.getString("Produk");
                obj[1] = rs.getString("Brand");
                obj[2] = rs.getString("Series");
                obj[3] = rs.getString("Ukuran");
                obj[4] = rs.getString("Warna");
                obj[5] = rs.getString("Stok");
                obj[6] = rs.getString("Harga");
                tabel.addRow(obj);
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
//                JOptionPane.showMessageDialog(null, "Sepatu " +getBrand()+ " " +getSeries()+ " Berhasil Ditambahkan");
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
//                JOptionPane.showMessageDialog(null, "Sepatu " +getBrand()+ " " +getSeries()+ " Berhasil Diubah");
//            }
//        } catch (SQLException ex) {
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
//                    JOptionPane.showMessageDialog(null, "Sepatu "+getBrand()+" "+getSeries()+" Berhasil Dihapus");
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//    }
}
