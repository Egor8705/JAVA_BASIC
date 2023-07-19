public class Main {
    public static void main(String[] args) {
       byte[] arr = {1,6,9,3,4};

        byte a = arr[0];
        int lastIndex = arr.length - 1;


        arr[0] = arr[lastIndex];
        arr[lastIndex] = a;

        int middleIndex = lastIndex / 2;
        System.out.println(arr[0] + arr[middleIndex]);
    }
}