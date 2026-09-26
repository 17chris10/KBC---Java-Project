
public class Game {

    private int currentQuestion = 1;
    private int score = 0;
    private int safeHaven = 0;

    private final int[] prizeMoney = {
        1000,
        2000,
        3000,
        5000,
        10000,
        20000,
        40000,
        80000,
        160000,
        320000,
        640000,
        1250000,
        2500000,
        5000000,
        10000000
    };
    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public int getScore() {
        return score;
    }

    public int getSafeHaven() {
        return safeHaven;
    }

    public int getCurrentPrize() {
        return prizeMoney[currentQuestion - 1];
    }
}
