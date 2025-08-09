public class test2 {
    public static void main(String[] args) {
        int x = 16;
        System.out.println(isPowerOfTwo(x));
    }

    static boolean isPowerOfTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }
}
