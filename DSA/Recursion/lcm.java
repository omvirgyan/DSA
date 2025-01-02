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
    public static int igcdof(int a, int b){
        if(a%b==0){                  // itrative method
            return b;
        }
           return igcdof(b, a%b);
}
        public static void main(String[] args) {
            System.out.println(igcdof(4008979, 221));
        }
}
