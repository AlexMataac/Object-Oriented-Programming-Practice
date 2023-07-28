package StudentObjectSimulation;

public class Student {

    /* Create a class Student that has the attributes:
    - firstName
    - lastName
    - year
    - course
    - section
    - midtermGrade
    - finalGrade*/

    /*Create a Constructor for the class.

    Create the following Object Methods:
    - introduceSelf()
        - Outputs the Full Name,Course,Year and Section of
        the Student
    - evaluateGrade()
        - Average the Midterm and Final Grade output their
        average and their standing if they are an honor,
        passed or failed.*/

    /* Grade Criteria:
    Above 100 : Invalid Grade
    98 - 100 : With Highest Honors
    95 - 97.99 : With High Honors
    90 - 94.99 : With Honors
    75 - 89.99 : Passed
    Below 75 : Failed*/


    String firstName;
    String lastName;
    int year;
    String course;
    char section;
    double midtermGrade;
    double finalGrade;

    public Student(String firstName,
                   String lastName,
                   int year,
                   String course,
                   char section,
                   double midtermGrade,
                   double finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void introduceSelf() {
        System.out.println("Name    : " + firstName + " " + lastName);
        System.out.println("Course  : " + course);
        System.out.println("Section : " + section);
        System.out.println("Year    : " + year);

        System.out.println();
    }
    void evaluateGrade() {
        double average = (midtermGrade + finalGrade) / 2;
        System.out.println("Name    : " + firstName + " " + lastName);
        System.out.println("Average : " + average);

        String remark = "";
        if (average >= 100) {
             remark = "Invalid Grade";
        } else if (average >= 98 && average <= 100) {
            remark = "With Highest Honors";
        } else if (average >= 95 && average <= 97.99) {
            remark = "With High Honors";
        } else if (average >= 90 &&  average <= 94.99 ) {
            remark = "With Honors";
        } else if (average >= 75 && average <= 89.99) {
            remark = "Passed";
        } else {
            remark = "Failed";
        }
        System.out.println("Remarks : " + remark);
        System.out.println();
    }
}

