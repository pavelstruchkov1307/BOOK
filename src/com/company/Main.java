package com.company;

public class Main {

    public static void main(String[] args) {

        Book[] arr = {
                new Book("Граф монте кристо"),
                new Book("Стрихотворения", "Маяковский"),
                new Book("Побег из Шоушенка", "Стивен Кинг", 30),
                new Book("Гарри Поттер и Кубок огня", "Джоан Роулинг", 13, 80),
        };

        Reader reader = new Reader();
        Book bk = reader.choiceBook(arr);
        reader.readBook(bk);
        System.out.println("Название книги='" + bk.name + "'," + " Оценка=" + reader.rating(bk));
    }
}
