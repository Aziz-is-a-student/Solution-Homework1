package combat;

public class CombatManager implements fightEnemy {
    Ene
    @Override
    public void fight(String enemy) {
        System.out.println(playerName + " engages in combat with " + enemy + "!");
        // Combat simulation: update health and experience based on enemy type
        if (enemy.equals("Skeleton")) {
            playerHealth -= 10;
            playerExperience += 20;
        } else if (enemy.equals("Zombie")) {
            playerHealth -= 15;
            playerExperience += 30;
        } else if (enemy.equals("Vampire")) {
            playerHealth -= 25;
            playerExperience += 50;
        }
        System.out.println("After combat: Health = " + playerHealth + ", Experience = " + playerExperience);
        enemies.remove(enemy);
    }
}
