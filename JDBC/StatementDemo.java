import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class StatementDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_backend";
        String username = "root";
        String password = "Naveen112@";

        try (Connection con =
                DriverManager.getConnection(url, username, password)) {

            // Using Statement
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM students"
            );

            System.out.println("Using Statement:");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            rs.close();
            st.close();

            // Using PreparedStatement
            String query =
                "SELECT * FROM students WHERE course = ?";

            try (PreparedStatement ps =
                    con.prepareStatement(query)) {

                ps.setString(1, "Computer Science");

                ResultSet result = ps.executeQuery();

                System.out.println("Using PreparedStatement:");

                while (result.next()) {
                    System.out.println(result.getString("name"));
                }

                result.close();
            }

            // Using CallableStatement
            try (CallableStatement cs =
                    con.prepareCall("{CALL getStudentsByCourse(?)}")) {

                cs.setString(1, "Computer Science");

                ResultSet callableResult = cs.executeQuery();

                System.out.println("Using CallableStatement:");

                while (callableResult.next()) {
                    System.out.println(
                        callableResult.getString("name")
                    );
                }

                callableResult.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 
