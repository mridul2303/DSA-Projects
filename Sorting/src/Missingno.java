import java.util.Arrays;

public class Missingno {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        System.out.println(sort(arr));


    }
    public static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i] ;
            if (arr[i] != arr[correctindex] && arr[i] < arr.length) {
                swap(arr, correctindex, i);
            } else {
                i++;
            }
        }
        for (int index = 0 ; index < arr.length ; index++ ) {
            if (index != arr[index]) {
                return index;
            }
        }
                return arr.length;
    }
    static void swap(int[] arr, int checkindex , int i ){
        int temp = arr[checkindex];
        arr[checkindex] = arr[i];
        arr[i] = temp;

    }

}
