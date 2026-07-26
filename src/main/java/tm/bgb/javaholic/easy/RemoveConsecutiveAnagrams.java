package tm.bgb.javaholic.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveConsecutiveAnagrams {

    static void main() {
        System.out.println(removeAnagrams("abba", "baba", "bbaa", "cd", "cd"));
        System.out.println(removeAnagrams("a", "b", "c", "d", "e"));
        System.out.println(removeAnagrams("abba", "baba", "cd", "cd", "bbaa"));
    }

    // note: option 1
    // time complexity: O(n*mlogm)
    // space complexity: O(n*m)
    static List<String> removeAnagrams(String... words) {
        var result = new ArrayList<String>();
        var sortedStrToIdxMap = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            var sortedChars = words[i].toCharArray();
            Arrays.sort(sortedChars);
            var sortedStr = new String(sortedChars);

            if (!sortedStrToIdxMap.containsKey(sortedStr)) {
                result.add(words[i]);
                sortedStrToIdxMap.put(sortedStr, i);
                continue;
            }

            if (sortedStrToIdxMap.get(sortedStr) == i - 1) {
                sortedStrToIdxMap.put(sortedStr, i);
            } else {
                result.add(words[i]);
            }
        }
        return result;
    }
}
