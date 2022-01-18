package Database;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ncrsport","root","");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return koneksi;
    }
}