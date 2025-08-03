public class SkipChar {
    public static void main(String[] args) {
        skip(" ","baccardah");

    }
    static void skip(String p,String up){
        // take characters from up to procecessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        } else {
            //check if char is a then dont add ch
            char ch = up.charAt(0);
            if (ch=='a'){
                skip(p,up.substring(1)); // substring breaks string from (start index , end index)

            }
        else {
            //else add ch
        skip(p + ch , up.substring(1));}
        }
    }}
