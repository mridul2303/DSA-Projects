import java.util.Scanner;

public class Que1input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int start = 2;
        //to print decrement
        func(n);
        //to print increment
        funcrev(start, n);
    }
    public static void func(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        System.out.println(n);
        func(--n);
    }
    public static void funcrev(int start, int n) {
        while (start <= n) {
            System.out.println(start);
            funcrev(++start , n );
            return;
        }
    }
}