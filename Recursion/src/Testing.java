public class Testing {
    public static void main(String[] args) {
        // we need to print first n no.s without calling function again in main class
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2); // so we are calling function inside function
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}

