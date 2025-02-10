package Enemyes;

import java.util.List;

public class Enemies implements EnemyManager {
    private List<Enemy> enemies;


    public Enemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    @Override
    public List<Enemy> addEnemies(Enemy enemy) {
        enemies.add(enemy);
        return enemies ;

    }

    @Override
    public List<Enemy> removeEnemy(Enemy enemy) {
        enemies.remove(enemy);

        return enemies ;
    }

    @Override
    public List<Enemy> removeEnemies() {
        enemies.removeAll(enemies);
        return enemies ;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
