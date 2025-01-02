import java.util.*;
public class fibonacci {
    static int fib(int n){
        if((n==0 || n==1) ){
            return n;
        }
        // int a=fib(n-1);
        // int b=fib(n-2);
        // return a+b;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter Num: ");
        int num = scanner.nextInt();
        System.out.println(fib(num)); 
        scanner.close();
    }
    

}
