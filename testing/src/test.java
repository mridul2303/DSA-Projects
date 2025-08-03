import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9 ;
           for (int i = 0 ; i < arr.length - 1; i++){
               for (int j = i + 1 ; j < arr.length  ; j++){
                   if (arr[i] + arr[j] == 9){
                       int[] ans = {i,j};
                       System.out.println(Arrays.toString(ans));
                   }

               }
       }
    }
    }
