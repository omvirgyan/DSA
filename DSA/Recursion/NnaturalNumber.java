import java.util.*;
public class NnaturalNumber {
    static void nNaturalNumber(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        nNaturalNumber(n-1);
        
    }
    public static void main(String[] args) {
        System.out.print("Enter last num:");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        nNaturalNumber(num);
        scanner.close();
    }
    
    
}