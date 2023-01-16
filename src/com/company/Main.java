package com.company;

import java.util.Scanner;

public class Main {
    public static Author addAuthor(Scanner scan){
        String str;
        scan.nextLine();
        System.out.println("Введите имя автора:\n");
        String nameAuthor = scan.nextLine();
        System.out.println("Введите фамилию автора:\n");
        String surnameAuthor = scan.nextLine();
        System.out.println("Введите псевдоним автора:\n");
        String nickNameAuthor = scan.nextLine();
        while(str.equals("end"){
            System.out.println("Введите названия книг автора:\n");
            //отдельный метод по добавлению книг
        }



        return new Author (nameAuthor,surnameAuthor,nickNameAuthor);
    }
    Scanner scan = new Scanner(System.in);
    while(true){
        String num = scan.nextLine();
        System.out.println("Введите пункт меню:\n" +
                "1. Добавить автора\n" +
                "2. Добавить книгу\n" +
                "3. Показать всех авторов\n" +
                "4. Показать все книги\n"
        );

        switch (num){
            case 1:
                addAuthor(Scanner scan);
                break;

        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
