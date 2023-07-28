package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        Cat c = new Cat();
//
//        d.makeSound();
//        c.makeSound();
//
//        Animal a = new Dog();
//        Animal b = new Cat();
//
//        a.makeSound();
//        b.makeSound();

        Enemy weakEnemy = new WeakEnemy();
        Enemy strongEnemy = new StrongEnemy();

        weakEnemy.dialog();
        weakEnemy.showStats();

        System.out.println();

        strongEnemy.dialog();
        strongEnemy.showStats();



    }
}
