import java.util.Arrays;
import java.util.Scanner;

public class Findingpositionoftargetelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int[] result = searchRange(arr, target);
        System.out.println("Target position range: " + Arrays.toString(result));
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        // Find first and last occurrence using binary search
        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Look for the first occurrence
                } else {
                    start = mid + 1; // Look for the last occurrence
                }
            }
        }

        return ans;
    }
}


