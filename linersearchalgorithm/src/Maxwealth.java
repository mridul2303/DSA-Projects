public class Maxwealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                {2,4,6}};
        // first row is one person which has 3 bank accounts one has 1 rupee 2 has 2 and 3 has 3
        // and there are two persons .
        System.out.println(maxwealth(accounts));

    }
    public static int maxwealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        // person = row
        // account = column
        for (int person = 0 ; person < accounts.length ; person++){
            int sum = 0 ;
            for (int account = 0 ; account < accounts[person].length ; account++){
                sum += accounts[person][account];

            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
