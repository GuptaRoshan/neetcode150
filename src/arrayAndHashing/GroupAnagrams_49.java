package arrayAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {

    /**
     * sort each string and use it as a key in a map to group anagrams
     *
     * @param strs an array of strings
     * @return a list of lists of strings
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            //char[] wordChar = word.toCharArray();
            //Arrays.sort(wordChar);   // This will take O(nlogn) time complexity
            //String key = new String(wordChar);
            char[] charCount = new char[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
            // This will be sorted string and use this as a key
            String key = new String(charCount);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eaat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

}
