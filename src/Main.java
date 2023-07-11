import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 9;
        int[] comp = {x,y,z};
        boolean showMessage = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int length = in.nextInt();

        System.out.print("Введите данные массива: ");
        int i = 0;
        while (i < length){
            int elem = in.nextInt();

            if(!showMessage){
                for(int n: comp){
                    if(n == elem){
                        showMessage = true;
                        break;
                    }
                }
            }

            i++;
        }

        if(showMessage){
            System.out.println("Данное значение имеется в константах");
        }
    }
}