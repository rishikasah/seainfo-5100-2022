/*Question 3: Given a string s, find the length of the longest substring without repeating characters.

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
package test_final;

public class Question3 {

    public int lengthOfLongestSubstring(String s) {

        int[] chars = new int[128];

        int left = 0, right = 0, res = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}
