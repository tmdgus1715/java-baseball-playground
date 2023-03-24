package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GamePlayerTest {

    private final GamePlayer gamePlayer = new GamePlayer();

    @ParameterizedTest
    @CsvSource(value = {"123:true", "923:true", "023:false"}, delimiter = ':')
    @DisplayName("사용자가 입력한 숫자는 1~9일때 참을 반환")
    void validateNumberRange(String actual, boolean expected) {
        boolean result = gamePlayer.validateNumberRange(actual);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:false", "12:false", "123:true", "1234:false"}, delimiter = ':')
    @DisplayName("사용자가 입력한 숫자는 세자리가 아니면 거짓을 반환")
    void validateDigitRange(String actual, boolean expected) {
        boolean result = gamePlayer.validateNumberRange(actual);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"112:false", "123:true"}, delimiter = ':')
    @DisplayName("사용자가 입력한 세자리 숫자는 중복되면 거짓을 반환")
    void validateDuplicate(String actual, boolean expected) {
        boolean result = gamePlayer.validateDuplicate(actual);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName(("사용자가 입력한 세자리 숫자 문자열은 List로 저장되면 참을 반환"))
    void numberToList() {
        String actual = "123";
        List<Integer> result = gamePlayer.numberToList(actual);
        assertThat(result.toString()).isEqualTo("[1, 2, 3]");
    }
}