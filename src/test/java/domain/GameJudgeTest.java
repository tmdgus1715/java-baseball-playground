package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameJudgeTest {

    GameJudge gameJudge = new GameJudge();

    @Test
    @DisplayName("사용자의 숫자와 컴퓨터의 숫자를 비교하여 올바른 strike와 ball의 갯수를 반환하면 참")
    void judge() {
        List<Integer> actual = List.of(1, 4, 3);
        gameJudge.init(List.of(1, 2, 3));

        GameResult gameResult = gameJudge.judge(actual);

        assertThat(gameResult.getBall()).isEqualTo(0);
        assertThat(gameResult.getStrike()).isEqualTo(2);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:0:1", "1:1:0", "2:1:1", "2:2:0", "0:0:0", "0:1:0"}, delimiter = ':')
    @DisplayName("사용자가 입력한 숫자를 컴퓨터의 숫자가 포함하고 위치도 같으면 참을 반환")
    void judgeStrike(int actualNumber, int actualIndex, int expected) {
        gameJudge.init(List.of(1, 2, 3));

        int result = gameJudge.judgeStrike(actualNumber, actualIndex);

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:1", "4:0"}, delimiter = ':')
    @DisplayName("사용자가 입력한 숫자를 컴퓨터의 숫자가 포함하고 있으면 참을 반환")
    void judgeBallAndStrike(int actual, int expected) {
        gameJudge.init(List.of(1, 2, 3));

        int result = gameJudge.judgeBallAndStrike(actual);

        assertThat(result).isEqualTo(expected);
    }
}
