package com.company;

public class Book {
    private String title;

    Book(String title, Author author){
        this.title = title;
    }
    Book(String title){
        this.title = title;
    }



    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public static String toString(Book book) {

        return "Название книги: " + book.getTitle() + "\n";
    }

}
