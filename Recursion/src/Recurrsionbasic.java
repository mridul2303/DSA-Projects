public class Recurrsionbasic {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==6){ //Base Condition for our recursion
            System.out.println("6");
            return;
        }
        else {
            System.out.println(n);
            print(n+1); //Recursive Call
        }

    }
}
