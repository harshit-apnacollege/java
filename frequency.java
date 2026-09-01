public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 5, 2, 7, 4};

        int x = 2;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }

        System.out.println("Frequency = " + count);
    }
}