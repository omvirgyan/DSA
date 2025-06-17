//parameterise constructor
public class Animal02 {
    String name;
    String color;
    int age;
    Animal02(String name,String color,int age){
      this.name=name;                   //here this distingue b/w same variable name of paramenter and class variable
      this.color=color;
      this.age=age;
    }
    public static void main(String[] args) {
        Animal02 dog = new Animal02("sheru","white",5);
        System.out.println("Animal name is "+dog.name +" his color is "+dog.color+" and age is "+dog.age);
    }
}
