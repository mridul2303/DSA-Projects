import java.util.Scanner;

public class Searchinstrings {
    public static void main(String[] args) {
        String[] arr = {"Mridul", "aadi", "himashra", "amay"};
        Scanner inp = new Scanner(System.in);

                System.out.println("enter target string");
                String target = inp.next();
                int ans = search(arr,target);

                if (ans != -1){
                    System.out.println("element found at index no." + ans);
                }
                else {
                    System.out.println("element not found");
                }
    }
    static int search(String[] arr, String target ) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(target)){ // use .equals intead of == for strings
              return i ;
            }

        }
        return -1;
    }}
