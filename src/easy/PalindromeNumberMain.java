package easy;

import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: Runtime: 20 ms, faster than 18.31% of Java online submissions for Palindrome Number.
 * Memory Usage: 47.4 MB, less than 8.27% of Java online submissions for Palindrome Number.
 * <p>
 * Author Evgenii Alelekov 23.04.2022
 * */
public class PalindromeNumberMain {
    private static final Logger LOGGER = Logger.getLogger(PalindromeNumberMain.class.getName());
    public static void main(String[] args) {
        String resultMessage = String.valueOf(PalindromeNumberSolution.isPalindrome(1221));
        LOGGER.info(resultMessage);
    }
}
class PalindromeNumberSolution {
    /**
     * SonarLint says: Utility classes, which are collections of static members, are not meant to be instantiated.
     * Even abstract utility classes, which can be extended, should not have public constructors.
     * Java adds an implicit public constructor to every class which does not define at least one explicitly.
     * Hence, at least one non-public constructor should be defined.
     * */
    PalindromeNumberSolution() {
    }

    public static boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuffer(String.valueOf(x)).reverse().toString());
    }
}