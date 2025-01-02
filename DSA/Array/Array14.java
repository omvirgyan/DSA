//Queries
public class Array14 {
static void freeArray(int[] arr, int num){
    int[] freeArray = new int[100005];
    for(int i = 0; i < arr.length; i++){
        freeArray[arr[i]]++;
    }
    if(freeArray[num]>0){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
}

    public static void main(String[] args) {
        int[] arr = {22,434,54,456,343,341};
        freeArray(arr, 34);
    }
}
