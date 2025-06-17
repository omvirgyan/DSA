//sum of n digit with alternate sign like:- 1-2+3-4+.....n
public class alternateNsum {
   
    // static int positive = 0;
    // static int negative = 0;

    // static int alternate(int n){
    //     if(n==0) return 0;
    //     if(n%2==0){
    //         negative = n + negative;
    //     } else {
    //         positive = positive + n;
    //     }
    //     alternate(n-1);
    //     return positive - negative;
    // }
    static int alternate(int n){
        if(n==0) return 0;
        if(n%2==0){
            return alternate(n-1)-n;
        } else {
            return alternate(n-1)+n;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(alternate(111100));
    }
}
