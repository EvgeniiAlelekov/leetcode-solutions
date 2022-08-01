package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Link of the problem: https://leetcode.com/problems/longest-common-prefix/
 *
 * Results of the execution:
 * Runtime: 5 ms, faster than 26.74% of Java online submissions for Longest Common Prefix.
 * Memory Usage: 40.3 MB, less than 85.90% of Java online submissions for Longest Common Prefix.
 *
 * Author Evgenii Alelekov 24.04.2022
 * */
public class LongestCommonPrefixMain {
    public static void main(String[] args) {
        System.out.println(LongestCommonPrefixSolution.longestCommonPrefix(new String[]{"f","flow", "flight"}));
    }
}
class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        for (String currentWord : strs) {
            if (currentWord.equals("")) {
                return "";
            }
            if (result.equals("")) {
                result = currentWord;
            } else if (!currentWord.equals(result)) {
                char[] resultArray = result.toCharArray();
                char[] interimResultArray = new char[result.length()];
                char[] currentWordArray = currentWord.toCharArray();
                for (int indexLetter = 0; indexLetter < result.length() && indexLetter <= currentWord.length();
                     indexLetter++) {
                    if (indexLetter < currentWord.length() && resultArray[indexLetter]==currentWordArray[indexLetter]) {
                        interimResultArray[indexLetter] = resultArray[indexLetter];
                    }
                    else {
                        result = String.valueOf(interimResultArray);
                        break;
                    }
                }
            }
        }
        Pattern pattern = Pattern.compile("([^\u0000]*)");
        Matcher matcher = pattern.matcher(result);
        if(matcher.find(0)){
            return matcher.group();
        } else {
            return result;
        }
    }
}