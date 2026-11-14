
package com.khushi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchProcessing {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_backend";
        String username = "root";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            String query =
                "INSERT INTO students (id, name) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            // First student
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.addBatch();

            // Second student
            ps.setInt(1, 2);
            ps.setString(2, "Aman");
            ps.addBatch();

            // Third student
            ps.setInt(1, 3);
            ps.setString(2, "Khushi");
            ps.addBatch();

            // Execute all operations
            int[] result = ps.executeBatch();

            System.out.println("Batch executed successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
