package com.company;

import java.util.Scanner;

public class Main {
    public static Author listAuthor[] = new Author[10];


    public static Author addAuthor(Scanner scan){
        //String str;
        scan.nextLine();
        System.out.println("Введите имя автора:\n");
        //String nameAuthor = scan.nextLine();
        Author.setName(scan.nextLine());
        System.out.println("Введите фамилию автора:\n");
        //String surnameAuthor = scan.nextLine();
        Author.setSurname(scan.nextLine());
        System.out.println("Введите псевдоним автора:\n");
        //String nickNameAuthor = scan.nextLine();
        Author.setNickname(scan.nextLine());

        return new Author (Author.getName(),Author.getSurname(),Author.getNickname());
    }
    public static Author[] listAllAuthor(Author author){
// тут будем лепить массив
       return  listAuthor[];
    }

    public static Book addBook(Scanner scan){
        scan.nextLine();
        System.out.println("Введите название книги: \n");
        String bookName = scan.nextLine();
        return new Book(bookName);
    }
    public static boolean menu (){
        Scanner scan = new Scanner(System.in);

        while(true){
            String num = scan.nextLine();
            System.out.println("Введите пункт меню:\n" +
                    "1. Добавить автора\n" +
                    "2. Добавить книгу\n" +
                    "3. Показать всех авторов\n" +
                    "4. Показать все книги\n" +
                    "5. Выход\n"

            );

            switch (num){
                case 1:
                    addAuthor((Scanner scan));
                    break;

            }
        }
    }



    public static void main(String[] args) {
	// write your code here
    }
}
