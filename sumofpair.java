public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 8, 4, 6, 5};

        int k = 10;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }

        System.out.println("Number of pairs = " + count);
    }
}