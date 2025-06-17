// Object intilization by dot operator
public class Animal {
        String name;
        int age;
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Buzzo";
        dog.age=5;
        System.out.println("Animal is "+dog.name+" and his age is "+dog.age+" year");
    }
}