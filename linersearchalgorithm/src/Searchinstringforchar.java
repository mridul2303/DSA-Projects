public class Searchinstringforchar {
    public static void main(String[] args) {
        String name = "Mridul";
        char target = 'r'; // we use single inverted comma in char
        System.out.println(search(name ,target));

    }
    static int search(String str , char target) {


        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0 ; i < str.length() ; i++){
            if (target == str.charAt(i)){
                return i;
            }
        }
        return -1 ;
    }


}
