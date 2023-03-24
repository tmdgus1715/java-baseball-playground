package domain;

import java.util.List;

public class GameJudge {

    public static final int BASEBALL_NUMBERS_LENGTH = 3;
    private final OpponentPlayer opponentPlayer;
    private final GameResult gameResult = new GameResult();

    public GameJudge(OpponentPlayer opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    public void judge(List<Integer> actual) {
        for (int i = 0; i < BASEBALL_NUMBERS_LENGTH; ++i) {
            judgeBall(actual.get(i));
            judgeStrike(actual.get(i), i);
        }
    }

    public void judgeBall(int actual) {
        if (opponentPlayer.isBall(actual)) {
            gameResult.addBall();
        }
    }

    public void judgeStrike(int actual, int index) {
        if (opponentPlayer.isStrike(actual, index)) {
            gameResult.reduceBall();
            gameResult.addStrike();
        }
    }

    public GameResult getGameResult() {
        return gameResult;
    }

}
