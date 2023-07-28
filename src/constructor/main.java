package constructor;

public class main {
    public static void main(String[] args) {
        Person siblings1 = new Person("Kuzz","Wagner",'M',23);
        Person siblings2 = new Person("Alex","Mataac",'M',25);
        Person siblings3 = new Person("Arianne","Go",'F',18);

        System.out.println();
        System.out.println("I am " +siblings3.firstName + " " + siblings3.lastName + ".");
        System.out.println("My gender is " + siblings3.sex);
        System.out.println("I am " + siblings3.age + " years old");
    }
}
