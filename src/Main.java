import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int length = in.nextInt();
        double[] arr = new double[length];

        System.out.print("Введите данные массива: ");
        int i = 0;
        while (i < length){
            double elem = in.nextDouble();
            arr[i] = elem;

            i++;
        }

        double sum = 0;

        for(double el: arr){
            sum += el;
        }

        double average = sum / length;

        for(double el: arr){
            System.out.printf("%f ", el * average);
        }
    }
}