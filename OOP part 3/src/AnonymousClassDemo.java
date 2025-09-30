// Файл: AnonymousClassDemo.java

//Здесь показан анонимный класс — класс без имени, создаётся «на лету».
//
//Удобно, если нужно реализовать интерфейс только один раз.
//
//📌 На практике:
//
//Слушатели событий (например, кнопка в UI).
//
//Маленькие одноразовые реализации.

// Интерфейс
interface Greeting {
    void sayHello();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // Создаём анонимный класс "на лету"
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }
        };

        g.sayHello();
    }
}
