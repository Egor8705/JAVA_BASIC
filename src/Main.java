import java.util.Scanner;

public class Main {
    public static int getUniqueSymbolsCount(String str){
        String s = str;

        int i = 0;
        while (i < s.length()){
            char elem = s.charAt(i);
            s = elem + s.replaceAll(String.valueOf(elem), "");
            i++;
        }

        return s.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int length = in.nextInt();

        String[] strArr = new String[length];

        for(int i = 0;i < strArr.length;i++){
            System.out.print("Строка " + (i + 1) + ": ");
            strArr[i] = in.next();
        }

        int maxUniqueValue = 0;
        String s = "";
        for (String str: strArr){
            int len = getUniqueSymbolsCount(str);
            if(len > maxUniqueValue){
                maxUniqueValue = len;
                s = str;
            }
        }

        System.out.printf("Ответ: %s", s);
    }
}