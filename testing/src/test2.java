import com.sun.source.tree.WhileLoopTree;

public class test2 {
    public static void main(String[] args) {
        int x = 11222211;
        System.out.println(ispalindrome(x));
    }
    static boolean ispalindrome(int x){
        String str = String.valueOf(x);
        int i = 0 ;
        while ( i < str.length()/2){
            if (str.charAt(i) == str.charAt(str.length()-i-1))
            {
                i++;
            }else {
                return false;
            }
        }
        return true ;
    }
}
