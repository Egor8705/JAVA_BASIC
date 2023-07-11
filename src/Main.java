import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = in.nextInt();

        int i = 1;
        int res = 0;

        while (i <= num){
            res += i;

            i += 2;
        }

        System.out.printf("Сумма всех нечетных чисел от 1 до %d: %d%n",num,res);
    }
}