// Файл: Constructors.java

//Здесь показаны конструкторы.
//
//Это специальные методы для инициализации объектов.
//
//Можно перегружать (несколько вариантов с разными параметрами).
//
//📌 На практике:
//
//В приложении к заказам: new Order(номер) или new Order(номер, клиент).
//
//В играх: создание персонажа с настройками по умолчанию или с кастомизацией.

class Book {
    String title;
    String author;

    // Конструктор с двумя параметрами
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Перегруженный конструктор (только с названием)
    public Book(String title) {
        this.title = title;
        this.author = "Неизвестен";
    }

    public void printInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", "Толстой");
        Book b2 = new Book("Неизвестная книга");

        b1.printInfo();
        b2.printInfo();
    }
}
