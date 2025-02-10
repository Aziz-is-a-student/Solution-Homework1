package Level;

import Enemyes.Enemies;
import Enemyes.Enemy;
import Enemyes.EnemyManager;
import Enemyes.Vampire;
import Player.Player;
import items.GoldCoin;
import items.HealthElexir;
import items.Item;
import items.ItemManager;
import Enemyes.*;

public class LevelManager implements  initLevel {
    private int level;
    private Enemies enemies;
    private ItemManager itemManager;
    private Player player;
    private Enemy enemy;

    public LevelManager(Player player, Enemies enemies, ItemManager itemManager,Enemy enemy) {
        this.level = 1; // Начальный уровень
        this.player = player;
        this.enemies = enemies;
        this.itemManager = itemManager;
        this.enemy = enemy

    }

    @Override
    public void advanceLevel() {
        System.out.println("Advancing to next level...");
        level++;
        player.setPlayerHealth(100); // Reset health at the beginning of a new level

        // Clear previous enemies and items, then add new ones for the new level.
        enemies.removeEnemies();
        itemManager.clear();
        //items.;
        if (level == 2) {
            enemies.addEnemies(new Enemy(21,14));
            itemManager.addItem(new GoldCoin(21));
        } else if (level == 3) {
            enemies.addEnemies(new Enemy(25,19));
            enemies.addEnemies(new Zombie(21,22));
            itemManager.addItem(new GoldCoin(21));
            itemManager.addItem(new HealthElexir(21));
            }
        System.out.println("Reached level " + level);
    }
}
