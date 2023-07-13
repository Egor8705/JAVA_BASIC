import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = -20;
        int max = 20;
        int length = 15;
        int[] arr = new int[length];

        Random random = new Random();

        for(int i = 0;i < length;i++){
            int elem = random.nextInt(max - min) - Math.abs(min);
            arr[i] = elem;
        }

        System.out.println(Arrays.toString(arr));

        int maxEl = min;
        int minEl = max;

        for(int i = 0;i < length;i++){
            int elem = arr[i];

            maxEl = Math.max(elem, maxEl);
            minEl = Math.min(elem, minEl);
        }

        System.out.println(Math.max(Math.abs(maxEl), Math.abs(minEl)));
    }
}