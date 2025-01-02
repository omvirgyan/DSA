//SUM OF SERIES TILL GIVEN n
public class sumOfSeries{
    static int sumOfSerie(int num){
        if(num==0){
            return 0;
        }
        // int sum=sumOfSerie(num-1)+num;
        // return sum;
        return sumOfSerie(num-1)+num;
    }

    public static void main(String[] args) {
    System.out.println(sumOfSerie(10));
    }
}