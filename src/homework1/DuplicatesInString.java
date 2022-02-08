package homework1;

import java.util.HashSet;
import java.util.Set;

/*
 * Question 3 - Homework 1
 * Write a program to check if string contains duplicates
 */
public class DuplicatesInString {

    public boolean stringHasDuplicates(String str){

        Set<Character> charSet = new HashSet<>();

        for(int i = 0;i<str.length();i++){
            char c= str.charAt(i);
            if(!charSet.contains(c))
                charSet.add(c);
            else
                return true;
        }

        return false;
    }

}
