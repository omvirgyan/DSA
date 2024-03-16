//FIND THE UNIQUE NUMBER IN ARRAY WHERE ALL THE ELEMENT ARE BEING
//REPEATED TWICE WITH ONE BEING UNIQUE suppose only +ve element in array
public class Array9 {
    static void uniqElement(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(arr[i] == arr[j]){
                  arr[i]=-1;
                  arr[j]=-1; 
                }
            }
        }
        int ans=-1;
        for(int i = 0; i < len; i++){
            if(arr[i] >ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arra={1,3,1,4,2,3,4,5,2,9,8,9};
        uniqElement(arra);
    }
}
