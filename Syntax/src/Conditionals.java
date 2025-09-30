// Файл: Conditionals.java
public class Conditionals {
    public static void main(String[] args) {
        int number = 10;

        // Простой if — проверка условия
        if (number > 0) {
            System.out.println("Число положительное");
        }

        // if-else — два варианта
        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

        // if-else if-else — несколько условий
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число положительное");
        }

        // switch-case — альтернатива if-else
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Другой день");
        }
    }
}
