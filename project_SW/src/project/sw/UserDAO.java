package project.sw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean registerUser(User user) {
        String query = "INSERT INTO users (Username, Password, FirstName, LastName, Gender) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
             
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getFirstName());
            stmt.setString(4, user.getLastName());
            stmt.setString(5, user.getGender());
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException ex) {
            System.err.println("Error registering user: " + ex.getMessage());
            return false;
        }
    }

    public User loginUser(String username, String password) {


    // Admin Login
    String adminQuery =
    "SELECT * FROM admin WHERE Username = ? AND Password = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(adminQuery)) {

        stmt.setString(1, username);
        stmt.setString(2, password);

        try (ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {

                return new User(

                    rs.getString("Username"),
                    rs.getString("Password"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Gender")
                );
            }
        }

    } catch (SQLException ex) {

        System.err.println(
        "Error Admin Login: " + ex.getMessage());
    }

    // Staff Login
    String staffQuery =
    "SELECT * FROM staff WHERE Username = ? AND Password = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(staffQuery)) {

        stmt.setString(1, username);
        stmt.setString(2, password);

        try (ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {

                return new User(

                    rs.getString("Username"),
                    rs.getString("Password"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Gender")
                );
            }
        }

    } catch (SQLException ex) {

        System.err.println(
        "Error Staff Login: " + ex.getMessage());
    }

    return null;
}
}
