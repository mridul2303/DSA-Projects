public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipappnotapple("afdappleappdf"));

    }
    static String skipappnotapple(String up){
        if (up.isEmpty()){
            return " ";
        }
        else {
            char ch = up.charAt(0);
            if (up.startsWith("app") && !up.startsWith("apple")){
                return skipappnotapple(up.substring(3));
            }
        else {
            return ch + skipappnotapple(up.substring(1));
            }}
    }}
