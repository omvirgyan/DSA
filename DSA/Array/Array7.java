//smallest and largest element of given array stored in another array 

import java.util.Arrays;

public class Array7 {
    static int[] smallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0] , arr[arr.length-1]};
        return ans;
    }
    
    static int[] kthsmallestAndLargest(int[] arr,int k){
        Arrays.sort(arr);
        if(k<arr.length){
            int[] ans={arr[k-1] , arr[arr.length-k]};
            return ans;
        }else{
            System.out.println("OUT OF INDEX");
            return null;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {33,2,1,6,434,54,0,-22,223223};
        int[] answer=smallestAndLargest(arr);
        System.out.println("Smallest: "+ answer[0]);
        System.out.println("Largest: "+ answer[1]);
        int kth=1;
        int[] answer1=kthsmallestAndLargest(arr, kth);
        if(answer1 != null){
        System.out.println(kth+" Smallest :" +answer1[0]);
        System.out.println(kth+" Largest :" +answer1[1]);
    }
        
        
    }
}
