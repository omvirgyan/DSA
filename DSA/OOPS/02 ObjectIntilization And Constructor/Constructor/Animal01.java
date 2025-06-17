//without parameter constructor
public class Animal01 {
    String name;
    String color;
    int age;
    Animal01(){
      name="Sheru";
      color="white";
      age=3;
    }
    public static void main(String[] args) {
        Animal01 dog = new Animal01();
        System.out.println("Animal name is "+dog.name +" his color is "+dog.color+" and age is "+dog.age);
    }
}
