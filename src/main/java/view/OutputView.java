package view;

import domain.GameResult;

public class OutputView {

    public void gameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }

    public void nothing() {
        System.out.println("낫싱");
    }

    public void result(GameResult gameResult) {
        int ball = gameResult.getBall();
        int strike = gameResult.getStrike();

        System.out.println(ball + "볼 " + strike + "스트라이크");
    }
}
