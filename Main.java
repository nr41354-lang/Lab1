//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите грузоподъёмность лифта X: ");
        int X = scanner.nextInt();

        System.out.print("Введите вес груза A: ");
        int A = scanner.nextInt();

        System.out.print("Введите вес груза B: ");
        int B = scanner.nextInt();

        System.out.print("Введите вес груза C: ");
        int C = scanner.nextInt();

        // проверим различные комбинации загрузки лифта грузами

        int maxCount = 0;
        String bestCombination = "";

        // Проверка комбинации, когда все три груза загружены
        if (A + B + C <= X) {
            maxCount = 3;
            bestCombination = "A B C";
        } else {
            // проверим попарно каждый груз
            if (A + B <= X && 2 > maxCount) {
                maxCount = 2;
                bestCombination = "A B";
            }
            if (A + C <= X && 2 > maxCount) {
                maxCount = 2;
                bestCombination = "A C";
            }
            if (B + C <= X && 2 > maxCount) {
                maxCount = 2;
                bestCombination = "B C";
            }
            // По одному грузу
            if (A <= X && 1 > maxCount) {
                maxCount = 1;
                bestCombination = "A";
            }
            if (B <= X && 1 > maxCount) {
                maxCount = 1;
                bestCombination = "B";
            }
            if (C <= X && 1 > maxCount) {
                maxCount = 1;
                bestCombination = "C";
            }
        }

        if (maxCount == 0) {
            System.out.println("В лифт нельзя загрузить ни один груз без превышения массы.");
        } else {
            System.out.println("Можно загрузить груз(ы): " + bestCombination);
            System.out.println("Количество грузов, которые можно поместить: " + maxCount);
        }
    }
}