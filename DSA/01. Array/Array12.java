//reverse an array consisting of integer value use another array
//and without usiny any other array

public class Array12 {
    static void reverseA(int[] array) {
        int len = array.length;
        int j=0;
        int[] ans=new int[len];
        for (int i=len-1; i>=0;i--){
          ans[j++] = array[i];
        }
        for (int item : ans) {
            System.out.print(item+" ");
        }
    }
    static void reverseArrayWithoutOtherArray(int[] array){
        int temp=0;
        int len = array.length;
        for(int i=0; i<len/2; i++){
           temp = array[i];
           array[i] = array[len-1-i];
           array[len-1-i]=temp;
        }
        
        for(int arra:array){
            System.out.print(arra+" ");
        }
    }

   static int[] rotateArray(int[] array,int k){      //Rotate kth times
       int len=array.length;
       k=k%len;
       int j=0;
       int[] ans=new int[len];
       for(int i=len-k;i<len;i++){
         ans[j++] = array[i];
       }
       for(int i=0;i<len-k;i++){
         ans[j++] = array[i];
       }
       return ans;
   }
   static void printArray(int[] array){
    for(int iteam:array){
        System.out.print(iteam+" ");
    }
   }
   

    public static void main(String[] args) {
        int[] ar={33,23,24,2,67,6765,73,1,0};
        System.out.println("REVERSED ARRAY USING ANOTHER ARRAY ");
        reverseA(ar);
        System.out.println();
        System.out.println("Reversed Array Without Using other array");
        reverseArrayWithoutOtherArray(ar);
        System.out.println();
        int k=3;
        int[] solution=rotateArray(ar,k);
        System.out.println("Array before rotation");
        printArray(ar);
        System.out.println("\nArray after rotation "+k+" Time");
        printArray(solution);
    }
    
}
