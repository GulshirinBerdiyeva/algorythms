package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static tm.bgb.javaholic.easy.FindMaxDepthOfBinaryTreeBFS.TreeNode;

class FindMaxDepthOfBinaryTreeBFSTest {

    private static Stream<Arguments> maxDepthTestDataProvider() {
        return Stream.of(
                Arguments.of(null, 0),
                Arguments.of(new TreeNode(42), 1),
                Arguments.of(new TreeNode(1, null, new TreeNode(2)), 2),
                Arguments.of(
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode(20, new TreeNode(15), new TreeNode(7))
                        ), 3)
        );
    }

    @ParameterizedTest
    @MethodSource("maxDepthTestDataProvider")
    void maxDepth(TreeNode root, int expected) {
        var actual = FindMaxDepthOfBinaryTreeBFS.maxDepth(root);

        assertThat(actual).isEqualTo(expected);
    }
}