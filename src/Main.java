import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = in.nextLine()  ;


        String separator = "\\s+";
        String latin = "^[A-Za-z]+";

        String[] arr = str.split(separator);

        int latinCounter = 0;
        for(String word:arr){
            boolean isLatin = word.matches(latin);
            if(isLatin){
                System.out.println(word);
                latinCounter++;
            }
        }

        System.out.println(latinCounter);
    }
}