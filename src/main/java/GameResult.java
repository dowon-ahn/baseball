public class GameResult {
    private boolean sovled;
    private int strikes;
    private int balls;

    public GameResult(boolean sovled, int strikes, int balls) {
        this.sovled = sovled;
        this.strikes = strikes;
        this.balls = balls;
    }

    public boolean isSovled() {
        return sovled;
    }

    public void setSovled(boolean sovled) {
        this.sovled = sovled;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

}
