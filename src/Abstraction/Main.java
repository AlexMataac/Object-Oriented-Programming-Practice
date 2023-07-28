package Abstraction;

public class Main {
    public static void main(String[] args) {

        //Abstract Idea
//        Animal a = new Animal();

        //Concrete Idea
        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();

        d.setName("Puppy");

        System.out.println();
        d.showName();

        c.setName("Pussy");
        c.showName();
    }
}
