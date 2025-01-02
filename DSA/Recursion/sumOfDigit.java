//Sum Of Digits
public class sumOfDigit {
    static int sumOfDigits(int n){
        if(n>=0 && n<=9){
            //base case
            return n;
        }
        //recursive work
        // int smallAns=sumOfDigits(n/10);
        // int ans=smallAns+n%10;
        // return ans;
        return sumOfDigits(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(5234));
        
    }
}
