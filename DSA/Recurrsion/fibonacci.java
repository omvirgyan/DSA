
public class fibonacci {
    static int fibonacci(int index){
        if(index == 0){
            return 0;
        } else if(index == 1 || index == 2) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
    public static void main(String[] args) {
       for(int index=0; index<=15; index++){
        int result = fibonacci(index);
        System.out.print(result + " ");
       }
        
    }
}
