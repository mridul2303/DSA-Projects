public class Infinitearray {
    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(range(arr, target));


    }

    static int range(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // condition for target to view in the loop
        while (target > arr[end]) {

// double the box value
            int temp = end + 1; // this is my newstart
            end = end + (end - start + 1) * 2; // newend
            start = temp;

        }
        return binarysearch(arr, target, start, end);
    }
}
