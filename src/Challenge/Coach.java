package Challenge;

public class Coach extends Athlete {

    public Coach() {
        name = "Tim Cone";
        skills = "Coaching";
        role = "give instructions to the player.";
    }

    void makeMeTalk() {
        System.out.println(name + " : The Winningest Coach of the Pba");
    }

}
