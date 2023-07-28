package StudentRegistrationSimulation;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Make the User Input the number of students to be
        registered.

          Make the User Input the credentials of the
          students.*/

    /*    Student
        - First Name
        - Last Name
        - Year
        - Course
        - Section*/

       /* PS: Use every knowledge you've learned so far, ex.
          Constructors and Encapsulation*/

       /* After the User inputs all of the Credentials make the
         program display all the information of each student.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many Students To Be Registered?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Student students[] = new Student[size];
//        students[0] = new Student("Alex",
//                "Mataac", 4,
//                "Computer Engineering",'A');
//        students[1] = new Student("Kuzz",
//                "Wagner", 4,
//                "Civil Engineering",'A');
//        students[2] = new Student("John",
//                "Doe", 3,
//                "Accountancy",'B');
//        students[3] = new Student("Adam",
//                "Silver", 2,
//                "IT",'C');
//        students[4] = new Student("Kobe",
//                "Bryant", 4,
//                "Tourism",'A');

        for (int i = 0; i < students.length; i++) {

            String firstName;
            String lastName;
            int year;
            String course;
            char section;

            System.out.println("Student # " + (i+1));

            System.out.print("First Name : ");
            firstName = scanner.nextLine();

            System.out.print("Last Name : ");
            lastName = scanner.nextLine();

            System.out.print("Year : ");
            year = scanner.nextInt();

            System.out.print("Course : ");
            course = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Section : ");
            section = scanner.nextLine().charAt(0);

            System.out.println();
            students[i] = new Student(firstName, lastName,
                    year, course, section);
        }
        for (Student std: students) {
            std.introduce();
        }
    }
}
