package Player;

import java.util.List;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    //private List<String> inventory;

    public Player(String playerName, int playerHealth, int playerExperience/* ,List<String> inventory*/) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerExperience = playerExperience;
        //this.inventory = inventory;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(int playerExperience) {
        this.playerExperience = playerExperience;
    }
}
