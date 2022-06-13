
/**
 * Link of the problem: https://leetcode.com/problems/palindrome-number/
 *
 * Results of the execution:
 * Runtime: Runtime: 20 ms, faster than 18.31% of Java online submissions for Palindrome Number.
 * Memory Usage: 47.4 MB, less than 8.27% of Java online submissions for Palindrome Number.
 *
 * Author Evgenii Alelekov 23.04.2022
 * */
public class PalindromeNumberMain {
    public static void main(String[] args) {
        System.out.println(PalindromeNumberSolution.isPalindrome(1221));
    }
}
class PalindromeNumberSolution {
    public static boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuffer(String.valueOf(x)).reverse().toString());
    }
}