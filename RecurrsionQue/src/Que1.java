import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        int n = 5;
        func(n);
    }
    //to print n to 1
    public static void func(int n) {
        if (n == 1) {
            System.out.println("1");
            funcrev(2);
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    public static void funcrev(int n) {
        if (n>5){
            return;
        }
        System.out.println(n);
        funcrev(n+1);
    }
}