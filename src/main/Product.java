package main;

public class Product {


    String name;
    float price;
    public Product(String name, float price) {
        this.name = name;
        this.price = price;

        System.out.println(name + " Created");
        System.out.println("PHP " + price);
    }
}
