package domain;

public class BaseballGame {

    private final OpponentPlayer opponentPlayer;
    private final GameJudge gameJudge;

    private GameStatus gameStatus;

    public BaseballGame(OpponentPlayer opponentPlayer, GameJudge gameJudge) {
        this.opponentPlayer = opponentPlayer;
        this.gameJudge = gameJudge;
    }

    public void init() {
        gameStatus = GameStatus.START;
        gameJudge.init(opponentPlayer.baseballNumbersGenerator());
    }

    public boolean isEnd() {
        return gameStatus == GameStatus.END;
    }

    public GameResult start(GamePlayer gamePlayer) {
        GameResult gameResult = gameJudge.judge(gamePlayer.getBaseballNumbers());
        if (gameResult.isAnswer()) {
            gameStatus = GameStatus.END;
        }
        return gameResult;
    }
}