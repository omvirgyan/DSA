package Multiple;

class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Barking ");
    }

}

class lebraDog extends Dog{
    void name(){
         System.out.println("Dog name is Sheru");
    }
    public static void main(String[] args) {
        lebraDog d=new lebraDog();
        d.name();
        d.Bark();
        d.eat();
    }
}