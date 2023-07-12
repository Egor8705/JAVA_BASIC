import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String str = Integer.toString(in.nextInt());

        System.out.print("Введите второе число: ");
        int num = in.nextInt();

        System.out.println(Math.max(Integer.parseInt(str), num));
        System.out.println(Double.valueOf(Math.min(Integer.parseInt(str), num)));
    }
}