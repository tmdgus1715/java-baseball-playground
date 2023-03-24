package domain;

import exception.DuplicateNumberException;
import exception.InvalidNumberRangeException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GamePlayer {

    public static final String VALID_NUMBERS_RANGE = "[1-9]{3}";
    public static final int VALID_NUMBERS_LENGTH = 3;
    private final List<Integer> baseballNumbers;

    public GamePlayer() {
        baseballNumbers = null;
    }

    public GamePlayer(String numbers) {
        if (validateNumberRange(numbers)) throw new InvalidNumberRangeException();
        if (validateDuplicate(numbers)) throw new DuplicateNumberException();
        baseballNumbers = numberToList(numbers);
    }

    public boolean validateNumberRange(String numbers) {
        return numbers.matches(VALID_NUMBERS_RANGE);
    }

    public boolean validateDuplicate(String numbers) {
        long validCount = numbers.chars().distinct().count();
        return (validCount == VALID_NUMBERS_LENGTH);
    }

    public List<Integer> numberToList(String number) {
        int[] intNumber = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        List result = new ArrayList();
        for (int element : intNumber) {
            result.add(element);
        }
        return result;
    }
}
