package org.example.GL_305_3_1.Runner;

import org.example.GL_305_3_1.Controller.BookDaoImpl;
import org.example.GL_305_3_1.DAOinterface.BookDao;
import org.example.GL_305_3_1.model.Books;

import java.awt.print.Book;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccessBook {
    public static void main(String[] args) {
        //Creating Object
        BookDao bookDao = new BookDaoImpl();
        System.out.println("-----INSERTING BOOK RECORDS-----");

        ArrayList<Books> BookList = new ArrayList<>();

//        Books b1 = new Books();
//        b1.setIsbn(120);
//        b1.setBookName("Java Book");
//        BookList.add(b1);
//
//        Books b2 = new Books();
//        b2.setIsbn(300);
//        b2.setBookName("Python Book");
//        BookList.add(b2);

        Books b3 = new Books();
        b3.setIsbn(365);
        b3.setBookName("Javascript Book");
        BookList.add(b3);

        Books b4 = new Books();
        b4.setIsbn(256);
        b4.setBookName("SQL Book");
        BookList.add(b4);

        System.out.println(BookList);
        //bookDao.saveBook(BookList);


        System.out.println("-----DISPLAY LIST OF ALL BOOKS-----");
        try {
            for (Books b : bookDao.getAllBooks()) { //returns a list of all the books from the records in the books table
                int isbn = b.getIsbn();
                String bookName = b.getBookName();
                System.out.println("==============");
                System.out.println("ISBN Number: " + isbn + " | Book name: " + bookName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("-----UPDATING BOOK INFORMATION-----");
        Books bookUpdate1 = new Books(); //new book object
        bookUpdate1.setIsbn(3);
        bookUpdate1.setBookName("Javascript - DATA STRUCTURES AND ALGORITHMS");
        boolean result = bookDao.updateBook(bookUpdate1, 3);
        System.out.println("Update book successful? -> " + result);
        printBooksFromTable(bookDao);


        System.out.println("-----DELETE BOOK RECORD BY ID-----");
        boolean deleteSuccessful = bookDao.deleteBook(7);
        if (deleteSuccessful) {
            System.out.println("Record successfully deleted.");
        } else {
            System.out.println("Record not deleted.");
        }


    }

    static void printBooksFromTable(BookDao bookDao) {
        System.out.println("BOOKS FROM TABLE:");
        try {
            for (Books b : bookDao.getAllBooks()) { //returns a list of all the books from the records in the books table
                int isbn = b.getIsbn();
                String bookName = b.getBookName();
                System.out.println("==============");
                System.out.println("ISBN Number: " + isbn + " | Book name: " + bookName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
