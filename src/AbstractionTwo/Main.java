package AbstractionTwo;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Bird b = new Bird();
        Frog f = new Frog();

        b.makeSound();
        d.makeSound();
        f.makeSound();

        System.out.println();

        d.walk();

        b.fly();
        b.walk();

        f.swim();
    }
}
