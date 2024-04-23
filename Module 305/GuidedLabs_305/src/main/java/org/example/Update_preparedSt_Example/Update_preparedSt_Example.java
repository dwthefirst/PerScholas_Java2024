package org.example.Update_preparedSt_Example;

import java.sql.*;

public class Update_preparedSt_Example {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            String sql = "UPDATE EMPLOYEES SET firstName=?, lastName=? WHERE employeeNumber = ?";

            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1, "Gary");
            prepStmt.setString(2, "Larson");
            prepStmt.setInt(3, 0003);

            int affectedRows = prepStmt.executeUpdate();

            prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1, "Gary");
            prepStmt.setString(2, "Larson");
            prepStmt.setLong(3, 0003);

            int rowsAffected = prepStmt.executeUpdate();
            System.out.println("ROWS AFFECTED: " + rowsAffected);

            sql = "SELECT * FROM EMPLOYEES WHERE employeeNumber=?";
            prepStmt = connection.prepareStatement(sql);
            prepStmt.setInt(1, 0003);
            ResultSet result = prepStmt.executeQuery();
            while(result.next()) {
                System.out.println(result.getInt("employeeNumber"));
                System.out.println(result.getString("firstName"));
                System.out.println(result.getString("lastName"));
                System.out.println(result.getString("email"));
                System.out.println(result.getString("officeCode"));
            }


        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
