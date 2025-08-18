import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String h = inp.nextLine();
        String n = inp.nextLine();
        Solution s = new Solution();
        s.strstr(h,n);
    }
}
class Solution{
    public int strstr(String h, String n){
        if (h.length()<n.length()){
            return -1;
        }
        int i = 0;
        while (i<h.length()-n.length()+1){
            if (h.startsWith(n)){
                return i;
            }
            else {
                i++;
                h = h.substring(i);
            }        }
    return -1;
    }}