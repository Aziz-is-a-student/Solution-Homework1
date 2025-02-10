
import Player.Player;
import Enemyes.Enemy;
import Enemyes.Enemies;
import items.Item;
import items.ItemManager;
import Level.LevelManager;
import Level.ScoreManager;
import combat.CombatManager;

import java.util.List;

public class MainGame {
    private Player player;
    private Enemies enemies;
    private ItemManager itemManager;
    private LevelManager levelManager;
    private CombatManager combatManager;
    private ScoreManager scoreManager;
    private int level;

    public MainGame(Player player, Enemies enemies, ItemManager itemManager, LevelManager levelManager, ScoreManager scoreManager, CombatManager combatManager) {
        this.player = player;
        this.enemies = enemies;
        this.itemManager = itemManager;
        this.levelManager = levelManager;
        this.scoreManager = scoreManager;
        this.combatManager = combatManager;
        this.level = 1;
    }

    public void playGame() {
        while (level <= 3 && player.getPlayerHealth() > 0) {
            System.out.println("=== Level " + level + " ===");


            while (!enemies.getEnemies().isEmpty() && player.getPlayerHealth() > 0) {
                combatManager.fight(enemies.getEnemies().get(0));
            }


            while (!itemManager.isEmpty() && player.getPlayerHealth() > 0) {
                itemManager.pickUpItem(itemManager.display(0));
            }


            if (player.getPlayerHealth() > 0 && level < 3) {
                levelManager.advanceLevel();
                level++;
            }
        }


        if (player.getPlayerHealth() <= 0) {
            System.out.println(player.getPlayerName() + " has perished. Game Over.");
        } else {
            System.out.println("Congratulations, " + player.getPlayerName() + "! You completed the adventure with "
                    + player.getPlayerExperience() + " experience points!");
        }
    }


    public static void main(String[] args) {
        // Создаем игрока и другие необходимые объекты
        Player player = new Player("Hero", 100, 0, new items.Inventory(new java.util.ArrayList<>()));
        Enemies enemies = new Enemies(new java.util.ArrayList<>());
        ItemManager itemManager = new ItemManager(player, null, new items.Items(new java.util.ArrayList<>()), new items.Inventory(new java.util.ArrayList<>()));
        ScoreManager scoreManager = new ScoreManager();
        LevelManager levelManager = new LevelManager(player, enemies, itemManager, scoreManager);
        CombatManager combatManager = new CombatManager(null, player, enemies);

        // Запускаем игру
        MainGame game = new MainGame(player, enemies, itemManager, levelManager, scoreManager, combatManager);
        game.playGame();
    }
}
