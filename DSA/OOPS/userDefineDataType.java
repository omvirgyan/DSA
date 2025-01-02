public class userDefineDataType {
    //creating own data type
 public static class Student{
    String name;
    int rollNo;
    double percentage;
 }
public static void main(String[] args) {
    Student x=new Student();              //declaration or object of Student class
    x.name ="Raghav";                     //insialization
    x.rollNo = 67;
    x.percentage =69.9;
    System.out.println(x);
    System.out.println(x.name); 
    System.out.println(x.rollNo);
    System.err.println(x.percentage);
    Student y=new Student();                //declaration or object of Student class
    y.name ="mohan";                     //insialization
    y.rollNo = 7;
    y.percentage =89.9;

}    
}