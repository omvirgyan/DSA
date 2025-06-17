public class fibByTabulation {
    public int fib(int num,int[] dp){
        if(num==0||num==1) return num;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[num];
    }
    public static void main(String[] args) {
        fibByTabulation dp=new fibByTabulation();

    int n=10;
    int arr[]=new int[n+1];
    for(int i=0;i<=n;i++){
        arr[i]=-1;
    }
    System.out.println(dp.fib(n,arr));
    
    }
}
