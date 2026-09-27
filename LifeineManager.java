public class LifelineManager {

    private boolean fiftyFiftyUsed = false;
    private boolean audiencePollUsed = false;
    private boolean doubleDipUsed = false;

    private boolean doubleDipActive = false;

    // 50-50
    public int[] useFiftyFifty(int correctAnswer, int totalOptions) {

        if (fiftyFiftyUsed) {
            return new int[0];
        }

        fiftyFiftyUsed = true;

        int wrongOption = (correctAnswer + 1) % totalOptions;

        return new int[] {correctAnswer, wrongOption};
    }

    // Audience Poll
    public int[] useAudiencePoll(int correctAnswer, int totalOptions) {

        if (audiencePollUsed) {
            return new int[0];
        }

        audiencePollUsed = true;

        int[] percentages = new int[totalOptions];

        // Correct answer gets 60%
        percentages[correctAnswer] = 60;

        int remaining = 40;
        int wrongOptions = totalOptions - 1;

        int wrongPercentage = remaining / wrongOptions;
        int leftover = remaining % wrongOptions;

        for (int i = 0; i < totalOptions; i++) {
            if (i != correctAnswer) {
                percentages[i] = wrongPercentage;

                if (leftover > 0) {
                    percentages[i]++;
                    leftover--;
                }
            }
        }

        return percentages;
    }

    // Double Dip
    public boolean useDoubleDip() {

        if (doubleDipUsed) {
            return false;
        }
        doubleDipUsed = true;
        doubleDipActive = true;

        return true;
    }

    public boolean isDoubleDipActive() {
        return doubleDipActive;
    }

    public void useSecondChance() {
        doubleDipActive = false;
    }

    // Lifeline Status
    public boolean isFiftyFiftyUsed() {
        return fiftyFiftyUsed;
    }

    public boolean isAudiencePollUsed() {
        return audiencePollUsed;
    }

    public boolean isDoubleDipUsed() {
        return doubleDipUsed;
    }
}
