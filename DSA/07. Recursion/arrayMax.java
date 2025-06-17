//printing MAX array elements recursively
public class arrayMax {
    public static int arrMax(int arr[],int i){
        if(arr.length-1==i){
            return arr[i];
        }
        int smallAns=arrMax(arr, i+1);
        return Math.max(arr[i],smallAns );
    }

    public static void main(String[] args) {
        int arr[]={15,2,3,4,5,6,7,8,9,10};
        System.out.println(arrMax(arr, 0));
    }
}
