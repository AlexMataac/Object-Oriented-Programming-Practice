package exercise;

public class Main {
    public static void main(String[] args) {
        Animal pet = new Animal();
        pet.type = "Dog";
        pet.name = "Puppy";
        pet.movement = "walk";
        pet.feet = 4;
        pet.sounds = "arf arf";

        Animal animal = new Animal();
        animal.type = "Fish";
        animal.name = "memo";
        animal.movement = "swim";
        animal.feet = 0;
        animal.sounds = "bloo bloo";

        System.out.println("My pet is a " + pet.type);
        System.out.println("It's name is " + pet.name);
        System.out.println("It can " + pet.movement + " fast.");
        System.out.println("It has " + pet.feet + " feet");
        System.out.println("It sounds like " + pet.sounds);

        System.out.println();

        System.out.println("My lola have a " + animal.type);
        System.out.println("The name of fish is " + animal.name);
        System.out.println("It can " + animal.movement + " under the water.");
        System.out.println("It has " + animal.feet + " feet");
        System.out.println("It sounds like " + animal.sounds);
    }
}
