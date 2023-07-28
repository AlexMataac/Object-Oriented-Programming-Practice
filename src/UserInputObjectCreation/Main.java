package UserInputObjectCreation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Create a class of your choice then create an object from that class using user input.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Name of the Product  : ");
        String name = scanner.nextLine();

        System.out.print("Enter the Price of the Product : ");
        float price = scanner.nextFloat();


        Product product = new Product(name, price);
    }


}
