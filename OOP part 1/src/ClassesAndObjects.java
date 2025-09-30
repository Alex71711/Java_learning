// Файл: ClassesAndObjects.java

//Это базовый пример работы с классами и объектами.
//
//Класс Car описывает свойства и поведение.
//
//Объект car1 — конкретный экземпляр.
//
//        📌 На практике:
//
//Класс — это «чертёж» (например, рецепт пирога).
//
//Объект — это конкретный «экземпляр» (пирог, сделанный по рецепту).

// Класс Car
class Car {
    String brand;
    int year;

    // Метод класса
    public void drive() {
        System.out.println(brand + " едет!");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Создание объекта (экземпляра класса)
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2020;

        // Вызов метода объекта
        car1.drive();
    }
}
