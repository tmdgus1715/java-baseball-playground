package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameJudgeTest {

    OpponentPlayer opponentPlayer = new OpponentPlayer(List.of(1, 2, 3));
    GameJudge gameJudge = new GameJudge(opponentPlayer);

    @Test
    @DisplayName("사용자의 숫자와 컴퓨터의 숫자를 비교하여 올바른 strike와 ball의 갯수를 반환하면 참")
    void judge() {
        List<Integer> actual = List.of(1, 4, 3);

        gameJudge.judge(actual);
        GameResult gameResult = gameJudge.getGameResult();

        assertThat(gameResult.getBall()).isEqualTo(0);
        assertThat(gameResult.getStrike()).isEqualTo(2);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:0:1", "1:1:0", "2:1:1", "2:2:0", "0:0:0", "0:1:0"}, delimiter = ':')
    @DisplayName("사용자가 입력한 숫자와 컴퓨터의 숫자가 위치와 수가 같아 Strike이면 참을 반환")
    void judgeStrike(int actualNumber, int actualIndex, int expected) {
        gameJudge.judgeStrike(actualNumber, actualIndex);
        GameResult gameResult = gameJudge.getGameResult();

        assertThat(gameResult.getStrike()).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:1", "4:0"}, delimiter = ':')
    @DisplayName("사용자가 입력한 숫자와 컴퓨터의 숫자가 위치는 다르지만 수가 같아  Ball이면 참을 반환")
    void judgeBall(int actual, int expected) {
        gameJudge.judgeBall(actual);
        GameResult gameResult = gameJudge.getGameResult();

        assertThat(gameResult.getBall()).isEqualTo(expected);
    }
}
