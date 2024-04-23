package org.example.GL_305_3_1.Controller;

import org.example.GL_305_3_1.DAOinterface.BookDao;
import org.example.GL_305_3_1.DAOinterface.ConnectionDAO;
import org.example.GL_305_3_1.model.Books;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends ConnectionDAO implements BookDao {

    @Override
    public void saveBook(List<Books> BookList) {
        try {
            Connection conn = ConnectionDAO.getConnection();
            for(Books b : BookList) {
                String query = "INSERT INTO books (isbn, bookName) VALUES (?, ?)";
                PreparedStatement prepStmt = conn.prepareStatement(query);
                prepStmt.setInt(1, b.getIsbn());
                prepStmt.setString(2, b.getBookName());
                int affectedRows = prepStmt.executeUpdate();
                System.out.println(affectedRows + " row(s) affected!!");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //returns a list of all the book records in the book table
    @Override
    public List<Books> getAllBooks() {
        try {
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM books");
            List bookList = new ArrayList();
            while(result.next()) {
                Books b = new Books();
                b.setIsbn(result.getInt("isbn"));
                b.setBookName(result.getString("bookName"));
                bookList.add(b);
            }
            return bookList;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateBook(Books bookObj, int id) {
        try {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement prepStmt = connection.prepareStatement("UPDATE books SET isbn=?, bookName=? WHERE id=?");
            prepStmt.setInt(1, bookObj.getIsbn());
            prepStmt.setString(2, bookObj.getBookName());
            prepStmt.setInt(3, id);
            int affectedRows = prepStmt.executeUpdate();
            if (affectedRows == 1) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }



    @Override
    public boolean deleteBook(int id) {
        try {
            Connection connection = ConnectionDAO.getConnection();
            String query = "DELETE FROM books WHERE id=?";
            PreparedStatement prepStmt = connection.prepareStatement(query);
            prepStmt.setInt(1, id);
            int affectedRows = prepStmt.executeUpdate();
            if(affectedRows == 1) {
                return true;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


}
