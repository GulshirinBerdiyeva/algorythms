package tm.bgb.javaholic.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveConsecutiveAnagramsV2 {

    static void main() {
        System.out.println(removeAnagrams("abba", "baba", "bbaa", "cd", "cd"));
        System.out.println(removeAnagrams("a", "b", "c", "d", "e"));
        System.out.println(removeAnagrams("abba", "baba", "cd", "cd", "bbaa"));
    }

    // note: option 2 from solutions
    // time complexity: O(n*mlogm)
    // space complexity: O(n)
    static List<String> removeAnagrams(String... words) {
        var result = new ArrayList<String>();
        var prevSortedStr = "";
        for (var word : words) {
            var chars = word.toCharArray();
            Arrays.sort(chars);
            var currentSortedStr = new String(chars);

            if (!prevSortedStr.equals(currentSortedStr)) {
                result.add(word);
            }
            prevSortedStr = currentSortedStr;
        }
        return result;
    }
}
