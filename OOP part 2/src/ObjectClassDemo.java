// Файл: ObjectClassDemo.java

//Здесь мы работаем с методами класса Object:
//
//toString() для красивого вывода.
//
//equals() для сравнения объектов по содержимому.
//
//hashCode() нужен для коллекций (HashMap, HashSet).
//
//📌 На практике:
//
//Сравнение пользователей, заказов, товаров в БД.
//
//Логирование объектов (System.out.println(order)).

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;          // если ссылки одинаковые
        if (obj == null || getClass() != obj.getClass()) return false;
        Person p = (Person) obj;
        return age == p.age && name.equals(p.name);
    }

    // Переопределение hashCode()
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Иван", 25);
        Person p2 = new Person("Иван", 25);

        // toString()
        System.out.println(p1);

        // equals()
        System.out.println("p1 == p2? " + p1.equals(p2));

        // hashCode()
        System.out.println("hashCode p1: " + p1.hashCode());
        System.out.println("hashCode p2: " + p2.hashCode());
    }
}
