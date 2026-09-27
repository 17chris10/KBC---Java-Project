public class Game {

    private int currentQuestion = 1;
    private int score = 0;
    private int safeHaven = 0;
    private boolean gameOver = false;

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

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean answerQuestion(boolean isCorrect) {

        if (gameOver) {
            return false;
        }

        if (isCorrect) {

            score = getCurrentPrize();

            if (currentQuestion == 5 ||
                currentQuestion == 10 ||
                currentQuestion == 15) {

                safeHaven = score;
            }

            if (currentQuestion == 15) {
                gameOver = true;
                return true;
            }

            currentQuestion++;

            return true;

        } else {

            score = safeHaven;
            gameOver = true;

            return false;
        }
    }

    public boolean answerWithDoubleDip(
            boolean isCorrect,
            LifelineManager lifelines) {

        if (gameOver) {
            return false;
        }

        if (isCorrect) {

            if (lifelines.isDoubleDipActive()) {
                lifelines.useSecondChance();
            }

            return answerQuestion(true);
        }

        if (lifelines.isDoubleDipActive()) {

            lifelines.useSecondChance();

            return true;
        }

        return answerQuestion(false);
    }

    public int getTotalQuestions() {
    return prizeMoney.length;
}

public boolean isFinalQuestion() {
    return currentQuestion == prizeMoney.length;
}

public boolean hasReachedSafeHaven() {
    return currentQuestion == 5 ||
           currentQuestion == 10 ||
           currentQuestion == 15;
}
}
