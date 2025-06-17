public class lcm {
    // public static int igcdof(int a, int b){               // itrative method
    //     int x=a, y=b;
    //     while(a%b!=0){
    //         int rem=a%b;
    //         a=b;
    //         b=rem;
    //     }
    //     return (x*y)/b;
    // }
    public static int igcdof(int a, int b, int c){
        if(a%b==0){                  // itrative method
            return b;
        }
           int hcf=igcdof(b, a%b,c);
              return (c)/hcf;
}
        public static void main(String[] args) {
            System.out.println(igcdof(8, 5,8*5));
        }
}
