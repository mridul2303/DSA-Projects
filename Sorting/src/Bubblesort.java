import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sorting(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // we need to check till n-1
            for (int j = 1; j < arr.length - i; j++) {
                // if previous is bigger than swap
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped == true) {
                break;
            }
        }
    }
}