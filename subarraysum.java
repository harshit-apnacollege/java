public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        for (int start = 0; start < arr.length; start++) {

            int sum = 0;

            for (int end = start; end < arr.length; end++) {

                sum = sum + arr[end];

                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println(" Sum = " + sum);
            }
        }
    }
}