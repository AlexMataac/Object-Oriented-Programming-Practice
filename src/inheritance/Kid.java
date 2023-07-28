package inheritance;

public class Kid extends Toddler {

    int gradeLevel;

    public Kid(String name, String sex, int age, String favoriteGame, int gradeLevel) {
        super(name, sex, age, favoriteGame);
        this.gradeLevel = gradeLevel;
    }

    @Override
    void checkStatus() {
        super.checkStatus();
        System.out.println(name + " is" + " Grade" + " " + gradeLevel);
    }
    void sayGradeLevel() {
        System.out.println("I' am Grade " + gradeLevel);
    }
}
