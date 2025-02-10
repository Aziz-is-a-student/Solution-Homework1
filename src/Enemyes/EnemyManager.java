package Enemyes;

import java.util.List;

public interface EnemyManager {
        List <Enemy> addEnemies(Enemy enemy);
        List<Enemy> removeEnemy(Enemy enemy);
        List<Enemy> removeEnemies();
}
