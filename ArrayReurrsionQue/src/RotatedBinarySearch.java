public class RotatedBinarySearch {
        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2};
            int target = 1;

            int result = search(arr, target, 0, arr.length - 1);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found.");
            }
        }

        public static int search(int[] arr, int target, int start, int end) {
            if (start > end) {
                return -1;
            }

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[start] <= arr[mid]) {
                // Target lies in the sorted left half
                if (target >= arr[start] && target < arr[mid]) {
                    return search(arr, target, start, mid - 1);
                } else {
                    return search(arr, target, mid + 1, end);
                }
            }

            // Otherwise, right half must be sorted
            else {
                // Target lies in the sorted right half
                if (target > arr[mid] && target <= arr[end]) {
                    return search(arr, target, mid + 1, end);
                } else {
                    return search(arr, target, start, mid - 1);
                }
            }
        }
    }

