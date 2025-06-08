import java.util.Arrays;

public class Rowcolmat {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,},
                {5,4,6},
                {7,8,9}};
        int target = 6;
        System.out.println(Arrays.toString(matrix(arr,target)));


    }
    static int[] matrix(int[][]  arr, int target){
        int r = 0 ;
        int c = arr[0].length-1;
        while(r< arr.length && c>= 0) {
            if (target == arr[r][c]) {
                return new int[]{r, c};

            }
            if (target < arr[r][c]) {
                c--;

            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
        }

}
