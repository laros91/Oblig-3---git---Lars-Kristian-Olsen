import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_is_divisible_by_four {
    @ParameterizedTest
    @MethodSource("number")
    public void is_Divisible_By_four (boolean expected, int input) {
        assertEquals(expected, LeapYear.isDivisibleByFour(input));
    }
    public static Stream number() {
        return Stream.of(
                Arguments.of(false, 18),
                Arguments.of(true, 16),
                Arguments.of(false, 22),
                Arguments.of(true, 444));
    }
}
