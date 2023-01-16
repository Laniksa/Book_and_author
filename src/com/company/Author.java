package com.company;

public class Author {
    private static String name;
    private static String surname;
    private static String nickname;
    private static Book books_written [] =new Book[10];

    Author(String name, String surname, String nickname, Book[] books_written){
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

    public static void setName(String name) {
        Author.name = name;
    }

    public static void setSurname(String surname) {
        Author.surname = surname;
    }

    public static void setNickname(String nickname) {
        Author.nickname = nickname;
    }

    public static void setBooks_written(Book[] books_written) {
        Author.books_written = books_written;
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getNickname() {
        return nickname;
    }

    public static Book[] getBooks_written() {
        return books_written;
    }
}
