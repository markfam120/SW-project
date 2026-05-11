package project.sw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    // Modify this connection string as per your SQL Server configuration
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=CollegeAdmission;user=sa;password=12345;encrypt=false;trustServerCertificate=true;";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Cannot Load JDBC Driver !!!\n" + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database connection failed !!!\n" + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}
