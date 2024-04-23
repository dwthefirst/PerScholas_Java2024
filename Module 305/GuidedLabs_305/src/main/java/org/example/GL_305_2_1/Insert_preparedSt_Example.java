package org.example.GL_305_2_1;

import java.sql.*;

public class Insert_preparedSt_Example {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "admin";

        try {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");

            /* ------ Selecting * FROM Employees ------*/
//            String query = "SELECT * FROM EMPLOYEES";
//            Statement stmt = con.createStatement();
//            ResultSet result = stmt.executeQuery(query);
//            while(result.next()) {
//                String fname = result.getString("firstName");
//                String lname = result.getString("lastName");
//                String email = result.getString("email");
//                System.out.println(fname + " | " + lname + " | " + email);
//            }

            /* ------ Lets insert one record using a prepared statement ------*/
            String sqlQuery = "INSERT INTO EMPLOYEES(officeCode, firstName, lastName, email, extension, reportsTo, VacationHours, employeeNumber, jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
            prepStmt = con.prepareStatement(sqlQuery);
            prepStmt.setInt(1, 6);
            prepStmt.setString(2, "Jamil");
            prepStmt.setString(3, "Fink");
            prepStmt.setString(4, "JJ@gmail.com");
            prepStmt.setString(5, "2759");
            prepStmt.setInt(6, 1143);
            prepStmt.setInt(7, 9);
            prepStmt.setInt(8, 0003); //employee number
            prepStmt.setString(9, "Manager"); //employee number

            int affectedRows = prepStmt.executeUpdate();
            System.out.println(affectedRows + " row(s) affected!!");

//            /* ------ Lets pull data from the database for an inserted record ------*/
//            // Query which needs parameters
//            String query2 = "SELECT * FROM employees WHERE employeeNumber = ?";
//            prepStmt = con.prepareStatement(query2);
//            prepStmt.setInt(1, 0003);
//            // execute select query
//            rs = prepStmt.executeQuery();
//            //Display function to show the ResultSet
//            while(rs.next()) {
//                System.out.println("First Name: " + rs.getString("firstName"));
//                System.out.println("Last Name: " + rs.getString("lastName"));
//                System.out.println("Email: " + rs.getString("email"));
//                System.out.println("Office Code: " + rs.getInt("officeCode"));
//            }


        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println("Duplicate value :(");
        }

        try {
            /* ------ Lets pull data from the database for an inserted record ------*/
            // Query which needs parameters
            String query2 = "SELECT * FROM employees WHERE employeeNumber = ?";
            prepStmt = con.prepareStatement(query2);
            prepStmt.setInt(1, 0003);
            // execute select query
            rs = prepStmt.executeQuery();
            //Display function to show the ResultSet
            while(rs.next()) {
                System.out.println("First Name: " + rs.getString("firstName"));
                System.out.println("Last Name: " + rs.getString("lastName"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Office Code: " + rs.getInt("officeCode"));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
