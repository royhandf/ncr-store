
package Data;

import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dataPakaianBasket extends basketballStore {
    public Connection kon;
    public PreparedStatement ps;
    public ResultSet rs;
    public Statement state;
    public DefaultTableModel tabel;
    
    public dataPakaianBasket() {
        
    }
    
    @Override
    public void cetakData() {
        try {
            int baris = 0;
            String sql = "SELECT * FROM databarang WHERE Produk IN ('Jersey','Jaket','Kaos','Celana')";
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
}
