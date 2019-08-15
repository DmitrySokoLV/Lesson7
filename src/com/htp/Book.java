package com.htp;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String authorName;
    private String authorSurname;

    public Book() {}

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book(int id, String name, String authorName, String authorSurname) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(name, book.name) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorSurname, book.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, authorName, authorSurname);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }
}
