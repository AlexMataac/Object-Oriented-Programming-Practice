package Challenge;

public class Player extends Athlete {

    String position;
    public Player() {
        name = "Kobe Bryant";
        skills = "shooter, slasher, attacker, leadership";
        role = "help my team to win every games and win a " +
                "championship";
        position = "Shooting Guard";
    }

    public Player(String position) {
        this.position = position;
    }

    void makeMeTalk() {
        System.out.println(name + " : One of the Greatest Player of all Time");
    }

    @Override
    void showMyInformation() {
        super.showMyInformation();
        System.out.println("I am " + name + " at the " + position);
    }

}
