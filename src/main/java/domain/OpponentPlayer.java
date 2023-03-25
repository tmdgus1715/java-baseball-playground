package domain;

import java.util.ArrayList;
import java.util.List;

public class OpponentPlayer {

    public static final int BASEBALL_NUMBERS_LENGTH = 3;

    public OpponentPlayer() {
    }

    public List<Integer> baseballNumbersGenerator() {
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
}
