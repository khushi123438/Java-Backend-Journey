
package com.khushi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUDOperations {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_backend";
        String username = "root";
        String password = "YOUR_MYSQL_PASSWORD";

        try (Connection con =
                DriverManager.getConnection(url, username, password)) {

            // CREATE
            String insertQuery =
                "INSERT INTO students(name, course) VALUES (?, ?)";

            try (PreparedStatement ps =
                    con.prepareStatement(insertQuery)) {

                ps.setString(1, "Khushi");
                ps.setString(2, "Computer Science");

                int rows = ps.executeUpdate();
                System.out.println(rows + " record inserted!");
            }

            // READ
            String selectQuery = "SELECT * FROM students";

            try (PreparedStatement ps =
                    con.prepareStatement(selectQuery);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("course")
                    );
                }
            }

            // UPDATE
            String updateQuery =
                "UPDATE students SET course = ? WHERE name = ?";

            try (PreparedStatement ps =
                    con.prepareStatement(updateQuery)) {

                ps.setString(1, "Artificial Intelligence");
                ps.setString(2, "Khushi");

                int rows = ps.executeUpdate();
                System.out.println(rows + " record updated!");
            }

            // DELETE
            String deleteQuery =
                "DELETE FROM students WHERE name = ?";

            try (PreparedStatement ps =
                    con.prepareStatement(deleteQuery)) {

                ps.setString(1, "Khushi");

                int rows = ps.executeUpdate();
                System.out.println(rows + " record deleted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
