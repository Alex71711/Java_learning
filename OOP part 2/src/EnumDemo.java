// Файл: EnumDemo.java

//Здесь показан enum — перечисление фиксированных значений.
//
//Удобнее, чем строки/числа, потому что безопаснее.
//
//📌 На практике:
//
//Дни недели, статусы заказа (NEW, PAID, CANCELLED).
//
//Типы пользователей (ADMIN, USER).

// Перечисление дней недели
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        // Используем switch для enum
        switch (today) {
            case MONDAY:
                System.out.println("Начало недели");
                break;
            case FRIDAY:
                System.out.println("Пятница! Скоро выходные!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Будний день");
        }
    }
}
