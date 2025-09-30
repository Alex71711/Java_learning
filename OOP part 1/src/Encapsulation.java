// Файл: Encapsulation.java

//Здесь показана инкапсуляция: данные (поля) спрятаны через private, а доступ к ним идёт через геттеры/сеттеры.
//
//Это защищает объект от некорректного использования.
//
//Код снаружи не может напрямую испортить состояние объекта.
//
//        📌 На практике:
//
//В банковских системах баланс счёта нельзя менять напрямую, только через методы «пополнить» и «снять».
//
//В играх здоровье игрока меняется только через методы, а не напрямую.

// Класс Person демонстрирует инкапсуляцию:
// поля private скрыты от внешнего доступа
class Person {
    private String name;  // поле доступно только внутри класса
    private int age;

    // Конструктор — инициализирует объект
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер (метод для чтения значения)
    public String getName() {
        return name;
    }

    // Сеттер (метод для изменения значения)
    public void setAge(int age) {
        if (age > 0) {   // проверка корректности
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person("Иван", 25);

        // Получаем имя через геттер
        System.out.println("Имя: " + p.getName());

        // Меняем возраст через сеттер
        p.setAge(30);
        System.out.println("Возраст: " + p.getAge());
    }
}
