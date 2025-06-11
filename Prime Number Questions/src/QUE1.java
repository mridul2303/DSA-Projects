import java.util.Scanner;

//need to find wheather a no. is prime or not
public class QUE1 {
    public static void main(String[] args) {
        System.out.println("enter the no. to check");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(check(n));
    }
    public static String check(int n) {
        if (n <= 1) return n + " is not prime"; // Edge case

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return n + " is not prime";  // Return immediately if divisible
            }
        }
        return n + " is prime";  // If no divisors found, it's prime
    }
}

