class Animal{                                     //Aniamla class
    public void eat(){
    System.out.println("i am eating");
    }
    public static void main(String[] args) {
        Animal dog=new Animal();                //dog object
        dog.eat();
        dog.run();
       // dog.fly();                           //not possible because Animal and Bird Are diffrent class and dog is of Animal class
       Bird sparrow=new Bird();                // another object of bird class
       sparrow.fly();
    }
    public void run(){
        System.out.println("i am running");
        }
}
class Bird{
    public void fly(){
          System.out.println("Bird is flying");
    }
}