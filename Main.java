//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите грузоподъёмность X и веса A, B, C: ");
        int X = in.nextInt(), A = in.nextInt(), B = in.nextInt(), C = in.nextInt();

        String comb = "";
        int max = 0;

        if (A + B + C <= X) { comb = "A B C"; max = 3; }
        else if ((A + B <= X) || (A+C<=X)||(B + C <= X)) {
            max = 2;
            if (A + B <= X) comb = "A B";
            else if (A + C <= X) comb = "A C";
            else comb = "B C";
        }
        else if ((A <= X)||(B<=X)||(C <= X)) {
            max = 1;
            if (A <= X) comb = "A";
            else if (B <= X) comb = "B";
            else comb = "C";
        }

        System.out.println(max == 0
                ? "В лифт нельзя загрузить ни один груз без превышения массы."
                : "Можно загрузить: " + comb + " (" + max + ")");
    }
}
