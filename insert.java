public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 0};

        int x = 99;
        int y = 2;

        for(int i = arr.length - 1; i > y; i--){
            arr[i] = arr[i - 1];
        }

        arr[y] = x;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}