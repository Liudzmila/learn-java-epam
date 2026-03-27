package main.java.com.epam.learn;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowTask {

    public static void main(String args[]) {
        System.out.println(lengthOfTheLongestSubstring("abfghjkk"));
    }

    private static int lengthOfTheLongestSubstring(String s) {

        int maxLength = 0;
        int left = 0;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
