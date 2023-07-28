package inheritance;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alex","Male",18);
        Toddler toddler = new Toddler("Kuzz","Male",1,"Peek-A-Boo");
        Kid k = new Kid("John","Male",7,"Call Of Duty",1);

//        p.name = "Alex";
//        p.sex = "Male";
//        p.age = 18;
//
//        toddler.name = "Kuzz";
//        toddler.sex = "Male";
//        toddler.age = 23;


//        p.checkStatus();
        toddler.checkStatus();
        k.checkStatus();



        toddler.drink();
        k.sayGradeLevel();

    }
}
