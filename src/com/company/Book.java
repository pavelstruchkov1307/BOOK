package com.company;

public class Book {
    String name;
    String author;
    int number;
    int quantityStr;

    Book(String name) {
        this.name = name;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name, String author, int number) {
        this.name = name;
        this.author = author;
        this.number = number;
    }

    public Book(String name, String author, int number, int quantityStr) {
        this.name = name;
        this.author = author;
        this.number = number;
        this.quantityStr = quantityStr;
    }

    @Override
    public String toString() {

        String book = "";

        if (name != null) {
            book += "Название униги='" + name + "'";
        }

        if (author != null) {
            book += ", Автор='" + author + "'";
        }

        if (number != 0) {
            book += ", Порядковый номер в серии='" + number;
        }

        if (quantityStr != 0) {
            book += ", Количество страниц='" + quantityStr;
        }
        return book + ".";

    }
}
