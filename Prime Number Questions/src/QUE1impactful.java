import java.util.Scanner;

public class QUE1impactful {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter no. to check");
        int n = inp.nextInt();
        System.out.println(isprime(n));
    }
    public static String isprime(int n ){
        if (n<=1){
            System.out.println("not prime");
        }
        for (int i = 2 ;i<= Math.sqrt(n) ; i++)//checking till sqrt beacuse after it value repeats
        {
            if (n%i == 0){
                return n+ " is not prime";
            }

        }
        return n+" is prime";
    }
}
