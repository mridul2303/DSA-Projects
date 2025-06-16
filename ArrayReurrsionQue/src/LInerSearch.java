public class LInerSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,7};
        int target = 5;
        int ans = seach(arr,target,0);
        System.out.println(ans);
    }
    public static int seach(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if (target==arr[index]){
            return index;
        }
          return   seach(arr,target,index+1);
    }
}
