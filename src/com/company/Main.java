package com.company;

public class Main {

    public static void main(String[] args) {
        Book books[] = new Book[6];

        {
            books[0] = new Book("Повелитель мух", "Уильям Голдинг", 500, 5);
            books[1] = new Book("Цветы для Элджернона", "Дэниел Киз");
            books[2] = new Book("Мартин Иден", "Джек Лондон", 750);
            books[3] = new Book("Заводной апельсин");
            books[4] = new Book("Тихий Дон", "Михаил Шолохов", 3000, 4);
            books[5] = new Book("Граф Монте-Кристо", "Александр Дюма", 450);
        }

        Reader reader = new Reader();

        Book selectedBook = reader.choiceBook(books);
        reader.readBook(selectedBook);
        reader.rateBook(selectedBook);
//проверял
//        for (int i = 0; i < 10; i++) {
//
//            selectedBook = reader.choiceBook(books);
//            reader.readBook(selectedBook);
//            reader.rateBook(selectedBook);
//
//            System.out.println();
//        }
    }
}
