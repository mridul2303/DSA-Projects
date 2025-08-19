import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
String str = inp.nextLine();
  find(str);
    }
    static void find(String str) {
        String[] words = str.trim().split("\\s++");
        int ans = words[words.length-1].length();
        System.out.println(ans);
    }
}
