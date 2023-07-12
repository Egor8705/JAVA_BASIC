import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите: I like Java!!!");
        String str = in.nextLine()  ;

        boolean cont = str.contains("Java");
        boolean start = str.startsWith("I like");
        boolean end = str.endsWith("!!!");

        if(cont && start && end){
            System.out.println(str.toUpperCase());

            str = str.replaceAll("a", "o");
            System.out.println(str.substring(str.indexOf("J"),str.indexOf("J") + 4));
        }
    }
}