package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int maxAuthor = 10;
    public static final int maxBook = 10;
    public static int numberAuthor = 0;
    public static int numberBook= 0;
    public static Author listAuthor[] = new Author[maxAuthor];
    public static Book listBook[] = new Book[maxBook];


    public static Author addAuthor(Scanner scan){
        scan.nextLine();
        System.out.println("Введите имя автора: ");
        String name = scan.nextLine();
        System.out.println("Введите фамилию автора: ");
        String surname = scan.nextLine();
        System.out.println("Введите псевдоним автора: ");
        String nickname = scan.nextLine();

        return new Author (name,surname,nickname);
    }
    public static void listAllAuthors(Author author){
        listAuthor[numberAuthor] = author;
        numberAuthor++;
    }
    public static void listAllBooks(Book book){
        listBook[numberBook] = book;
        numberBook++;
    }

    public static Book addBook(Scanner scan){
        scan.nextLine();
        System.out.println("Введите название книги: ");
        String bookName = scan.nextLine();
        return new Book(bookName);
    }

    public static boolean menu (){
        Scanner scan = new Scanner(System.in);

        while(true){
            int num;
            System.out.println("Введите пункт меню:\n" +
                    "1. Добавить автора\n" +
                    "2. Добавить книгу\n" +
                    "3. Показать всех авторов\n" +
                    "4. Показать все книги\n" +
                    "5. Выход\n"

            );
            try{
               num = scan.nextInt();
                switch (num){
                    case 1:
                        listAllAuthors(addAuthor(scan));
                        break;
                    case 2:
                        listAllBooks(addBook(scan));
                        break;
                    case 3:
                        for(int i = 0; i < numberAuthor; i++){
                            System.out.println(Author.toString(listAuthor[i]));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < numberBook; i++){
                            System.out.println(Book.toString(listBook[i]));
                        }
                        break;
                    case 5:
                        System.out.println("Программа завершена!");
                        return false;
                    default:
                        System.out.println("Введите пункт меню от 1 до 5");

                }
            }catch(InputMismatchException e){
                System.out.println("Введите пункт меню в числовом виде!");
            }



        }
    }



    public static void main(String[] args) {
	    menu();
    }
}
