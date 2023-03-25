package controller;

import domain.BaseballGame;
import domain.GamePlayer;
import domain.GameResult;
import view.InputView;
import view.OutputView;
public class GameController {

    private final InputView inputView;
    private final OutputView outputView;
    private final BaseballGame baseballGame;

    public GameController(InputView inputView, OutputView outputView, BaseballGame baseballGame) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.baseballGame = baseballGame;
    }

    public void Init() {
        int initStatus = inputView.init();
        if(inputView.init() == 1) {
            baseballGame.init();
            baseballGameStart();
        }
    }

    private void baseballGameStart() {
        while (!baseballGame.isEnd()) {
            GamePlayer gamePlayer = inputView.guessNumber();
            GameResult gameResult = baseballGame.start(gamePlayer);
            result(gameResult);
        }
    }

    private void result(GameResult gameResult) {
        if (gameResult.isAnswer()) {
            outputView.gameOver();
        }
        if (gameResult.isNothing()) {
            outputView.nothing();
        }
        outputView.result(gameResult);
    }
}
