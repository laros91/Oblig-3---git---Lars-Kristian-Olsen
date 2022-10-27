import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Is_divisible_by_one_hundred {
    @ParameterizedTest
    @MethodSource ("number")
    public void isDivisibleByOneHundred (boolean expected, int input) {
        assertEquals(expected, LeapYear.isDivisibleByOneHundred(input));
    }
    public static Stream number() {
        return Stream.of(
                Arguments.of(false, 150),
                Arguments.of(true, 200),
                Arguments.of(false, 504),
                Arguments.of(true, 64000));
    }
}
