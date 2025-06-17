import java.util.*;
public class factorialOfN {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter num:");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(factorial(num));
        scanner.close();
    }
}
