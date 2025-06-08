public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // builder.append(ch);
        }
        System.out.println(builder.toString());

    }

}
// we can do many thing by builder.anything to the stringbuilder
// for ex : builder.reverse , etc.
