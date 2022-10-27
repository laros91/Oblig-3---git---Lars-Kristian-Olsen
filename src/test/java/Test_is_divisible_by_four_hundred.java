import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_is_divisible_by_four_hundred {
    @ParameterizedTest
    @MethodSource("number")
    public void isDivisibleByFourHundred (boolean expected, int input) {
        assertEquals(expected, LeapYear.isDivisibleByFourHundred(input));
    }
    public static Stream number() {
        return Stream.of(
                Arguments.of(false, 500),
                Arguments.of(true, 800),
                Arguments.of(false, 900));
    }
}
