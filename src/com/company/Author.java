package com.company;

public class Author {
    private  String name;
    private  String surname;
    private  String nickname;
    private  Book books_written [] =new Book[10];

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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBooks_written(Book[] books_written) {
        this.books_written = books_written;
    }

    public  String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public Book[] getBooks_written() {
        return books_written;
    }
    public static String toString(Author author){
        return "Имя автора: "+ author.getName()+"\n"+
                "Фамилия автора: "+ author.getSurname()+"\n"+
                "Псевдоним автора: "+ author.getNickname()+"\n"+
                "Написанные книги: "+author.getBooks_written()+"\n";
    }
}
