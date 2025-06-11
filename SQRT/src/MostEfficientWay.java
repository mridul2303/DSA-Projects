import java.util.Scanner;

public class MostEfficientWay {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int n = inp.nextInt();
        System.out.println("enter preciscion");
        double p = inp.nextDouble();
        System.out.println(EfficientWay(n,p));
    }
    public static double EfficientWay(int n,double p) {
        double s = 0;
        double e = n;
        double m = s + (e-s)/2;
        if (m * m == n) {
            return m;
        } else {
            while (e - s > p) {
                m = (e + s) / 2;
                if (m * m > n) {
                    e = m;
                } else {
                    s = m;
                }
            }
            return (s + e) / 2;
        }
    }
}
