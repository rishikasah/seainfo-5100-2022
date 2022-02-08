package homework1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Question 4 - Homework 1
 *  Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
 */
public class Anagrams {

    public boolean isAnagram(String one, String two){

        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        if(Arrays.equals(oneArr,twoArr))
            return true;
        else
            return false;
    }


    public boolean isAnagram2(String one, String two){

        // Diff lengths so not anagrams
        if(one.length() != two.length())
            return false;

        Map<Character,Integer> charMap = new HashMap<>();

        // Add all characters in hashmap
        for(char c : one.toCharArray()){
            charMap.put(c,charMap.getOrDefault(c, 0) + 1 );
        }

        // For second string check to see if characters exist in map if not, not anagaram. Else Continue
        for(char c1 : two.toCharArray()){
            if(!charMap.containsKey(c1))
                return false;
            else
                charMap.put(c1,charMap.get(c1)-1);
        }

        for(Map.Entry<Character, Integer> e1 : charMap.entrySet()){

            if(e1.getValue() != 0)
                return false;
        }

        return true;
    }
}
