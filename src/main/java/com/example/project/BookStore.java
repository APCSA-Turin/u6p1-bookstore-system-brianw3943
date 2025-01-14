package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books;
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

    public void removeUser(User user){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
            }
        }
    }

    public void consolidateUsers(){
        
    }

    public void addBook(Book book){}

    public void insertBook(Book book, int index){
        if (books[index] != null) {
            for (int i = books.length - 1; i > index; i--) {
                books[i] = books[i - 1];
            }
        }
        books[index] = book;
    }

    public void removeBook(Book book){}
       
    public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}