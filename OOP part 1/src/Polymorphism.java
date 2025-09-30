// Файл: Polymorphism.java

//Здесь показан полиморфизм: один тип (Shape), но много форм (Circle, Square).
//
//Мы можем хранить разные объекты в переменной одного типа.
//
//Метод draw() вызывается по фактическому объекту, а не по типу ссылки.
//
//        📌 На практике:
//
//В UI библиотеке все элементы (кнопки, текст, картинки) можно хранить как Component, но вести они себя будут по-своему.
//
//В играх есть Enemy, а фактически может быть Zombie, Robot, Dragon.

// Базовый класс
class Shape {
    public void draw() {
        System.out.println("Рисуем фигуру");
    }
}

// Класс Circle наследует Shape
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

// Класс Square наследует Shape
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Полиморфизм: одна ссылка базового типа, разные реализации
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // вызов версии для Circle
        s2.draw(); // вызов версии для Square
    }
}
