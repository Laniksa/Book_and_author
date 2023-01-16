package com.company;

public class Author {
    private static String name;
    private static String surname;
    private static String nickname;
    private static String books_written [] =new String[10];

    Author(String name, String surname, String nickname, String books_written[]){
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.books_written = books_written;

    }
}
