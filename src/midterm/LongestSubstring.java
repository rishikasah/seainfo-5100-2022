package midterm;

import java.util.HashMap;
import java.util.Map;

// Question 6
public class LongestSubstring {

    public int findLongestSubstring(String string) {

        // Assuming string used is 128 ASCII
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int result = 0;
        while (right < string.length()) {
            char r = string.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = string.charAt(left);
                chars[l]--;
                left++;
            }

            result = Math.max(result, right - left + 1);

            right++;
        }
        return result;
    }
}
