// count the number of digits in a number using recursion
public class countOfdigit {
    static int countOfDigits(int n){
        if(n>=0 && n<=9){
            //base case
            return 1;
        }
        //recursive work
        return countOfDigits(n/10) + 1;
    }
 
    public static void main(String[] args) {
        System.out.println(countOfDigits(523489864));
    }
}

