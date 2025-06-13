import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n ){
        int rem ;
        if (n==0){
            return 0;
        }
        rem = n%10;
      return rem +sum(n/10);
    }
}
/* taking one more reference variable:

public class DigitSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ans =0;
        System.out.println(sum(n,ans));
    }
    public static int sum(int n , int ans){
        int rem ;
        if (n==0){
            return ans;
        }
        rem = n%10;
        ans = rem +sum(n/10,ans);
        return ans;
}
*/
