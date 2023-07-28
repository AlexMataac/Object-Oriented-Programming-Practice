package inheritance;

public class Toddler extends Person{

    String favoriteGame;
    public Toddler(String name, String sex, int age, String favoriteGame) {
        super(name, sex, age);
        this.favoriteGame = favoriteGame;

    }
    void drink() {
        System.out.println(name + " is" + " Drinking Milk");
    }

    @Override
    void checkStatus() {
        super.checkStatus();
        System.out.println("Favorite Game: " + favoriteGame);
    }
}
