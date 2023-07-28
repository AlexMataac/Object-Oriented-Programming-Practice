package Challenge;

public class Athlete {

    String name;
    String skills;
    String role;

    void makeMeTalk() {
        System.out.println("Please Override Me.");
    }
    void showMyInformation() {
        System.out.println("I am " + name);
        System.out.println("My skills are " + skills);
        System.out.println("My role is to " + role);
    }
}
