public class Rotationcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotations(arr));

    }
    static int rotations(int[] arr){
        int pivot = findpivot(arr);
        return pivot + 1;

    }
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start)/2;
            // 4 cases will be there
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;

            }
            if (arr[mid] >= arr[start]){
                start = mid+1;

            }
            else {
                end = mid - 1;

            }

        }
        return -1;

    }
}
