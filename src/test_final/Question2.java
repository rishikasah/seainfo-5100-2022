/*
Question 2: String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

- Input: "aabcccccaaa"
  Output: "a2b1c5a3"

- Input: "ab"
  Output: "ab"
*/
package test_final;

public class Question2 {

    public String compressString(String str) {
        int n;
        if (str == null || (n = str.length()) < 2) {
            return str;
        }
        int p = 0, q = 1;
        StringBuilder sb = new StringBuilder();
        while (q < n) {
            if (str.charAt(p) != str.charAt(q)) {
                sb.append(str.charAt(p)).append(q - p);
                p = q;
            }
            ++q;
        }
        sb.append(str.charAt(p)).append(q - p);
        String res = sb.toString();
        return res.length() < n ? res : str;
    }
}
