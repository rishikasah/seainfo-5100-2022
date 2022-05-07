/*
Question1:

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
 - Open brackets must be closed by the same type of brackets.
 - Open brackets must be closed in the correct order.

 Input: s = "()[]{}"
 Output: true

 Input: s = "(]"
 Output: false
*/

package test_final;

import java.util.Stack;

public class Question1 {

    boolean isPair(char left,char right){
        return left=='{' && right=='}' || left=='(' && right==')' || left=='[' && right==']';
    }

    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            else{
                if(!stack.isEmpty() && isPair(stack.peek(),ch))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
