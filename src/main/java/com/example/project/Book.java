package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public String bookInfo(){
        String info = "Title; " + title;
        info += ", Author: " + author;
        info += ", Year: " + yearPublished;
        info += ", ISBN: " + isbn;
        info += ", Quantity: " + quantity;
        return info;
    } //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       
}