package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchInsertPositionTest {

    private static Stream<Arguments> searchInsertTestDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("searchInsertTestDataProvider")
    void searchInsert(int[] nums, int target, int expected) {
        var actual = BinarySearchInsertPosition.searchInsert(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

}
