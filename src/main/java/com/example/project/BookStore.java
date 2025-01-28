package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[5];
    private User[] users = new User[10];
    //requires 1 empty constructor
    public BookStore() {

    }
    public User[] getUsers(){
        return users;
    }

    public void setUsers(User[] users){
        this.users = users;
    }

    public Book[] getBooks(){
        return books;
    }

    public void addUser(User user){
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[index] == null) {
                users[index] = user;
                return;
            } else {
                index++;
            }
        }
    } 

    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(user)) {
                users[i] = null;
                for (int j = i; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[users.length - 1] = null;
                return;
            }
        }
    }

    public void consolidateUsers(){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                for (int j = users.length - 1; j > i; j--) {
                    users[j - 1] = users[j];
                    users[j] = null;
                }
            }
        }
    }

    public void addBook(Book book){
        int empty = 0;
        for (int a = 0; a < books.length; a++) {
            if (books[a] == null) {
                empty++;
            }
        }
        if (empty == 0) {
            Book[] temp = new Book[books.length + 1];
            for (int b = 0; b < books.length; b++) {
                temp[b] = books[b];
            }
            books = temp;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public void insertBook(Book book, int index){
        int empty = 0;
        for (int a = 0; a < books.length; a++) {
            if (books[a] == null) {
                empty++;
            }
        }
        if (empty == 0) {
            Book[] temp = new Book[books.length + 1];
            for (int b = 0; b < books.length; b++) {
                temp[b] = books[b];
            }
            books = temp;
        }
        if (books[index] != null) {
            for (int i = books.length - 1; i > index; i--) {
                books[i] = books[i - 1];
            }
        }
        books[index] = book;
    }

    public void removeBook(Book book) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(book)) {
                books[i] = null;
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }
                count++;
                Book[] temp = new Book[books.length - count];
                for (int j = 0; j < temp.length; j++) {
                    temp[j] = books[j];
                }
                books = temp;
                return;
            }
            
        }
    }
       
    public String bookStoreBookInfo(){
        String output = "";
        for (Book book : books) {
            output += book + " ";
        }
        return output;
    } //you are not tested on this method but use it for debugging purposes

    public String bookStoreUserInfo(){
        String output = "";
        for (User user : users) {
            output += user + " ";
        }
        return output;
    } //you are not tested on this method but use it for debugging purposes

}