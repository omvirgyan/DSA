//power of P^Q
public class powerOfPQ {
      static int powrOfPQ(int p, int q) {
        if(q==0){ 
            return 1;
        }
        int ans=powrOfPQ(p,q/2);
        if(q%2==0){
            return ans*ans;
        }
        return ans*ans*p;
      }
    public static void main(String[] args) {
        System.out.println(powrOfPQ(2, 4));
    }
}
