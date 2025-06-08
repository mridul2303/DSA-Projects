public class Minimumno {
    public static void main(String[] args) {
        int [] arr = {9,2,3,4,5};
        int minvalue = minimum(arr);

        System.out.println("min value in array " + minvalue);


    }
    static int minimum(int[] arr){
        int minval = arr[0];
        for (int i = 1; i < arr.length ; i++){
            if (arr[i] < minval){
                minval = arr[i];


            }

        }
        return minval;
    }

}
