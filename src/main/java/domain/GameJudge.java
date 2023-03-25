package domain;

import java.util.List;

public class GameJudge {

    public static final int BASEBALL_NUMBERS_LENGTH = 3;
    public static final int PRIMITIVE_INIT_VALUE = 0;
    public static final int FALSE_VALUE = 0;
    public static final int TRUE_VALUE = 1;

    private List<Integer> opponentPlayerNumbers;

    public GameJudge() {
    }

    public void init(List<Integer> opponentPlayerNumbers) {
        this.opponentPlayerNumbers = opponentPlayerNumbers;
    }

    public GameResult judge(List<Integer> actual) {
        int ballAndStrike = PRIMITIVE_INIT_VALUE;
        int strike = PRIMITIVE_INIT_VALUE;
        
        for (int i = PRIMITIVE_INIT_VALUE; i < BASEBALL_NUMBERS_LENGTH; ++i) {
            ballAndStrike += judgeBallAndStrike(actual.get(i));
            strike += judgeStrike(actual.get(i), i);
        }
        int ball = ballAndStrike - strike;

        return new GameResult(strike, ball);
    }

    public int judgeBallAndStrike(int actual) {
        if (opponentPlayerNumbers.contains(actual)) {
            return TRUE_VALUE;
        }
        return FALSE_VALUE;
    }

    public int judgeStrike(int actual, int index) {
        if (opponentPlayerNumbers.get(index) == actual) {
            return TRUE_VALUE;
        }
        return FALSE_VALUE;
    }
}
