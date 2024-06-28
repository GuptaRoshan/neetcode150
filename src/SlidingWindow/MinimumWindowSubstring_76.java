package SlidingWindow;

public class MinimumWindowSubstring_76 {

    public static String minWindow(String source, String target) {
        // Handling edge cases
        if (source == null || target == null || source.isEmpty() || target.isEmpty() || source.length() < target.length())
            return "";

        int[] frequency = new int[128]; // ASCII map
        int count = target.length();
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        for (char ch : target.toCharArray()) {
            frequency[ch]++;
        }

        while (end < source.length()) {
            if (frequency[source.charAt(end)] > 0) {
                count--;
            }

            frequency[source.charAt(end)]--;
            end++;

            while (count == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    startIndex = start;
                }

                if (frequency[source.charAt(start)] == 0) {
                    count++;
                }

                frequency[source.charAt(start)]++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : source.substring(startIndex, startIndex + minLen);
    }


    public static void main(String[] args) {
        String source = "ADOBECODEBANC";
        String target = "ABC";
        System.out.println(minWindow(source, target));
    }

}
