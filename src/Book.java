/**
 * Створити клас Book, зробити 3 поля(Genre(використуйте Enum), String name, int age).
 * Створіть List з об'єктів класу Book та напишіть лямбда вирази для таких операцій:
 * 1) Вивести у консоль об'єкти класу Book, вік яких більше 10 років
 * 2) Вивести у консоль об'єкти класу Book, жанр яких Фантастика
 * 3) Вивести у консоль об'єкти класу Book, ім'я яких дорівнює "Story"
 * 4) Створити record Article з полями(Genre(використуйте Enum), String name).
 * Перетворити колекцію об'єктів класу Book у колекцію об'єктів класу Article
 */

import java.util.*;


enum Genre {
    FANTASTIC
}

class Book {
    Genre genre;
    String name;
    int age;

    public Book(Genre genre, String name, int age) {
        this.genre = genre;
        this.name = name;
        this.age = age;
    }
}

record Article(Genre genre, String name) {
}

class NewBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(Genre.FANTASTIC, "Story", 666));
        books.add(new Book(Genre.FANTASTIC, "Saturday", 88));
        books.add(new Book(Genre.FANTASTIC, "Salt", 9999));
        books.add(new Book(Genre.FANTASTIC, "Sugar", 10000));


        books.stream()
                .filter(book -> book.age > 10)
                .forEach(book -> System.out.println(book.name));


        books.stream()
                .filter(book -> book.genre == Genre.FANTASTIC)
                .forEach(book -> System.out.println(book.name));


        books.stream()
                .filter(book -> book.name.equals("Story"))
                .forEach(book -> System.out.println(book.name));

        List<Article> articles = books.stream()
                .map(book -> new Article(book.genre, book.name))
                .toList();
    }
}