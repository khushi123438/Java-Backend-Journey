
package com.khushi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionManagement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_backend";
        String username = "root";
        String password = "your_password";

        Connection con = null;

        try {
            con = DriverManager.getConnection(
                url, username, password
            );

            // Disable auto commit
            con.setAutoCommit(false);

            String debit =
                "UPDATE accounts SET balance = balance - ? WHERE id = ?";

            String credit =
                "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement ps1 = con.prepareStatement(debit);
            ps1.setDouble(1, 1000);
            ps1.setInt(2, 1);

            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(credit);
            ps2.setDouble(1, 1000);
            ps2.setInt(2, 2);

            ps2.executeUpdate();

            // Save both operations
            con.commit();

            System.out.println("Transaction Successful!");

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction Rolled Back!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
