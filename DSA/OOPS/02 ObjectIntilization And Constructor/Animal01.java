//Object inilization by method
public class Animal01 {
    String name;
    int age; 
    void initObj(String n,int a){
                name = n;
                age=a;
    }
    public static void main(String[] args) {
        Animal01 dog = new Animal01();
        dog.initObj("Buzzo",5);
        System.out.println("Animal is "+dog.name+" and his age is "+dog.age+" year");
    }
}
