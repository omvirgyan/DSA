import java.util.HashSet;


public class longest {

    public static void main(String[] args) {
        int[] a = {5,1,2,4,6,7,8,9,1,2,3,4,5,6,7,11,12,13,14,15,16,17};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
              hs.add(a[i]);
        }
        
    }
}