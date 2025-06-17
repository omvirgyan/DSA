package Hiracrical;

// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Dog-specific method

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Cat-specific method
    }
}
