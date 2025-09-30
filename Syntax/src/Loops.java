// Файл: Loops.java
public class Loops {
    public static void main(String[] args) {
        // for — цикл с счётчиком
        for (int i = 1; i <= 5; i++) {
            System.out.println("for: i = " + i);
        }

        // while — цикл выполняется, пока условие true
        int j = 1;
        while (j <= 5) {
            System.out.println("while: j = " + j);
            j++;
        }

        // do-while — сначала выполняется тело цикла, потом проверяется условие
        int k = 1;
        do {
            System.out.println("do-while: k = " + k);
            k++;
        } while (k <= 5);

        // foreach — упрощённый цикл по массиву
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("foreach: num = " + num);
        }
    }
}
