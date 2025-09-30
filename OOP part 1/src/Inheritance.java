// Файл: Inheritance.java

//Здесь показано наследование.
//
//Класс Dog наследует Animal, значит получает его методы.
//
//Но Dog переопределяет метод sound().
//
//        📌 На практике:
//
//Базовый класс Transport → наследники Car, Bus, Bike.
//
//Общая логика хранится в родителе, различия — в наследниках.

// Базовый класс Animal
class Animal {
    public void sound() {
        System.out.println("Животное издаёт звук");
    }
}

// Производный класс Dog наследует Animal
class Dog extends Animal {
    // Переопределяем метод
    @Override
    public void sound() {
        System.out.println("Собака лает: Гав-гав!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // вызов метода базового класса

        Dog d = new Dog();
        d.sound(); // вызов метода переопределённого в наследнике
    }
}
