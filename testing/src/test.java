import java.sql.SQLOutput;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","fly"};
        int minlenth = checknoofchar(arr);
        commonprefix(arr,minlenth);
            }
           static int checknoofchar(String[] arr){
        int min = arr[0].length() ;
        for (int i=0; i< arr.length;i++){
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
            }
        return min;
        }
static void commonprefix(String[] arr,int minlength){
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i <minlength ; i++){
            char ch = arr[0].charAt(i);
            for (int j = 1; j<arr.length;j++){
                if (arr[j].charAt(i) != ch){


                }
            }
            prefix.append(ch);
        }
    System.out.println(prefix.toString());
    }}
