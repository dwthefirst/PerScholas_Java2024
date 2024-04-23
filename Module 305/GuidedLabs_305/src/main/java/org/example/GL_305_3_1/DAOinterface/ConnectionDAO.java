package org.example.GL_305_3_1.DAOinterface;

import java.sql.*;

public class ConnectionDAO {
    static Connection conn = null;
    protected PreparedStatement prepStmt = null;
    protected ResultSet result = null;

    //method
    public static Connection getConnection() throws ClassNotFoundException
    {
        final String DBURL = "jdbc:mysql://localhost:3306/library";
        final String USER = "root";
        final String PASSWORD = "admin";
        try {
            conn = DriverManager.getConnection(DBURL, USER, PASSWORD);
            System.out.println("DATABASE CONNECTED SUCCESSFULLY!");
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return conn;
    }

    public void disconnect() {
        try {
            if(result != null) {
                result.close();
            }
            if (prepStmt != null) {
                prepStmt.close();
            }
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
