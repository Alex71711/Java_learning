// Файл: NestedClasses.java

//Здесь показаны вложенные классы.
//
//StaticNested — как обычный класс, но внутри другого.
//
//Inner — имеет доступ к полям внешнего.
//
//📌 На практике:
//
//Используются для вспомогательных структур (например, Map.Entry в HashMap).

class Outer {
    private String message = "Привет из Outer!";

    // Статический вложенный класс
    static class StaticNested {
        public void show() {
            System.out.println("Это статический вложенный класс");
        }
    }

    // Внутренний (inner) класс — имеет доступ к полям внешнего
    class Inner {
        public void show() {
            System.out.println("Inner класс: " + message);
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        // Работа со статическим вложенным классом
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.show();

        // Работа с inner классом
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.show();
    }
}
