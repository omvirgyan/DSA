//Sort an array consist of 0 and 1;
public class Array15 {
    static void sort(int[] array){
        int count = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        for(int j=0; j<array.length;j++){
           if(j<count){
            array[j] = 0;
           }else{
            array[j] = 1;
           }
        }
    }
    static void sortWithoutDoubleLop(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i])
        }
    }
    static void printArr(int[] array){
        for(int iteam:array){
            System.out.print(iteam+" ");;
        }
    }
    
    public static void main(String[] args) {
        int[] array={1,0,0,1,1,0,1,0,0,0,0,0,1,1,1};
        System.out.println("Array before sorting");
        printArr(array);
        sort(array);
        System.out.println("\nArray after sorting");
        printArr(array);
    }
}
