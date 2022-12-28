import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*    int i = 0     i < 10    i++
        for (инициализация; условие; изменение) {
              int i = 10    i > 1     i--
           // что-то делаем
        }
         */
        // Увеличение
        int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        // Уменьшение
        int counter = 10;
        System.out.println();
        for (; counter > 0; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
        // Вычисляем сумму натуральных чисел от 1 до 10
        // использую цикл for
        int start = 1, end = 11;
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Вложенный цикл
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}