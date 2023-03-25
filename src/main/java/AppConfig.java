import controller.GameController;
import domain.BaseballGame;
import domain.GameJudge;
import domain.GameResult;
import domain.OpponentPlayer;
import view.InputView;
import view.OutputView;

public class AppConfig {

    public GameController gameController() {
        return new GameController(inputView(), outputView(), baseballGame());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    public BaseballGame baseballGame() {
        OpponentPlayer opponentPlayer = opponentPlayer();
        return new BaseballGame(opponentPlayer, gameJudge());
    }

    private OpponentPlayer opponentPlayer() {
        return new OpponentPlayer();
    }

    private GameJudge gameJudge() {
        return new GameJudge();
    }
}
