import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер матрицы");

        System.out.print("Введите количество строк: ");
        int n = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        System.out.print("Введите данные массива: ");

        for (int i = 0;i <n;i++){
            for (int j = 0;j < m;j++){
                int elem = in.nextInt();
                arr[i][j] = elem;
            }
        }

        for (int j = 0;j < m;j++){
            System.out.print(" " + arr[0][j] * 3 + " ");
        }
    }
}