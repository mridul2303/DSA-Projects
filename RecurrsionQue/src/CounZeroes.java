import java.util.Scanner;

public class CounZeroes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int c = 0 ;
        System.out.println(count(n,c));
    }
    public static int count(int n ,int c){
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem==0){
            return count(n/10,c+1);
        }
        else {
            return count(n/10,c);
        }


    }
}
