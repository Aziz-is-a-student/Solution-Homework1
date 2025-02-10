package Level;

import Enemyes.Enemies;
import Enemyes.Enemy;
import Enemyes.EnemyManager;
import Enemyes.Vampire;
import Player.Player;
import items.*;
import Enemyes.*;


public class LevelManager implements  initLevel {
    private int level;
    private Enemies enemies;
    private ItemManager itemManager;
    private Player player;
    private ScoreManager scoreManager;


    public LevelManager(Player player, Enemies enemies, ItemManager itemManager,ScoreManager scoreManager) {
        this.level = 1; // Начальный уровень
        this.player = player;
        this.enemies = enemies;
        this.itemManager = itemManager;
        this.scoreManager = scoreManager;


    }

    @Override
    public void advanceLevel() {
        System.out.println("Advancing to next level...");
        level++;
        player.setPlayerHealth(100);

        enemies.removeEnemies();
        itemManager.clear();

        if (level == 2) {
            enemies.addEnemies(new Skeleton(20, 10));
            itemManager.addItem(new GoldCoin(5));
        } else if (level == 3) {
            enemies.addEnemies(new Vampire(50, 25));
            enemies.addEnemies(new Zombie(30, 15));
            itemManager.addItem(new MagicScroll(15));
            itemManager.addItem(new HealthElexir(20));
        }

        scoreManager.addPoints(100 * level);
        System.out.println("Reached level " + level);
        System.out.println("Current Score: " + scoreManager.getScore());
    }
}
