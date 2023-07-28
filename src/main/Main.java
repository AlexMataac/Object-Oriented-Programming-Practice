package main;

import mathematics.Arithmetic;
import mathematics.Constant;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Kuzz","Wagner","Programmer","Earth","Male",19);
        Employee emp = new Employee("Dominic","Go","Programmer");
        Employee emp1 = new Employee();

        System.out.println(employee.getFirstName());
        System.out.println(emp1.getAge());

//        User u = new User(1234,"Alex","Kuzz","Wagner");
//        u.setUserID(43242);
//        u.getUserID();

//        Character c = new Character("Alex", "Hello", " Madlang People mabuhay,  Mini miss u",100,50,5);
//        c.sing();

//        Product p1 = new Product("Milk",150.00f);
//        Product p2 = new Product("Softdrinks",18.00f);
//        Product p3 = new Product("Noodles",12.00f);


//        Arithmetic a = new Arithmetic();
//        Constant c = new Constant();

//        int sum = a.add(5,2);
//        System.out.println(sum);
//        int substract = a.substract(10,5);
//        System.out.println(substract);
//        int multiply = a.multiply(5,5);
//        System.out.println(multiply);
//        int divide = a.divide(20,5);
//        System.out.println(divide);

//        int sum = Arithmetic.add(5,2);
//        System.out.println(sum);
//
//
////        c.pi = 500;
//        System.out.println(Constant.pi);
    }

}