package com.htp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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

        Book book1 = new Book(1, "Head First Java", "Bert", "Bates");
        Book book2 = new Book(2, "Java, A Beginner's Guide", "Herbert", "Schildt");
        Book book3 = new Book(3, "Test Driven Development");
        Book book4 = new Book(4, "Effective Java", "Bloch", "Joshua");
        Book book5 = new Book(5, "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert", "C. Martin");
        Book book6 = new Book(6, "The Pragmatic Programmer", "Andrew", "Hunt");
        Book book7 = new Book(7, "Core Java Volume I - Fundamentals", "", "");
        Book book8 = new Book(8, "Design Patterns: Elements of Reusable Object-Oriented Software", "Richard", "Helm");
        Book book9 = new Book(9, "Refactoring: Improving the Design of Existing Code", "Kent", "Beck");
        Book book10 = new Book(10, "OSGi in Action: Creating Modular Applications in Java", "Karl", "Pauls");
        Book book11 = new Book(11, "The Clean Coder: A Code of Conduct for Professional Programmers", "Robert", "C. Martin");
        Book book12 = new Book(12, "Java Concurrency in Practice", "Tim", "Peierls");
        Book book13 = new Book(13, "Working Effectively with Legacy Code", "Michael", "Feathers");
        Book book14 = new Book(14, "Peopleware: Productive Projects and Teams", "Tom", "DeMarco");
        Book book15 = new Book(15, "Patterns of Enterprise Application Architecture", "Martin", "Fowler");
        Book book16 = new Book(16, "Test Driven Development");
        Book book17 = new Book(17, "Design Patterns: Elements of Reusable Object-Oriented Software", "Richard", "Helm");
        Book book18 = new Book(18, "OSGi in Action: Creating Modular Applications in Java", "Karl", "Pauls");
        Book book19 = new Book(19, "Working Effectively with Legacy Code", "Michael", "Feathers");
        Book book20 = new Book(20, "Head First Java", "Bert", "Bates");


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

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);
        bookSet.add(book9);
        bookSet.add(book10);
        bookSet.add(book11);
        bookSet.add(book12);
        bookSet.add(book13);
        bookSet.add(book14);
        bookSet.add(book15);
        bookSet.add(book16);
        bookSet.add(book17);
        bookSet.add(book18);
        bookSet.add(book19);
        bookSet.add(book20);


        //3

    }
}
