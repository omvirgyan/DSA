//ARRAY REFRENCE IN JAVA

public class Array4 {
    static void printArray(int[] arra){
        
        for(int i = 0; i <arra.length;i++){
            System.out.print(arra[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={55,66,77,23,55};
        int[] arr_2=arr;
        arr_2[0]=4;    //Value of copied array and original array remain same
        arr_2[1]=99;   //Because adrress refrence which is store in stack point same memory location in heap
        System.out.println("Originall Array");
        printArray(arr);
        System.out.println("Copied array");
        printArray(arr_2);
        
    }
}
