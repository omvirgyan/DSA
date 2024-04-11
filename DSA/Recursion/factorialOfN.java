import java.util.*;
public class factorialOfN {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=factorial(n-1);
        int ans=fact*n;
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter last num:");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(factorial(num));
    }
}
