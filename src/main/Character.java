package main;

public class Character {

    String name, dialog, lyrics;
    int hp, mp, lvl;

    public Character(String name, String dialog, String lyrics, int hp, int mp, int lvl) {
        this.name = name;
        this.dialog = dialog;
        this.lyrics = lyrics;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;
    }

    void introduce() {
        System.out.println("I am " + name);
    }
    void sayDialog() {
        System.out.println(name + " : " + dialog);
    }
    void sing() {
        System.out.println(name + " : " + dialog + lyrics);
    }
}
