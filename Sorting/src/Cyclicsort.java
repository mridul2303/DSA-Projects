import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i] - 1;
            if (arr[i] != arr[correctindex]) {
                swap(arr, correctindex, i);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int checkindex , int i ){
        int temp = arr[checkindex];
        arr[checkindex] = arr[i];
        arr[i] = temp;

    }

}
