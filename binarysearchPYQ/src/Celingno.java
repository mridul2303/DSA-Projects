import java.util.Scanner;

// celing no. is samllest no. greater than target no.
public class Celingno {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        Scanner inp = new Scanner(System.in);
        int target = inp.nextInt();
        int ans = find(arr,target);
        System.out.println("celing no. at index " + ans);
        System.out.println("celing no is = " + arr[ans]);




    }
    public static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2 ;

            if (target>arr[mid]){
                start = mid + 1;
            } else if (target<arr[mid]) {
                end = mid - 1;

            }else {
                return mid;
            }
        }
        return start;  //always start will be going the answer if above is not true
    }



}
