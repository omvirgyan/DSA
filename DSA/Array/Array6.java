//CHECK WHEATHER THE ARRAY IS SORTED OR NOT in asscending order
public class Array6 {
    static void isSorted(int[] arr){
        boolean check=true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }if(check==false){
            System.out.println("Array is not sorted");
        }else{
            System.out.println("Array is sorted");
        }
    }
    public static void main(String[] args) {
        int[] arr={44,66,1,234,2414,2444};
        int[] arr2={2,56,111,423,2323};
        int[] arr3={10,7,5,3,2};
        isSorted(arr);
        isSorted(arr2);
        isSorted(arr3);
    }
}
