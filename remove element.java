public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int x = 2;

        for(int i = x; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}