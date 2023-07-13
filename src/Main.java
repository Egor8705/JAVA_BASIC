import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        float course = in.nextFloat();

        System.out.print("Количество рублей: ");
        double rubles = in.nextDouble();

        double dollars = Math.floor((rubles / course) * 100) / 100;

        System.out.printf("Итого: %.2f", dollars);
    }
}