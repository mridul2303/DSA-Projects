import java.util.Arrays;

public class Seachfor2d {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,},
                {5, 78, 32},
                {23, 42, 36}
        };
        int target = 32 ;
        int[] ans = search(arr,target) ; // format of return value
        System.out.println(Arrays.toString(ans));


    }
    static int[] search(int[][] arr,int target){
        for (int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if (arr[row][col] == target){
                    return new int[] {row,col} ;
                }

            }
        }
        return new int[] {-1, -1};
    }
}
