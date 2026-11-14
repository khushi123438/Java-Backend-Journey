import java.sql.*;

public class StudentDAO {

    public void addStudent(String name,
                           String email,
                           String branch) throws SQLException {

        String sql =
            "INSERT INTO student(name,email,branch) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, branch);

            ps.executeUpdate();
        }
    }

    public void viewStudents() throws SQLException {

        String sql = "SELECT * FROM student";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("email") + " " +
                    rs.getString("branch")
                );
            }
        }
    }

    public void deleteStudent(int id) throws SQLException {

        String sql = "DELETE FROM student WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ps.executeUpdate();
        }
    }
}