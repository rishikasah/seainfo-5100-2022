package homework1;
/*
 * Question 1 - Homework  1
 * Write a program find if String is Palindrome?
 */

public class Palindrome {

    public boolean isPalindrome(String val){

        if (val.isEmpty()) return true;

        int start = 0, end = val.length()-1;
        while(start < end){

            char stChar = val.charAt(start);
            char endChar = val.charAt(end);
            if(!Character.isLetterOrDigit(stChar)){
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(endChar)){
                end--;
                continue;
            }

            if(Character.toLowerCase(stChar) != Character.toLowerCase(endChar))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
