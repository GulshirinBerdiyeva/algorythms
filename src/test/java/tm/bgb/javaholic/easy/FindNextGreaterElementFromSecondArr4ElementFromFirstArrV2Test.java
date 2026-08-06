package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindNextGreaterElementFromSecondArr4ElementFromFirstArrV2Test {

    private static Stream<Arguments> nextGreaterElementTestDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}),
                Arguments.of(new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 1, 7}, new int[]{7, 7, 7, 7})
        );
    }

    @ParameterizedTest
    @MethodSource("nextGreaterElementTestDataProvider")
    void nextGreaterElement(int[] nums1, int[] nums2, int[] expected) {
        var actual = FindNextGreaterElementFromSecondArr4ElementFromFirstArrV2.nextGreaterElement(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }
}
