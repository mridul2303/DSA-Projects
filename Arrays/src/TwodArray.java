import java.util.Arrays;
import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums = new int[3][4];
        System.out.println(nums.length);

        for (int row = 0 ; row < nums.length ; row++){
            for (int col = 0 ; col < nums[row].length ; col++) {
                nums[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}

// for alternate output
//for (int row = 0 ; row < nums.length ; row++){
//      for (int col = 0 ; col < nums[row].length ; col++) {
//  nums[row][col] = in.nextInt();
// sout(num[row][col]);
// }
// sout(); it is for next line after one row