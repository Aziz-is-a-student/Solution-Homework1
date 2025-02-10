package Enemyes;

import java.util.List;

public class Enemies implements StoringEnemies {
    private List<Enemies> enemies;
    int experience;
    int damage;

    public Enemies(List<Enemies> enemies, int experience, int damage) {
        this.enemies = enemies;
        this.experience = experience;
        this.damage = damage;
    }

    @Override
    public List addEnemies(Enemies enemy) {
        enemies.add(enemy);
        return enemies ;
    }
}
