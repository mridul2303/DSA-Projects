import java.util.ArrayList;
import java.util.List;

public class Findallduplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 8, 6, 7, 5};
        List<Integer> duplicates = find(arr);
        System.out.println("Duplicates: " + duplicates);
    }

    static List<Integer> find(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // Only swap if value is not at the correct position and no duplicate at target index
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);  // Actual duplicate value
            }
        }

        return ans;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}