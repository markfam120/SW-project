package project.sw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // Add Student
    public boolean addStudent(Student student) {

        String query =
        "INSERT INTO Students " +
        "(FirstName, LastName, NationalID, Password, Gender, Major) " +
        "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setString(3, student.getNationalId());
            stmt.setString(4, student.getPassword());
            stmt.setString(5, student.getGender());
            stmt.setString(6, student.getMajor());

            return stmt.executeUpdate() > 0;

        } catch (SQLException ex) {

            System.err.println(
            "Error adding student: " + ex.getMessage());

            return false;
        }
    }

    // Update Student
    public boolean updateStudent(Student student) {

        String query =
        "UPDATE Students SET " +
        "FirstName = ?, " +
        "LastName = ?, " +
        "Password = ?, " +
        "Gender = ?, " +
        "Major = ? " +
        "WHERE NationalID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setString(3, student.getPassword());
            stmt.setString(4, student.getGender());
            stmt.setString(5, student.getMajor());
            stmt.setString(6, student.getNationalId());

            return stmt.executeUpdate() > 0;

        } catch (SQLException ex) {

            System.err.println(
            "Error updating student: " + ex.getMessage());

            return false;
        }
    }

    // Delete Student
    public boolean deleteStudent(String nationalId) {

        String query =
        "DELETE FROM Students WHERE NationalID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nationalId);

            return stmt.executeUpdate() > 0;

        } catch (SQLException ex) {

            System.err.println(
            "Error deleting student: " + ex.getMessage());

            return false;
        }
    }

    // Search Students
    public List<Student> searchStudents(String keyword) {

        List<Student> list = new ArrayList<>();

        String query =
        "SELECT * FROM Students " +
        "WHERE NationalID LIKE ? " +
        "OR FirstName LIKE ? " +
        "OR LastName LIKE ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            String searchPattern = "%" + keyword + "%";

            stmt.setString(1, searchPattern);
            stmt.setString(2, searchPattern);
            stmt.setString(3, searchPattern);

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                    list.add(new Student(

                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("NationalID"),
                        rs.getString("Password"),
                        rs.getString("Gender"),
                        rs.getString("Major")

                    ));
                }
            }

        } catch (SQLException ex) {

            System.err.println(
            "Error searching students: " + ex.getMessage());
        }

        return list;
    }

    // Get All Students
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        String query = "SELECT * FROM Students";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                list.add(new Student(

                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("NationalID"),
                    rs.getString("Password"),
                    rs.getString("Gender"),
                    rs.getString("Major")

                ));
            }

        } catch (SQLException ex) {

            System.err.println(
            "Error getting students: " + ex.getMessage());
        }

        return list;
    }
}