/*public class Findinpeak {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2};
        int start = 0;
        int end = arr.length-1;
        int target = 2;
        int peak = peakindex(arr,start, end);
        int firsttry = binarysearch(arr,target);
        if (firsttry != 1){
            return fristtry;
        }


    }
    static int binarysearch(int[] arr, int target){
     while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            ans = mid;
        }}


    static int peakindex(int[] arr, int start , int end ){
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;

            }
        }
        return start;

    }
}*/