public class Fibonacci {
    public static void main(String[] args) {
             int m =   fibo(5);
        System.out.println(m);
    }
    static int fibo(int n){
        if (n<2){
            return n; // last thing that will execute
        }
        return fibo(n-1) + fibo(n-2);
    }
}
