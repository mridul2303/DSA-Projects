import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int duplicate = findduplicate(arr);
        System.out.println(duplicate);

    }
    static int findduplicate(int[] arr) {
        int i = 0 ;
        while (i< arr.length){
            if (arr[i] != i + 1) {
                int correctindex = arr[i] - 1;
                if (arr[i] != arr[correctindex]) {
                    swap(arr, correctindex, i);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }

        }
        return -1;
    }
    static void swap(int[] arr, int checkindex , int i ) {
        int temp = arr[checkindex];
        arr[checkindex] = arr[i];
        arr[i] = temp;
    }
    }
