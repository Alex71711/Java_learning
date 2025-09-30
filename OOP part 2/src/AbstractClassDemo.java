// Файл: AbstractClassDemo.java

//Здесь показаны абстрактные классы.
//
//В них можно задать общий функционал + обязать наследников реализовать часть методов.
//
//📌 На практике:
//
//В графике: Shape имеет метод draw(), но разные фигуры рисуют по-своему.
//
//В приложении доставки: Payment может быть абстрактным, а конкретные классы CardPayment, CashPayment.

// Абстрактный класс
abstract class Animal {
    public abstract void makeSound(); // абстрактный метод без реализации

    public void sleep() { // обычный метод
        System.out.println("Животное спит");
    }
}

// Класс Dog обязан реализовать makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // реализация
        d.sleep();     // унаследованный метод
    }
}
