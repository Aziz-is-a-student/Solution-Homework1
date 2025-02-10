package combat;


import Enemyes.Enemy;
import Player.Player;
import Enemyes.Enemies;

public class CombatManager implements fightEnemy {
    private Enemy enemy;
    private Player player;
    private  Enemies enemies;

    public CombatManager( Player player, Enemies enemies) {
        this.enemy = enemy;
        this.player = player;

    }

    @Override
    public void fight(Enemy enemy) {
        System.out.println(player.getPlayerName() + " engages in combat with " + enemy + "!");
        // Combat simulation: update health and experience based on enemy type
        player.setPlayerHealth(player.getPlayerHealth()-enemy.getDamage());
        player.setPlayerExperience(player.getPlayerExperience()+enemy.getExperience());
        System.out.println("After combat: Health = " + player.getPlayerHealth() + ", Experience = " + player.getPlayerExperience());
        enemies.removeEnemy(enemy);
    }
}
