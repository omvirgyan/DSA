class maxSum{
    public static void main(String[] args) {
        int maxSum[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<maxSum.length;i++){
            sum=sum+maxSum[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        System.out.println(max);
    }
}