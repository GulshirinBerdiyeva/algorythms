package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static tm.bgb.javaholic.easy.MergeTwoSortedSingleLinkedList.ListNode;

class MergeTwoSortedSingleLinkedListTest {

    private static Stream<Arguments> mergeTwoListsTestDataProvider() {
        return Stream.of(
                Arguments.of(null, null, null),
                Arguments.of(null, new ListNode(), new ListNode()),
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4))),
                        new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("mergeTwoListsTestDataProvider")
    void mergeTwoLists(ListNode list1, ListNode list2, ListNode expected) {
        var actual = MergeTwoSortedSingleLinkedList.mergeTwoLists(list1, list2);

        assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(expected);
    }
}