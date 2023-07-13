import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = 5;

        System.out.print("Ввод: ");
        String str = in.nextLine();

        if(str.length() != length){
            System.out.println("Некорректное уравнение");
        }

        int num;
        int pos;

        boolean isPlusSign = str.charAt(1) == '+';

        char x = str.charAt(0);
        char y = str.charAt(2);
        char z = str.charAt(4);

        if(Character.isDigit(x) && Character.isDigit(y)){
            int n = Character.getNumericValue(x);
            int m = Character.getNumericValue(y);

            System.out.printf("Ответ: %d", isPlusSign ? n + m : n - m);
            return;
        } else if(!Character.isDigit(z)){
            System.out.println("Некорректное уравнение");
            return;
        } else if(Character.isDigit(x)){
            num = Character.getNumericValue(x);
            pos = 0;
        } else if(Character.isDigit(y)){
            num = Character.getNumericValue(y);
            pos = 2;
        } else {
            System.out.println("Некорректное уравнение");
            return;
        }

        int res = Character.getNumericValue(z);

        if(isPlusSign){
            System.out.printf("Ответ: %d", res - num);
        } else {
            System.out.printf("Ответ: %d", pos == 0 ? num - res : num + res);
        }
    }
}