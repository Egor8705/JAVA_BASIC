import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       float x = in.nextFloat();
       float y = in.nextFloat();
       float z = in.nextFloat();

       double m = (x + y + z) / 3;
       System.out.println(m);

       m = Math.floor(m / 2);

       if(m > 3){
           System.out.println("Программа выполнена корректно");
       }
    }
}