// Файл: LocalClassDemo.java

//Здесь показан локальный класс — класс внутри метода.
//
//Обычно используется как вспомогательный.
//
//📌 На практике:
//
//Когда нужно временное решение прямо в методе.
//
//Например, для маленьких утилит при обработке данных.

public class LocalClassDemo {
    public void display() {
        // Локальный класс внутри метода
        class Local {
            public void show() {
                System.out.println("Привет из локального класса!");
            }
        }

        // Создаём объект локального класса
        Local local = new Local();
        local.show();
    }

    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.display();
    }
}
