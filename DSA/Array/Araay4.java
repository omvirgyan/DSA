//ARRAY REFRENCE IN JAVA

public class Araay4 {
    static void printArray(int[] arra){
        
        for(int i = 0; i <arra.length;i++){
            System.out.print(arra[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={55,66,77,23,55};
        int[] arr_2=arr;
        arr_2[0]=4;
        arr_2[1]=99;
        System.out.println("Originall Array");
        printArray(arr);
        System.out.println("Copied array");
        printArray(arr_2);
        
    }
}
