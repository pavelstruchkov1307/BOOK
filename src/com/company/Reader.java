package com.company;

import java.util.Random;

public class Reader {

    Random random = new Random();

    public Book choiceBook(Book[] arr) {
        return arr[random.nextInt(arr.length)];
    }

    public void readBook(Book book) {
        System.out.println(book);
    }

    public int rating(Book book) {
        int grade = 0;

        String name = book.name;
        if (name == null) {
            grade -= random.nextInt(10);
        } else {
            name = name.replaceAll("\\s+", "");
            grade += name.length();
        }

        String author = book.author;
        if (author == null) {
            grade -= random.nextInt(10);
        } else {
            author = author.replaceAll("\\s+", "");
            grade += author.length();
        }

        if (book.number == 0) {
            grade -= random.nextInt(10);
        } else {
            grade -= book.number;
        }

        if (book.quantityStr == 0) {
            grade -= random.nextInt(10);
        } else {
            grade += book.quantityStr;
        }
        return grade;

    }
}
