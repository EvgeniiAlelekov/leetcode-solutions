package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 2 ms, faster than 80.46% of Java online submissions for Valid Parentheses.
 * Memory Usage: 40.3 MB, less than 83.85% of Java online submissions for Valid Parentheses.
 * <p>
 * Author Evgenii Alelekov 24.04.2022
 * */
public class ValidParentheses {
    private static final Logger LOGGER = Logger.getLogger(ValidParentheses.class.getName());
    private static final Map<Character,Character> PARENTHESES = new HashMap<>();
    static {
        PARENTHESES.put(')', '(');
        PARENTHESES.put('}', '{');
        PARENTHESES.put(']', '[');
    }
    public static void main(String[] args) {
        String resultMessage = String.valueOf(isValid("(){}{}{}{}}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}]"));
        LOGGER.info(resultMessage);
    }
    public static boolean isValid(String s) {
        Stack<Character> letters = new Stack<>();
        char[] sArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            char temp = sArray[i];
            if(PARENTHESES.containsKey(temp)){
                if(letters.isEmpty() || !letters.pop().equals(PARENTHESES.get(temp))){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }
}
