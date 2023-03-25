package view;

import domain.GamePlayer;

import java.util.Scanner;

public class InputView {

    public static final String INIT_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String BASEBALL_NUMBER_INPUT_MESSAGE = "숫자를 입력해 주세요 : ";
    private final Scanner scanner = new Scanner(System.in);

    public int init() {
        System.out.println(INIT_MESSAGE);
        int value = scanner.nextInt();
        return value;
    }

    public String guessNumber() {
        System.out.println(BASEBALL_NUMBER_INPUT_MESSAGE);
        String value = scanner.next();
        return value;
    }
}
