package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/roman-to-integer/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 10 ms, faster than 43.66% of Java online submissions for Roman to Integer.
 * Memory Usage: 46.8 MB, less than 26.85% of Java online submissions for Roman to Integer.
 * <p>
 * Author Evgenii Alelekov 24.04.2022
 */
public class RomanToIntegerMain {
    private static final Logger LOGGER = Logger.getLogger(RomanToIntegerMain.class.getName());
    public static void main(String[] args) {
        String resultMessage = String.valueOf(RomanToIntegerSolution.romanToInt("IV"));
        LOGGER.info(resultMessage);
    }
}

class RomanToIntegerSolution {
    /**
     * SonarLint says: Utility classes, which are collections of static members, are not meant to be instantiated.
     * Even abstract utility classes, which can be extended, should not have public constructors.
     * Java adds an implicit public constructor to every class which does not define at least one explicitly.
     * Hence, at least one non-public constructor should be defined.
     * */
    RomanToIntegerSolution() {
    }

    private static final Map<String, Integer> MAP_LETTERS_VALUES = new HashMap<>();
    static {
        MAP_LETTERS_VALUES.put("I", 1);
        MAP_LETTERS_VALUES.put("V", 5);
        MAP_LETTERS_VALUES.put("X", 10);
        MAP_LETTERS_VALUES.put("L", 50);
        MAP_LETTERS_VALUES.put("C", 100);
        MAP_LETTERS_VALUES.put("D", 500);
        MAP_LETTERS_VALUES.put("M", 1000);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int previous = 0;

        for (char letter : s.toCharArray()) {
            int valueLetter = MAP_LETTERS_VALUES.get(String.valueOf(letter));
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
