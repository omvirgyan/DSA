//printing array elements recursively
public class arrayprint {
    public static void printArray(int arr[],int i){
        if(arr.length==i){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        printArray(arr, 0);
    }
}
