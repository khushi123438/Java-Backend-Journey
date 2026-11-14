import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ResultSetTypes {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_backend";
        String username = "root";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = st.executeQuery(
                "SELECT * FROM students"
            );

            // Move to first row
            if (rs.first()) {
                System.out.println(rs.getInt(1));
            }

            // Move to last row
            if (rs.last()) {
                System.out.println(rs.getInt(1));
            }

            // Move to previous row
            if (rs.previous()) {
                System.out.println(rs.getInt(1));
            }

            // Move to specific row
            if (rs.absolute(2)) {
                System.out.println(rs.getInt(1));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 