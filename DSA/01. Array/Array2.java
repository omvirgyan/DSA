class Array2 {

    static void sumOfArray(){
        int[] array={55,66,77,88};
        System.out.print("Array = ");
        int sum=0;
        for(int i=0; i<array.length;i++){
            sum=sum+array[i];
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of array: " + sum);
    }
    static void maxOfArray(){
        int[] array={55,44,55,543,99};
        System.out.print("Array = ");
        int max=0;

        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            System.out.print(array[i]+" ");
        }
          System.out.println("maxof array =" + max);
    }

    static void searchOfArray(int value){
        int[] array={55,44,55,543,99};
        for(int i=0; i<array.length;i++){
            
            if(array[i]==value){
                System.out.println("element found at "+ i);
            }
        }
            System.out.println("Element not present");
        
    }
    public static void main(String[] args) {
        
        sumOfArray();
        maxOfArray();
        searchOfArray(55);
    }
}
