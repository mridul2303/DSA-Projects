public class Evendigit {
    public static void main(String[] args) {
        int[] num = {12,123,4311,32445,63235};
        System.out.println(findnumbers(num));

    }
    static int findnumbers(int[] num) {
        int count = 0;
        for (int n : num) { // Loop through each number in array
            if (checkdigit(n)) {
                count++;
            }
        }
        return count;
    }
    // function for counting no. of digits
    static int countdigits(int num) {

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // to check digits are even or not
    static boolean checkdigit(int num) {
        int digitcount = countdigits(num);
      //  if (digitcount % 2 = 0) {
     //       return true;
       // }
     //   return false;
        return digitcount % 2 == 0; // direct way
    }
}
