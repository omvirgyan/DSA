//TO FIND THE GCD OF TWO NUMBERS (HCF)
public class gcd {

// public static int igcdof(int a, int b){               // itrative method
//     while(a%b!=0){
//         int rem=a%b;
//         a=b;
//         b=rem;
//     }
//     return b;
// }

public static int igcdof(int a, int b){
           if(a%b==0){                  // itrative method
               return b;
           }
              return igcdof(b, a%b);
}               
    public static void main(String[] args) {
        System.out.println(igcdof(1000, 150));
    }
}
