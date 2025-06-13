import java.util.Scanner;

//if no. is even divide it by 2 otherwise subtract 1 from it
public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(steps(n));
    }
    public static int steps(int n){
        if (n==0){
            return 0;
        }
        if (n%2==0){
            return 1 + steps(n/2);
        }
        else {
            return 1 + steps(n-1);
        }
    }
}
