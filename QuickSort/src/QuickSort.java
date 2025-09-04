public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 7, 8, 3};
        quickSort(arr, 0, arr.length - 1);

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void quickSort(int[] arr, int s, int e) {
        if (s < e) {
            int p = partition(arr, s, e); //will return pivot index
            quickSort(arr, s, p - 1); // left side
            quickSort(arr, p + 1, e); // right side
        }
    }

    static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, e);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
