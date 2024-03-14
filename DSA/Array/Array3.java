import java.util.*;
public class Array3 {
    public static void main(String[] args) {
       System.out.print("ENTER SIZE OF ARRAY");
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[] arr=new int[size];
       for (int i=0; i<size; i++){
        System.out.print("a["+i+"]=");
         arr[i]=sc.nextInt();
       }
       System.out.print("array= ");
       for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
       }
       sc.close();
    }
    
    
}