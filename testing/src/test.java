import java.sql.SQLOutput;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {1, 1,2,2,3,4,5};
        int i = 0;
        findduplicates(nums,i);
    }
    static void findduplicates(int[] nums,int i){
        for (int j = 1; j < nums.length; j++){
            if (nums[i] != nums[j] ){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));}}
