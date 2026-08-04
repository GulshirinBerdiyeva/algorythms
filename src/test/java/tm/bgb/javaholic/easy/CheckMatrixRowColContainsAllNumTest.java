package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CheckMatrixRowColContainsAllNumTest {

    private static Stream<Arguments> checkValidTestDataProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}, true),
                Arguments.of(new int[][]{{1, 1, 1}, {1, 2, 3}, {1, 2, 3}}, false),
                Arguments.of(new int[][]{{1, 2}, {2, 1}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("checkValidTestDataProvider")
    void checkValid(int[][] matrix, boolean expected) {
        var actual = CheckMatrixRowColContainsAllNum.checkValid(matrix);

        assertThat(actual).isEqualTo(expected);
    }
}