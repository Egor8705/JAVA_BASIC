import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tries = 2;
        int firstTry = 0;
        int secondTry = 1;

        String answer = "Заархивированный вирус";
        String bingo = "Правильно!";
        String help = "Подсказка";
        String helpStr = "Какая то подсказка";
        String thinkMore = "Подумай еще!";
        boolean helpUsed = false;
        String noHelp = "Подсказка уже недоступна";
        String fail = "Обидно, приходи в другой раз";

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        for(int i = firstTry;i <= tries;i++){
            String attempt = in.nextLine();

            if(answer.equals(attempt)){
                System.out.println(bingo);
                return;
            }

             if(i == firstTry){
                if(help.equals(attempt)){
                    helpUsed = true;
                    System.out.println(helpStr);
                    continue;
                }
                    System.out.println(thinkMore);
                    continue;
            }

             // По условию не понятно, если ввели "Подсказка" на 2 или 3 попытке,
             // то попытка является использованной или нет, я допустил что нет
            if(help.equals(attempt)){
                System.out.println(noHelp);
                attempt = in.nextLine();
            }

            if(answer.equals(attempt)){
                System.out.println(bingo);
                return;
            }

             if(helpUsed){
                 System.out.println(fail);
                 return;
             }

             if(i == secondTry){
                 System.out.println(thinkMore);
             }
        }

        System.out.println(fail);
    }
}