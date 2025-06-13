import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ans = 1;
        System.out.println(fact(n,ans));
    }
    public static int fact(int n ,int ans ){
        if (n==1){
            return ans;
        }
        ans = n*fact(n-1,ans);
        return ans;
    }
}
