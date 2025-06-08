import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - i - 1; i++) {
            // find maximum item in remaining array and swap it with its correct place
            int last = arr.length - i - 1;
            int maxindex = getMaxindex(arr, 0, last);
            swap(arr,maxindex,last);
        }
    }
    static void swap(int[] arr, int first , int sec){
        int temp  = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
    private static int getMaxindex(int[] arr, int start , int end){
        int max = start;
        for (int i = 0 ; i <=end ; i++ ){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;

    }
}
