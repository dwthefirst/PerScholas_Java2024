package org.example.GL_305_3_1.DAOinterface;

import org.example.GL_305_3_1.model.Books;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {
    //method to list down all records from books table
    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;

    //method to create record in books table (multiple entries)
    void saveBook(List<Books> BookList);

    //method to delete a record from student table corresponding to passed books id
    boolean deleteBook(int id);

    //method used to update a record into books table
    boolean updateBook(Books bookObj, int id);

}
