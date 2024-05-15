package dynamicProgramming1D;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak_152 {

    /**
     * Approach: Dynamic Programming
     *
     * @param s        string to be broken
     * @param wordDict list of words
     * @return true if the string can be broken into words from the wordDict
     * Recursive solution: <a href="https://leetcode.com/problems/word-break/solutions/169383/solved-the-time-complexity-of-the-brute-force-method-should-be-o-2-n-and-prove-it-below/"> Link </a>
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        String[] wordDict = new String[]{"apple", "pen"};
        System.out.println(wordBreak(s, List.of(wordDict)));
    }

}
