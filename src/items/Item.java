package items;

public class Item {
    private int experience;
    private int healling;

    public Item(int experience, int healling) {
        this.experience = experience;
        this.healling = healling;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealling() {
        return healling;
    }
}
