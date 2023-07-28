package arrayLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Primitive Datatype*/
//        int x;
//        float z;
//        char a;
//        double db;
//        boolean y;
//
/*         NON-Primitive*/
//        String name;
////        class
//
/*        (Wrapper Class)*/
//        Integer i;
//        Float f;
//        Double d;
//        Character c;
//        Boolean bl;
//        Byte b;

        ArrayList<String> names = new ArrayList<>();
        names.add("Kuzz");
        names.add("John");
        names.add("Vince");

       /*  Option 2*/
//        String name = names.get(1);
//        System.out.println(name);

       /*  Option 1*/
//        System.out.println(names.get(0));

//        System.out.println(names.get(0));
//        names.set(0, "Alex");
//        System.out.println(names.get(0));

//        names.remove(0);
//        names.remove(0);
//        names.clear();
//        System.out.println(names.get(0));

//        names.clear();
//        names.remove(0);
//        System.out.println(names.size());

        /*Iterating ArrayList*/
        for (String name: names) {
            System.out.println(name);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();

//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(5);
//        num.add(3);
//        num.add(10);
//        num.add(11);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kuzz","BSIT"));
        students.add(new Student("John","BSIT"));
        students.add(new Student("Vince","BSIT"));

        /*Iterating ArrayList*/
        for (Student stn: students) {
            stn.introduce();
            System.out.println();
        }
        for (int i = 0; i < students.size(); i++) {
           students.get(i).introduce();
           System.out.println();
        }

//        students.set(0, new Student("Alex","Computer Engineering"));
//        students.get(0).introduce();

//        students.remove(0);
//        students.remove(0);
//        students.clear();
//        students.get(0).introduce();
//        Student s = students.get(2);
//        s.introduce();
    }
}
