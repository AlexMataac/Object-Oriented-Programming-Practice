package StudentObjectSimulation;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "Alex",
                "Mataac",
                1,
                "Computer Engineering",
                'B',
                97.50,
                99.00);

        Student student1 = new Student(
                "Kuzz",
                "Wagner",
                2,
                "Computer Engineering",
                'A',
                74.50,
                75.00);

        Student student2 = new Student(
                "Vince",
                "Uy",
                3,
                "Computer Engineering",
                'C',
                85.00,
                90.75);


        student.introduceSelf();
        student.evaluateGrade();

        student1.introduceSelf();
        student1.evaluateGrade();

        student2.introduceSelf();
        student2.evaluateGrade();

    }
}
