// Файл: InterfaceDemo.java

//Здесь показан интерфейс.
//
//Он описывает поведение, но не реализацию.
//
//Разные классы могут реализовать один интерфейс по-своему.
//
//📌 На практике:
//
//Comparable — позволяет сравнивать объекты.
//
//Runnable — описывает задачу для потока.
//
//В проекте: интерфейс Payment для разных способов оплаты.

// Интерфейс описывает поведение
interface Flyable {
    void fly(); // метод без реализации
}

// Класс Bird реализует интерфейс Flyable
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летит!");
    }
}

// Класс Airplane тоже реализует Flyable
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолёт взлетает!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();

        f1.fly();
        f2.fly();
    }
}
