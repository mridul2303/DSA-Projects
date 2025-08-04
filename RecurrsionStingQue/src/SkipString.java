public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipKid("asdkljkid"));

    }
    static String skipKid(String up){
        if (up.isEmpty()){
            return "";
        }
        else {
            if (up.startsWith("kid")){
                return skipKid(up.substring(3));

            }
        else {
        return up.charAt(0) + skipKid(up.substring(1));
        }
        }
    }
}
