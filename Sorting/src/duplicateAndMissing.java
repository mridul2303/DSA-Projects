public class duplicateAndMissing {
    public static void main(String[] args) {
      int[] arr = {1,2,2,4};
        int[] result = missing(arr);
        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);

    }
    static int[] missing(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]){
                swap(arr,correct,i);
            }
            else {
                i++;
            }
        }

        for (int index = 0 ; index < arr.length ; index++){
            if (arr[index] != index + 1 ){
                return new int[]{arr[index], index + 1};
            }
    }
        return new int[]{-1, -1};
    }


    static void swap(int[] arr, int checkindex , int i ) {
        int temp = arr[checkindex];
        arr[checkindex] = arr[i];
        arr[i] = temp;
    }
}
