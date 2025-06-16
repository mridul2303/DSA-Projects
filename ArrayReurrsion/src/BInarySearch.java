public class BInarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 3;
        int ans = search(arr,target,0,arr.length);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target,int s,int e){
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        } else if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        } else {
            return search(arr, target, m + 1, e);
        }
    }

}
