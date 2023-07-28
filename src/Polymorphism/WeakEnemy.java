package Polymorphism;

public class WeakEnemy extends Enemy {

    public WeakEnemy() {
        name = "Weak Enemy";
        hp = 25;
    }

    @Override
    void dialog() {
        System.out.println(name + " : I am Weak!");
    }
}
