package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static tm.bgb.javaholic.easy.IterativelyReverseSingleLinkedList.ListNode;

class IterativelyReverseSingleLinkedListTest {

    private static Stream<Arguments> reverseListTestDataProvider() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(
                        new ListNode(1, new ListNode(2)),
                        new ListNode(2, new ListNode(1))
                ),
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("reverseListTestDataProvider")
    void reverseList(ListNode head, ListNode expected) {
        var actual = IterativelyReverseSingleLinkedList.reverseList(head);

        assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }

}
