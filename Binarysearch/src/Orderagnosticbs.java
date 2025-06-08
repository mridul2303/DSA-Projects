public class Orderagnosticbs {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2};
        int target = 7;

        if (arr[0]>arr[1]) {
            //descending
            System.out.println(descending(arr,target));
        }
        else{
            //ascending
            System.out.println(ascending(arr,target));
        }
    }

    public static int ascending(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        System.out.println("arr is in ascending order");

        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid]<target) {
                start = mid + 1;

            }
            else {
                return mid;
            }

        }
        return -1 ;

    }


    public static int descending(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        System.out.println("arr is in descending order");

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target>arr[mid]){
                end = mid - 1 ;
            }
            else if (target<arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
