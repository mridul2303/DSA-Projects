import java.util.Scanner;
// in this we are searching for element in array

public class Linearsearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the target no.");
        int target = inp.nextInt();
int ans = linearsearch(arr,target);
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found.");
        }


    }
    static int linearsearch(int [] arr ,int target){

        if (arr.length == 0){
            return -1;
        }
// seaching at every index for that target element

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                return i ;
            }

        }
        return -1;
    }
}
