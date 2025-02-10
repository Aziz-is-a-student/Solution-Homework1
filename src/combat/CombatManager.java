package combat;


import Enemyes.Enemy;
import Player.Player;
import Enemyes.Enemies;

public class CombatManager implements fightEnemy {
    private Player player;
    private Enemies enemies;

    public CombatManager(Player player, Enemies enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    @Override
    public void fight(Enemy enemy) {


        System.out.println(player.getPlayerName() + " engages in combat with " + enemy.getClass().getSimpleName() + "!");


        player.setPlayerHealth(player.getPlayerHealth() - enemy.getDamage());
        player.setPlayerExperience(player.getPlayerExperience() + enemy.getExperience());

        System.out.println("After combat: Health = " + player.getPlayerHealth() + ", Experience = " + player.getPlayerExperience());


        enemies.removeEnemy(enemy);
    }
}
