package domain;

public class GameResult {

    private int strike = 0;
    private int ball = 0;

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
