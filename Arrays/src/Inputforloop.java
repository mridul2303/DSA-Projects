import java.util.Arrays;
import java.util.Scanner;

public class Inputforloop {
    public static void main(String[] args) {
        System.out.println("program for input of array using for loop");
        Scanner in = new Scanner(System.in) ;
        String[] arr = new String[5];
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = String.valueOf(in.next());
        }
        System.out.println(Arrays.toString(arr));
    }

}
