public class maxrange {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5};
            System.out.println(max(arr,2,4));


        }
        static int max(int [] arr, int start , int end) {
            int maxval = start;

            for (int i = start ; i < end ; i++){
                if (arr[i] > maxval){
                    maxval = arr[i];
                }

            }
            return maxval ;
        }
    }

