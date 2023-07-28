package StudentRegistrationSimulation;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private String course;
    private char section;

    public Student(String firstName, String lastName,
                   int year, String course, char section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    void introduce() {
        System.out.println("Full Name : " + getFirstName()
                + " " + getLastName());
        System.out.println("Course/Yr/Sec : " +
                getCourse() +  getYear() +
                getSection());
        System.out.println();
//        System.out.println("Year : " + getYear());
//        System.out.println("Course : " + getCourse());
//        System.out.println("Section : " + getSection());
//        System.out.println();
    }
}
