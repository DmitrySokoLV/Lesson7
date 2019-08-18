package com.htp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
    /*
	* 1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
    List< Book > list = new LinkedList< Book >();
    Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о
    * оставшихся книгах.

    2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book, предусмотреть
    * не менее 6 одинаковых по значению книг. Вывести на экран информацию о книга (содержащихся в коллекции HashSet),
    * название которых начинается с гласной буквы.

    3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить
    * в класс Book для автора книги).

    4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
    * Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.
    5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве ключа  - категория товара
    * в каталоге (catalog.onliner.by) в качестве значения - количество товаров в данной категории.
    * Сортировать коллекцию по количеству товаров в каждой категории, найти категорию в которой содержится
    * максимальное количество товаров, удалить все категории в которых нет ни одного товара (предусмотреть такие
    * категории при заполнении коллекции)
	* */

        Book book1 = new Book("Head First Java");
        Book book2 = new Book("Java, A Beginner's Guide");
        Book book3 = new Book("Test Driven Development");
        Book book4 = new Book("Effective Java");
        Book book5 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship");


        //1.
        List<Book> list = new LinkedList<>();

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        Stream<Book> stream = list.stream();
        stream.forEach(System.out::println);

        list.remove(book2);
        System.out.println();

        Stream<Book> stream2 = list.stream();
        stream2.forEach(System.out::println);

        System.out.println();

        //2

        final Set<Book> books = books();

        books
                .stream()
                .filter(book -> book.getName().matches("[AEIOUaeiou].+"))
                .forEach(System.out::println);
    }

        private static Set<Book> books() {
            final Set<Book> result = new HashSet<>();

            result.add(new Book("The Great Gatsby"));
            result.add(new Book("The Great Gatsby"));
            result.add(new Book("The Great Gatsby"));
            result.add(new Book("The Great Gatsby"));
            result.add(new Book("The Great Gatsby"));
            result.add(new Book("The Great Gatsby"));
            result.add(new Book("The Great Gatsby"));
            result.add(new Book("To Kill a Mockingbird"));
            result.add(new Book("To Kill a Mockingbird"));
            result.add(new Book("To Kill a Mockingbird"));
            result.add(new Book("Harry Potter and the Sorcerer's Stone"));
            result.add(new Book("Harry Potter and the Sorcerer's Stone"));
            result.add(new Book("Harry Potter and the Sorcerer's Stone"));
            result.add(new Book("1984"));
            result.add(new Book("1984"));
            result.add(new Book("1984"));
            result.add(new Book("The Catcher in the Rye"));
            result.add(new Book("The Catcher in the Rye"));
            result.add(new Book("The Catcher in the Rye"));
            result.add(new Book("The Hobbit"));
            result.add(new Book("The Hobbit"));
            result.add(new Book("The Hobbit"));
            result.add(new Book("Fahrenheit 451"));
            result.add(new Book("Fahrenheit 451"));
            result.add(new Book("Fahrenheit 451"));
            result.add(new Book("Anna Karenina"));
            result.add(new Book("Anna Karenina"));
            result.add(new Book("Anna Karenina"));
            result.add(new Book("War and Peace"));
            result.add(new Book("War and Peace"));
            result.add(new Book("War and Peace"));
            result.add(new Book("Middlemarch"));
            result.add(new Book("Middlemarch"));
            result.add(new Book("Middlemarch"));
            result.add(new Book("The Adventures of Huckleberry Finn"));
            result.add(new Book("The Adventures of Huckleberry Finn"));
            result.add(new Book("The Adventures of Huckleberry Finn"));

            return result;
        }

}
