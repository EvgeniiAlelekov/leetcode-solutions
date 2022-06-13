import java.util.HashMap;
import java.util.Map;

/**
 * Link of the problem: https://leetcode.com/problems/roman-to-integer/
 *
 * Results of the execution:
 * Runtime: 10 ms, faster than 43.66% of Java online submissions for Roman to Integer.
 * Memory Usage: 46.8 MB, less than 26.85% of Java online submissions for Roman to Integer.
 *
 * Author Evgenii Alelekov 24.04.2022
 */
public class RomanToIntegerMain {


    public static void main(String[] args) {
        System.out.println(RomanToIntegerSolution.romanToInt("IV"));
    }
}

class RomanToIntegerSolution {
    private static final Map<Character, Integer> mapLettersValues = new HashMap<>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanToInt(String s) {
        int result = 0;
        int previous = 0;

        for (char letter : s.toCharArray()) {
            int valueLetter = mapLettersValues.get(letter);
            if (valueLetter > previous) {
                result -= previous;
                result += valueLetter - previous;
            } else {
                result += valueLetter;
            }
            previous = valueLetter;
        }

        return result;
    }
}
