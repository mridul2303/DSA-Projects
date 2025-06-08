import java.util.Arrays;

public class Rowcol2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}};
        int target = 8;
        System.out.println(Arrays.toString(search(arr,8)));


    }

    static int[] binarysearch(int[][] arr, int target, int cstart, int cend, int row) {
        while (cstart < cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend + mid - 1;
            }
        }
        return new int[]{-1, -1};

    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1) {
            return binarysearch(arr, 0, 0, cols - 1, target);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }
        // now we have two rows
        // check weather the target is in the col of two rows
        if (arr[rstart][cMid] == target) {
            return new int[]{rstart, cMid};
        }
        if (arr[rstart + 1][cMid] == target) {
            return new int[]{rstart + 1, cMid};

        }
        // check in 1 half
        if (target <= arr[rstart][cMid - 1]) {
            return binarysearch(arr,rstart,0,cMid-1,target);
        }

        // check in 2 half
        if (target >= arr[rstart][cMid + 1] && target <= arr[rstart][cols + 1] ) {

            return binarysearch(arr,rstart,cMid+1,cols-1,target);

        }
        // check in 3 half
        if (target >= arr[rstart + 1][cMid - 1]) {
            return binarysearch(arr,rstart+1,cMid-1,0,target);
        }
        else {
            return binarysearch(arr, rstart+1, cMid + 1, cols - 1, target);
        }



    }
}
