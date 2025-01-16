package com.example.project;

public class Test {
    public static void main(String args[]) {
        IdGenerate.reset();
        BookStore store = new BookStore(); //create a new bookstore with 6 empty books
        IdGenerate.generateID();
        User u1 = new User("John",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u2 = new User("Jane",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u3 = new User("Mary",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u4 = new User("Alex",IdGenerate.getCurrentId());
        store.addUser(u1);store.addUser(u2);store.addUser(u3);store.addUser(u4);
        for (User user : store.getUsers()) {
            System.out.println(user.getName());
        }
        store.removeUser(u2);
        for (User user : store.getUsers()) {
            System.out.println(user.getName());
        }
        store.removeUser(u1);
        for (User user : store.getUsers()) {
            System.out.println(user.getName());
        }
        store.removeUser(u4);
        for (User user : store.getUsers()) {
            System.out.println(user.getName());
        }
        store.removeUser(u3);
        for (User user : store.getUsers()) {
            System.out.println(user.getName());
        }
    }
}