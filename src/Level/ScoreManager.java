package Level;

public class ScoreManager {
    private int score;

    public ScoreManager() {
        this.score = 0;
    }

    public void addPoints(int points) {
        if (points > 0) {
            score += points;
        }
    }

    public void deductPoints(int points) {
        if (points > 0 && score >= points) {
            score -= points;
        }
    }

    public int getScore() {
        return score;
    }

    public void resetScore() {
        score = 0;
    }
}
