//Give array of integer Return first element that are repetating
public class Array11 {
    static int firstRepeat(int[] arr){
        
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={8,53,4,87,88,3,81,4,53};
        System.out.println(firstRepeat(array));
    }
}
