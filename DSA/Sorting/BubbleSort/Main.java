import java.util.Arrays;

public class Main{
    static int[] bubble(int[] a){
        int n=a.length;
        for(int i=0; i<n; i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int swap = a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={23,1,5,6,11,34,99};
        System.out.println(Arrays.toString(bubble(arr)));
    }
}