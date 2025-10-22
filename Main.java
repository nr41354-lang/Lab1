//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите грузоподъёмность лифта X: ");
        int X = in.nextInt();

        System.out.print("Введите вес груза A: ");
        int A = in.nextInt();

        System.out.print("Введите вес груза B: ");
        int B = in.nextInt();

        System.out.print("Введите вес груза C: ");
        int C = in.nextInt();

        int maxCount = 0;
        String comb = "";

        // Проверка грузов по отдельности
        if (A <= X && 1 > maxCount) {
            maxCount = 1;
            comb = "A";
        }
        if (B <= X && 1 > maxCount) {
            maxCount = 1;
            comb = "B";
        }
        if (C <= X && 1 > maxCount) {
            maxCount = 1;
            comb = "C";
        }

        // Проверка комбинаций из 2 грузов
        if (A + B <= X && 2 > maxCount) {
            maxCount = 2;
            comb = "A B";
        }
        if (A + C <= X && 2 > maxCount) {
            maxCount = 2;
            comb = "A C";
        }
        if (B + C <= X && 2 > maxCount) {
            maxCount = 2;
            comb = "B C";
        }

        //  Проверка омбинации из трёх грузов
        if (A + B + C <= X && 3 > maxCount) {
            maxCount = 3;
            comb = "A B C";
        }

        // Вывод результата
        if (maxCount == 0) {
            System.out.println("В лифт нельзя загрузить ни один груз без превышения массы.");
        } else {
            System.out.println("Можно загрузить груз(ы): " + comb);
            System.out.println("Количество грузов, которые можно поместить: " + maxCount);
        }
    }
}
