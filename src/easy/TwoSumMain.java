package easy;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/two-sum/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 105 ms, faster than 11.94% of Java online submissions for Two Sum.
 * Memory Usage: 42.4 MB, less than 86.91% of Java online submissions for Two Sum.
 * <p>
 * Author Evgenii Alelekov 23.04.2022
 * */
public class TwoSumMain {
    private static final Logger LOGGER = Logger.getLogger(TwoSumMain.class.getName());
    public static void main(String[] args) {
        int[] arr1 = {-1,-2,-3,-4,-5};
        int xxx = -8;
        String resultMessage = Arrays.toString(TwoSumMainSolution.twoSum(arr1, xxx));
        LOGGER.info(resultMessage);
    }
}
class TwoSumMainSolution {
    /**
     * SonarLint says: Utility classes, which are collections of static members, are not meant to be instantiated.
     * Even abstract utility classes, which can be extended, should not have public constructors.
     * Java adds an implicit public constructor to every class which does not define at least one explicitly.
     * Hence, at least one non-public constructor should be defined.
     * */
    TwoSumMainSolution() {
    }

    /**
     * If you know how to avoid Cognitive Complexity, please text me.
     * */
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length < 2 || nums.length > 10000){
            throw new IllegalArgumentException();
        }
        if(target < -1000000000 || target > 1000000000){
            throw new IllegalArgumentException();
        }
        if(nums[0] < -1000000000 || nums[0] > 1000000000){
            throw new IllegalArgumentException();
        }
        int[] res = new int[2];
        boolean check = false;
        for(int i = 0; i < nums.length-1; i++) {
            if(check) break;
            for(int y = i+1; y < nums.length; y++) {
                if(nums[y] < -1000000000 || nums[y] > 1000000000){
                    throw new IllegalArgumentException();
                }
                if (nums[i]+nums[y]==target){
                    res[0]=i;
                    res[1]=y;
                    check = true;
                    break;
                }
            }
        }
        return res;
    }
}