import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       float x = in.nextFloat();
       float y = in.nextFloat();
       String z = in.next();

       switch (z){
           case "+":System.out.println(x + y);break;
           case "-":System.out.println(x - y);break;
           case "*":System.out.println(x * y);break;
           case "/":System.out.println(x / y);break;
           default:break;
       }
    }
}