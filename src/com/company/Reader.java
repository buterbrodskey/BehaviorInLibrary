package com.company;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books) {
        int randomIntInBounds = new Random().nextInt(books.length);
        return books[randomIntInBounds];
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public void rateBook(Book book) {
        int rate = 0;
        Random random = new Random();
        
// для адекватности рейтингов, вычитал рандомные числа из небольшого диапазона

        rate = book.author.equals("unknown") ? rate - random.nextInt(10) : rate + book.author.length();

        rate = book.title.equals("unknown") ? rate - random.nextInt(10) : rate + book.title.length();

        rate = book.pageNum == 0 ? rate - random.nextInt(10) : rate + book.pageNum;

        rate = book.id == 0 ? rate - random.nextInt(10) : rate + book.id;

        System.out.println("Название: " + book.title + "\tРейтинг: " + rate);
    }
}
