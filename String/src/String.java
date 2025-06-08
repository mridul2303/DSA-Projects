public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String series = "  ";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
            // a new object is creating everytime
            // 1 a    2 ab  3 abc     4 abcd  ......
        }
        System.out.println(series);

    }
}
// at last string from a , ab , abc , abcd , abcde ........ till abcdefg....y has no refrence variable so they all go to garbadge
 // so values till abcd.....y are occupying unneccessary space
// solution is do something like series = abcd + something by which only value changes
// no new object made only purana objects value changes so for that we have stringbuilder class