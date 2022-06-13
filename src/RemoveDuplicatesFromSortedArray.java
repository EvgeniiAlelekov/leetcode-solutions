/**
 * Link of the problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Results of the execution:
 * Runtime: 1 ms, faster than 86.77% of Java online submissions for Remove Duplicates from Sorted Array.
 * Memory Usage: 43.6 MB, less than 95.50% of Java online submissions for Remove Duplicates from Sorted Array.
 *
 * Author Evgenii Alelekov 27.04.2022
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
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
