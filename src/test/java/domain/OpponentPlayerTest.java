package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OpponentPlayerTest {

    @Test
    @DisplayName("랜덤수가 세자리 수이면 참을 반환")
    void validateDigitRange() {
        OpponentPlayer opponentPlayer = new OpponentPlayer();
        int actual = opponentPlayer.baseBallNumbersGenerator().size();
        assertThat(actual).isEqualTo(3);
    }
}