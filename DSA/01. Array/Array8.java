//FIND THE TOTAL Numbers of pairs,triplet in the Array 
//Whose sum is equal to given value X


public class Array8 {
    static void pairOfArray(int[] array, int X){
        int len = array.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(array[j]+array[i]==X){
                   count++;
                }
            }
        }
        System.out.println(count);
    }
    static void tripletOfArray(int[] array, int target){
        int len = array.length;
        int count = 0;
        for(int i = 0; i < len;i++){
            for(int j = i+1; j < len; j++){
                for(int k = j+1; k < len; k++){
                    if(array[i]+array[j]+array[k]==target){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={3,4,4,11,33,1,4,1,2,0};
        pairOfArray(arr, 5);
        tripletOfArray(arr, 5);
    }
}
