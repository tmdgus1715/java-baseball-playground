package view;

import domain.GamePlayer;
import domain.GameStatus;
import exception.InvalidNumberRangeException;

import java.util.Scanner;

public class InputView {

    public static final String INIT_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String BASEBALL_NUMBER_INPUT_MESSAGE = "숫자를 입력해 주세요 : ";
    public static final String START = "1";

    private final Scanner scanner = new Scanner(System.in);

    public GameStatus init() {
        System.out.println(INIT_MESSAGE);

        String value = scanner.next();
        validateInputGameStatus(value);

        if (value.equals(START)) {
            return GameStatus.START;
        }
        return GameStatus.END;
    }

    public GamePlayer guessNumber() {
        System.out.println(BASEBALL_NUMBER_INPUT_MESSAGE);

        String value = scanner.next();

        return new GamePlayer(value);
    }

    public void validateInputGameStatus(String actual) {
        if (!actual.matches("[1-2]")) {
            throw new InvalidNumberRangeException();
        }
    }
}
