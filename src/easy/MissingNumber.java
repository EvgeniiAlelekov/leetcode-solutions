package easy;

import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/missing-number/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 1 ms, faster than 82.03% of Java online submissions for Missing Number.
 * Memory Usage: 42.8 MB, less than 96.58% of Java online submissions for Missing Number.
 * <p>
 * Author Evgenii Alelekov 26.09.2022
 * */
public class MissingNumber {
    private static final Logger LOGGER = Logger.getLogger(MissingNumber.class.getName());

    public static void main(String[] args) {
        int[] inputArray = {0,1,2,3};
        String resultMessage = String.valueOf(MissingNumber.MissingNumberSolution.missingNumber(inputArray));
        LOGGER.info(resultMessage);
    }

    private static class MissingNumberSolution {
        public static int missingNumber(int[] inputArray) {
            Integer actualSum = 0;
            for (int num : inputArray) {
                actualSum += num;
            }
            return (inputArray.length*(inputArray.length+1)/2) - actualSum;
        }
    }
}
