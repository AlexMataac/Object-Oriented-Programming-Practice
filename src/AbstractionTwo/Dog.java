package AbstractionTwo;

public class Dog implements Animal, LandAnimal{
    @Override
    public void makeSound() {
        System.out.println("Arf!");
    }

    @Override
    public void walk() {
        System.out.println("Walking!");
    }
}
