import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double karat = 0.00002;
        double lb = 0.453592;
        double pud = 16.3807;

        double mile = 1609.34;
        double yard = 0.9144;
        double foot = 0.3048;

       Scanner in = new Scanner(System.in);

       System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
       int unit = in.nextInt();

       if(unit == 1){
           System.out.println("Выберите единицу измерения массы: 1 - киллограмм, 2 - карат, 3 - фунт, 4 - пуд");
           int weight = in.nextInt();

           System.out.println("Введите величину");
           int quantity = in.nextInt();

           double base = 1;
           switch (weight){
               case 2:base = karat;break;
               case 3:base = lb;break;
               case 4:base = pud;break;
               default:break;
           }

           double weightKg = quantity * base;

           System.out.printf("Киллограммы: %f%n", weightKg);
           System.out.printf("Караты: %f%n", weightKg / karat);
           System.out.printf("Фунты: %f%n", weightKg / lb);
           System.out.printf("Пуды: %f%n", weightKg / pud);

       } else if(unit == 2) {
           System.out.println("Выберите единицу измерения расстояния: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
           int distance = in.nextInt();

           System.out.println("Введите величину");
           int quantity = in.nextInt();

           double base = 1;
           switch (distance){
               case 2:base = mile;break;
               case 3:base = yard;break;
               case 4:base = foot;break;
               default:break;
           }

           double distanceMeter = quantity * base;

           System.out.printf("Метры: %f%n", distanceMeter);
           System.out.printf("Мили: %f%n", distanceMeter / mile);
           System.out.printf("Ярд: %f%n", distanceMeter / yard);
           System.out.printf("Фут: %f%n", distanceMeter / foot);
       }
    }
}