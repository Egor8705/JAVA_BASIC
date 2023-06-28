import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       byte[] arr = {1,6,9,3,4};

        byte a = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = a;

        int middleIndex = (int) (Math.floor((float) arr.length / 2));
        System.out.println(arr[0] + arr[middleIndex]);
    }
}