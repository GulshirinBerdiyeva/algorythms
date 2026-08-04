package tm.bgb.javaholic.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveConsecutiveAnagramsTest {

    private static Stream<Arguments> removeAnagramsTestDataProvider() {
        return Stream.of(
                Arguments.of(new String[]{"abba", "baba", "bbaa", "cd", "cd"}, List.of("abba", "cd")),
                Arguments.of(new String[]{"a", "b", "c", "d", "e"}, List.of("a", "b", "c", "d", "e")),
                Arguments.of(new String[]{"abba", "baba", "cd", "cd", "bbaa"}, List.of("abba", "cd", "bbaa"))
        );
    }

    @ParameterizedTest
    @MethodSource("removeAnagramsTestDataProvider")
    void removeAnagrams(String[] words, List<String> expected) {
        List<String> actual = RemoveConsecutiveAnagrams.removeAnagrams(words);

        assertThat(actual).isEqualTo(expected);
    }
}