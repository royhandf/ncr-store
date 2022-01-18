/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Database.Koneksi;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF
 */
public class dataKaos extends dataPakaianBasket {
    public dataKaos() {
            
    }

    @Override
    public void cetakData() {
        try {
            kon = Koneksi.getConnection();
            state = kon.createStatement();
            String sql = "SELECT * FROM databarang WHERE Produk ='Kaos'";
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
            JOptionPane.showMessageDialog(null ,e);
        }
        
    }
}
