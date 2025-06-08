public class Peakno {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2};
        int start = 0;
        int end = arr.length-1;
        System.out.println(ans(arr, start, end));
    }
    static int ans(int[] arr, int start , int end){
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;

            }
        }
        return arr[start];

    }
}
