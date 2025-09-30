// Файл: SealedDemo.java

//Здесь показан sealed class — ограниченное наследование.
//
//Можно чётко контролировать, кто наследуется.
//
//📌 На практике:
//
//Используется в больших проектах, чтобы задать фиксированное множество наследников (Shape → Circle, Square).
//
//Полезно в switch выражениях для исчерпывающего перебора.

// sealed ограничивает, кто может наследоваться от класса
sealed class Shape permits Circle, Square {}

// Разрешённые наследники
final class Circle extends Shape {}
final class Square extends Shape {}

// Другой класс (например, Triangle) не сможет наследоваться от Shape

public class SealedDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        System.out.println("Sealed классы ограничивают наследование");
    }
}
