package AbstractionTwo;

public class Bird implements Animal, AirAnimal, LandAnimal{
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Flying!");
    }

    @Override
    public void walk() {
        System.out.println("Walking!");
    }
}
