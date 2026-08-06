package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindMaxDiffBetweenIncreasingElementsTest {

    private static Stream<Arguments> maximumDifferenceTestDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 4}, 4),
                Arguments.of(new int[]{9, 4, 3, 2}, -1),
                Arguments.of(new int[]{1, 5, 2, 10}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("maximumDifferenceTestDataProvider")
    void maximumDifference(int[] nums, int expected) {
        var actual = FindMaxDiffBetweenIncreasingElements.maximumDifference(nums);

        assertThat(actual).isEqualTo(expected);
    }

}
