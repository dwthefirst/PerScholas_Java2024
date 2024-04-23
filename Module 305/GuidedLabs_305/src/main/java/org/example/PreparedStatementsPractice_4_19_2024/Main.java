package org.example.PreparedStatementsPractice_4_19_2024;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection Successful!");

            // Select all employees whose officecode is 1 and 4.
            System.out.println("ALL EMPLOYEES W/ OFFICE CODE BETWEEN 1 AND 4:");
            String query1 = "SELECT * FROM employees WHERE officecode BETWEEN 1 AND 4 ORDER BY officecode";
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query1);

            while(result.next()) {
                System.out.println(result.getString("employeeNumber") + " | " + result.getString("firstName") + " | " + result.getString("lastName") + " | " + result.getString("officeCode"));
            }

            // Select all orderdetails whose orderNumber is 10100 and 10102.
            System.out.println("all  order details whose orderNumber is 10100 and 10102:".toUpperCase());
            String query2 = "SELECT *\n" +
                    "FROM orderdetails\n" +
                    "WHERE orderNumber BETWEEN 10100 AND 10102\n" +
                    "ORDER BY orderNumber";
            stmt = connection.createStatement();
            result = stmt.executeQuery(query2);

            while(result.next()) {
                int orderNumber = result.getInt("orderNumber");
                String productCode = result.getString("productCode");
                int quantityOrdered = result.getInt("quantityOrdered");
                float priceEach = result.getFloat("priceEach");
                int orderLineNumber = result.getInt("orderLineNumber");

                System.out.print(orderNumber + " | ");
                System.out.print(productCode + " | ");
                System.out.print(quantityOrdered + " | ");
                System.out.print(priceEach + " | ");
                System.out.println(orderNumber);
            }

            /*
            Update the extension number of employees whose officecode is 2, and the new extension number will be "5698."
             */
//            String query3 = "UPDATE employees SET extension = '5698' WHERE officecode = '2'";
//            Statement stmt2 = connection.createStatement();
//            int affectedRows = stmt2.executeUpdate(query3);
//            System.out.println(affectedRows + " Row(s) affected!");

            //print all employees
            stmt = connection.createStatement();
            ResultSet result2 = stmt.executeQuery("SELECT * FROM employees WHERE officecode = '2'");
            while(result2.next()) {
                System.out.println(result2.getInt("employeeNumber") + " | " + result2.getString("officeCode") + " | " + result2.getString("extension") );
            }


            //USE PREPARED STATEMENT
            //Select all employees whose last name is less than five characters in length.
            String query4 = "SELECT employeeNumber, lastName, LENGTH(lastName)\n" +
                    "FROM employees\n" +
                    "WHERE LENGTH(lastname) < ?";
            PreparedStatement prepStmt = connection.prepareStatement(query4);
            prepStmt.setInt(1, 5);
            ResultSet result3 = prepStmt.executeQuery();

            while(result3.next()) {
                System.out.println(result3.getInt("employeeNumber") + " | " + result3.getString("lastName") + " | " + result3.getString("LENGTH(lastName)") );
            }



            connection.close(); //close connection

        } catch(SQLException e) {

            e.printStackTrace();
        }

    }
}
