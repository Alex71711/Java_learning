// Файл: RecordDemo.java

//Здесь показан record — компактная форма для «DTO классов» (только хранение данных).
//
//Автоматически создаёт toString, equals, hashCode, геттеры.
//
//📌 На практике:
//
//Используется для передачи данных (UserDTO, OrderDTO).
//
//В REST API часто используют records.

// record автоматически создаёт поля, конструктор, toString, equals, hashCode
record Person(String name, int age) {}

public class RecordDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Иван", 25);

        // Автоматически доступны геттеры (name(), age())
        System.out.println("Имя: " + p1.name());
        System.out.println("Возраст: " + p1.age());

        // toString()
        System.out.println(p1);

        // equals() и hashCode() тоже есть по умолчанию
        Person p2 = new Person("Иван", 25);
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
    }
}
