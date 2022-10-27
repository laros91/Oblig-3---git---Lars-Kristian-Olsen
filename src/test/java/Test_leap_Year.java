
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test_leap_Year {

    @ParameterizedTest
    @MethodSource ("number")
    public void is_Leap_year( boolean expected, int input){

        assertEquals(expected, LeapYear.isLeapYear(input));
    }

    public static Stream number() {
        return Stream.of(
        Arguments.of(false, 1900),
        Arguments.of(true, 2000),
        Arguments.of(false, 2021),
        Arguments.of(true, 2024),
        Arguments.of(true, 2404));
    }

}
