package org.example.GL_305_3_1.model;

public class Books {
    //instance variables
    private int id;
    private int isbn;
    private String bookName;

    //constructors
    public Books() {
    }

    public Books(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public Books(int id, int isbn, String bookName) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
    }

    //getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
