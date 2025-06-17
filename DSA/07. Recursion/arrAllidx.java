//Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array.
public class arrAllidx{
    public static void arridx(int[] arr, int idx, int target){
        if(arr.length==idx){
            return ;
        }
        if(arr[idx]==target){
            System.out.print(idx);
        }
        arridx(arr,idx+1,target);
    }
    public static void main(String[] args){
        int arr[]={2,15,2,3,4,5,6,2,7,8,9,10};
        arridx(arr, 0,2);
    }
}