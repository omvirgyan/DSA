//mutiple of num till given multi value
public class multipleOfNum {
    static void multipleOf(int num, int multi ){
        if(multi==1)  {
            System.out.println(num);
            return;
        }
       multipleOf(num, multi-1);
      System.out.println(num*multi);
    }
    public static void main(String[] args) {
    multipleOf(5, 7);
    }
}
