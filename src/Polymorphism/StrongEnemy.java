package Polymorphism;

public class StrongEnemy extends Enemy{

    public StrongEnemy() {
        name = "Strong Enemy";
        hp = 100;
    }

    @Override
    void dialog() {
        System.out.println(name + " : I am Strong!");
    }
}
