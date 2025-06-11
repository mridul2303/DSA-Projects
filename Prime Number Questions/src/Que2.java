import java.util.Scanner;

// print all the numbers from 1 to n which are prime
public class Que2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter no.");
        int n = inp.nextInt();
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        sieve(n,prime);

        for (int i = 2 ; i<n ; i++){
        if (!prime[i])//all false are my prime numbers
        {
            System.out.println(i);
        }
        }
    }
    public static void sieve(int n,boolean[] prime){
        for (int i = 2 ; i<Math.sqrt(n) ; i++){
            prime[i] = false;//marking all prime as false
            for (int j = i*i ; j<=n ; j+=i){//making all multiples of prime true
                prime[j] = true;
            }
        }


    }

}
