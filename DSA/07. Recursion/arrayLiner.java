//Given an array of n integers and a target value x. Print whether x exists in the array or not.
//2nd return their idx if present else -1
public class arrayLiner {
    public static boolean arrSearch(int[] arr, int idx,int target){
        if(arr.length<=idx) return false;
        if(arr[idx]==target)return true;
        return arrSearch(arr, idx+1, target);
    }
    public static int arrSearchIdx(int[] arr, int idx,int target){
        if(arr.length<=idx) return -1;
        if(arr[idx]==target)return idx;
        return arrSearchIdx(arr, idx+1, target);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,10};
        System.out.println(arrSearch(arr,0,10));
        System.out.println(arrSearchIdx(arr,0,78));
    }
}
