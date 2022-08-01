package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Link of the problem: https://leetcode.com/problems/valid-parentheses/
 *
 * Results of the execution:
 * Runtime: 2 ms, faster than 80.46% of Java online submissions for Valid Parentheses.
 * Memory Usage: 40.3 MB, less than 83.85% of Java online submissions for Valid Parentheses.
 *
 * Author Evgenii Alelekov 24.04.2022
 * */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(){}{}{}{}}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}]"));
    }
    public static boolean isValid(String s) {
        Map<Character,Character> mappings = new HashMap<>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        Stack<Character> letters = new Stack<>();
        char[] sArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            char temp = sArray[i];
            if(mappings.containsKey(temp)){
                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }
}
