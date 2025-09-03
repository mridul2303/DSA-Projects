public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,8,3};
        int s = 0;
        int e = arr.length-1;
        int p = arr[e];
        quickSort(arr,s,e,p);
    }
    static void quickSort(int[] arr,int s,int e,int p){
        if (s==e){
            for (int i = 0; i < arr.length ; i++){
                System.out.println(arr[i]);
return;
            }
            int index = 0;
            for (int j = 0 ; j < e-1; j++){
                if (p<j){
                    index++;
                }
                else {
                    swap(j,index,arr);

                }
            }
        }

    }
static void swap(int j , int index,int[] arr){
        int temp = arr[j];

}}
