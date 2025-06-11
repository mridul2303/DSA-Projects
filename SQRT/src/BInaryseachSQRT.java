import java.util.Scanner;
//finding square root of a number by binary search
public class BInaryseachSQRT {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int n = inp.nextInt();
        System.out.println( "Square root of "+ n + " is = "+sqrt(n));
    }

    public static double sqrt(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Linear search for decimal part
        double ans = end;
        double increment  = 0.1;
        for (int i = 0; i < 3; i++) {
            while ((ans + increment) * (ans + increment) <= n) {
                ans += increment;
            }
            increment /= 10;
        }

        return ans;
    }
}
