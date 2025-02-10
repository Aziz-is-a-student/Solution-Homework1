package Enemyes;

public class Enemy {
    private int experience;
    private int damage;

    public Enemy(int experience, int damage) {
        this.experience = experience;
        this.damage = damage;
    }

    public int getExperience() {
        return experience;
    }

    public int getDamage() {
        return damage;
    }
}
