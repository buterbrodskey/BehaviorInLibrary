package com.company;

public class Book {
    String title = "unknown";
    String author = "unknown";
    int pageNum;
    int id;


    public Book(String title, String author, int pageNum, int id) {
        this(title, author, pageNum);
        this.id = id;
    }

    public Book(String title, String author, int pageNum) {
        this(author, title);
        this.pageNum = pageNum;
    }

    public Book(String title, String author) {
        this(title);
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title=" + title +
                ", author='" + author + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }

}
