package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindMaxCountBetweenPosAndNegIntegersTest {

    private static Stream<Arguments> maximumCountTestDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{-3, -2, -1, 0, 0, 1, 2}, 3),
                Arguments.of(new int[]{-2, -1, -1, 1, 2, 3}, 3),
                Arguments.of(new int[]{1, 2, 3, 42}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("maximumCountTestDataProvider")
    void maximumCount(int[] nums, int expected) {
        var actual = FindMaxCountBetweenPosAndNegIntegers.maximumCount(nums);

        assertThat(actual).isEqualTo(expected);
    }

}
