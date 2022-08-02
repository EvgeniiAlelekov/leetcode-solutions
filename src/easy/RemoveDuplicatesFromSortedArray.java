package easy;

import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 1 ms, faster than 86.77% of Java online submissions for Remove Duplicates from Sorted Array.
 * Memory Usage: 43.6 MB, less than 95.50% of Java online submissions for Remove Duplicates from Sorted Array.
 * <p>
 * Author Evgenii Alelekov 27.04.2022
 */
public class RemoveDuplicatesFromSortedArray {
    private static final Logger LOGGER = Logger.getLogger(RemoveDuplicatesFromSortedArray.class.getName());
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        String resultMessage = String.valueOf(removeDuplicates(nums));
        LOGGER.info(resultMessage);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                count = 1;
            } else if (nums[index] != nums[index-1]) {
                nums[count] = nums[index];
                count++;
            }
        }
        return count;
    }
}
