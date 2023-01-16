package com.company;

public class Author {
    private static String name;
    private static String surname;
    private static String nickname;
    private static Book books_written [] =new Book[10];

    Author(String name, String surname, String nickname, Book books_written[]){
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.books_written = books_written;

    }
    Author(String name, String surname, String nickname){
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;


    }
}
