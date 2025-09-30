// Файл: StaticDemo.java

class MathUtils {
    // Статическое поле (общее для всех объектов)
    public static final double PI = 3.14159;

    // Статический метод (можно вызвать без создания объекта)
    public static int square(int x) {
        return x * x;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Доступ к статическому полю
        System.out.println("PI = " + MathUtils.PI);

        // Вызов статического метода
        System.out.println("Квадрат числа 5 = " + MathUtils.square(5));
    }
}
