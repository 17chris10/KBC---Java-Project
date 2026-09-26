public class LifelineManager {

    private boolean fiftyFiftyUsed = false;
    private boolean audiencePollUsed = false;
    private boolean doubleDipUsed = false;

    //50-50 lifeline
    public boolean useFiftyFifty() {
        if (fiftyFiftyUsed) {
            return false;
        }

        fiftyFiftyUsed = true;
        return true;
    }

    //Audience Poll lifeline
    public boolean useAudiencePoll() {
        if (audiencePollUsed) {
            return false;
        }

        audiencePollUsed = true;
        return true;
    }

    //DoubleDip lifeline
    public boolean useDoubleDip() {
        if (doubleDipUsed) {
            return false;
        }

        doubleDipUsed = true;
        return true;
    }

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
