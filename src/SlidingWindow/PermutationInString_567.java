package SlidingWindow;

public class PermutationInString_567 {

    public static boolean checkInclusion(String s1, String s2) {
        char[] frequency = new char[26];
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        for (int i = 0; i < len1; i++) {
            frequency[s1.charAt(i) - 'a']++;
            frequency[s2.charAt(i) - 'a']--;
        }

        if (allZero(frequency)) return true;

        for (int i = len1; i < len2; i++) {
            frequency[s2.charAt(i) - 'a']--;
            frequency[s2.charAt(i - len1) - 'a']++;
            if (allZero(frequency)) return true;
        }

        return false;
    }

    public static boolean allZero(char[] frequency) {
        for (char c : frequency) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

}
