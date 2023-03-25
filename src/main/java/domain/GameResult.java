package domain;

public class GameResult {

    public static final int NOTHING_VALUE = 0;
    public static final int ANSWER_VALUE = 3;

    private int strike = 0;
    private int ball = 0;

    public GameResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isNothing() {
        return strike == NOTHING_VALUE && ball == NOTHING_VALUE;
    }

    public boolean isAnswer() {
        return strike == ANSWER_VALUE;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void addBall() {
        ++ball;
    }

    public void reduceBall() {
        --ball;
    }

    public void addStrike() {
        ++strike;
    }
}
