package Challenge;

public class Main {
    public static void main(String[] args) {
        Athlete c = new Coach();
        Athlete p = new Player();

        c.makeMeTalk();
        c.showMyInformation();

        System.out.println();

        p.makeMeTalk();
        p.showMyInformation();
    }
}
