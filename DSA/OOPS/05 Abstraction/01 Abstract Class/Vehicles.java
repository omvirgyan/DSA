abstract class Vehicles{
    int key;
    abstract void start();
}
class Car extends Vehicles{
      void start(){
        System.out.println("Car Start with Key");
      }
}
class Scooter extends Vehicles{
    void start(){
      System.out.println("Scooter start with key");
    }
    public static void main(String[] args) {
        Car car = new Car();
        Scooter scooter=new Scooter();
        car.start();
        scooter.start();        
        
    }
}