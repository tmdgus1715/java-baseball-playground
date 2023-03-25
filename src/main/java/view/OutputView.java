package view;

import domain.GameResult;

public class OutputView {

    public void gameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }

    public void result(GameResult gameResult) {
        int ball = gameResult.getBall();
        int strike = gameResult.getStrike();

        if(ball==0&&strike==0) {
            System.out.println("Nothing");
            return;
        }

        System.out.println(ball + "볼 " + strike + "스트라이크");
    }
}
