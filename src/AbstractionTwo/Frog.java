package AbstractionTwo;

public class Frog implements Animal, WaterAnimal, LandAnimal{
    @Override
    public void makeSound() {
        System.out.println("Ribbit!");
    }

    @Override
    public void swim() {
        System.out.println("Swim!");
    }

    @Override
    public void walk() {
        System.out.println("Walking!");
    }
}
