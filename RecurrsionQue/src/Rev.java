import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        return helper(n, 0);//starting with 0

    }

    public static int helper(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n%10;
        return helper(n / 10, sum * 10 + rem);// pass updated sum forward
    }
}