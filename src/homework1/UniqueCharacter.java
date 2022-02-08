package homework1;
import java.util.Arrays;

/*
 * Question 2 - Assignment 1
 * Write a program to check if a string has all unique characters.
 */
public class UniqueCharacter {

    public boolean hasAllUniqueCharacters(String inputStr){

        char[] strArr = inputStr.toCharArray();
        Arrays.sort(strArr);

        int ptrStart = 0;
        while(ptrStart < strArr.length -1){

            if(strArr[ptrStart] == strArr[ptrStart+1])
                return false;

            ptrStart++;
        }

        return true;
    }
}
