package domain;

import java.util.List;

public class OpponentPlayer {

    private final List<Integer> baseballNumbers;

    public OpponentPlayer(List<Integer> numbers) {
        this.baseballNumbers = numbers;
    }


    public boolean isStrike(int actual, int index) {
        return baseballNumbers.get(index) == actual;
    }

    public boolean isBall(int actual) {
        return baseballNumbers.contains(actual);
    }
}
