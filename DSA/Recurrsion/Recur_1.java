class Recur_1{
    static void printincr(int num){
      if(num==1){
        System.out.println(1);
        return;
      }
      printincr(num-1);
     System.out.println(num);
    }
    static void printdcr(int num){
        if(num==1){
            System.out.println(1);
            return;
        }
        System.out.println(num);
        printdcr(num-1);
    }
    static int fact(int num){
        if(num==1 || num==0) return 1;
        return num*fact(num-1);
    }
    static void table(int num, int count) {
        if (count < 1) {
            return; // Base case: multiplication by 0 terminates the recursion
        }
        table(num, count - 1); // Recursive call
        int product = num * count;
        System.out.println(num + " x " + count + " = " + product); // Print the multiplication table
    }
    
    
    public static void main(String[] args) {
    printincr(5);
    System.out.println("DECREMENT");
    printdcr(8);
    System.out.println("factorial");
    System.out.println(fact(30));
   table(2, 10);
    }
}