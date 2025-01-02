//Sum of first n natural numbers by recursion
public class arraySum {
    public static int arrSum(int arr[],int i){
        if(arr.length-1==i){
            return arr[i];
        }
        int smallAns=arrSum(arr, i+1);
        return arr[i]+smallAns;
    }
    public static void main(String[] args) {
        System.out.println(arrSum(new int[]{1,2,3,4,5,6,7,8}, 0));
    }
}
