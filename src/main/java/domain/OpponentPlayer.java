package domain;

import java.util.ArrayList;
import java.util.List;

public class OpponentPlayer {

    public static final int BASEBALL_NUMBERS_LENGTH = 3;

    private final List<Integer> baseballNumbers;

    public OpponentPlayer(List<Integer> numbers) {
        this.baseballNumbers = numbers;
    }

    public OpponentPlayer() {
        this.baseballNumbers = baseBallNumbersGenerator();
    }

    public List<Integer> baseBallNumbersGenerator() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < BASEBALL_NUMBERS_LENGTH) {
            int num = (int) (Math.random() * 10);
            addNumber(num, numbers);
        }
        return numbers;
    }

    private void addNumber(int num, List<Integer> numbers) {
        if(!numbers.contains(num)) numbers.add(num);
    }

    public boolean isStrike(int actual, int index) {
        return baseballNumbers.get(index) == actual;
    }

    public boolean isBall(int actual) {
        return baseballNumbers.contains(actual);
    }
}
