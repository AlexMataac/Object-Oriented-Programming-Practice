package ArrayOfObjects;

public class Employee {

    String firstName;
    String lastName;
    String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    void introduceSelf() {
        System.out.println("Full Name : " + firstName + " " + lastName);
        System.out.println("Job Title : " + jobTitle);
        System.out.println();
    }
}
