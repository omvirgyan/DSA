//Find second largest element of Array

public class Array10 {
    static int maxElement(int[] array){
       int max=Integer.MIN_VALUE;
       for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
       }
       return max;
    }
    static void secondLargestElement(int[] array){
        int mx=maxElement(array);
        for(int i=0;i<array.length;i++){
            if(array[i]==mx){
                array[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=maxElement(array);
        System.out.println(secondMax);
    }
    public static void main(String[] args) {
        int[] array={23,43,44,22,33,232,443,44,28,300};
        secondLargestElement(array);
        
    }
}
