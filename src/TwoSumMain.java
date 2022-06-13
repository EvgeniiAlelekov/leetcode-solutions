import java.util.Arrays;

/**
 * Link of the problem: https://leetcode.com/problems/two-sum/
 *
 * Results of the execution:
 * Runtime: 105 ms, faster than 11.94% of Java online submissions for Two Sum.
 * Memory Usage: 42.4 MB, less than 86.91% of Java online submissions for Two Sum.
 *
 * Author Evgenii Alelekov 23.04.2022
 * */
public class TwoSumMain {
    public static void main(String[] args) {
        int[] arr1 = {-1,-2,-3,-4,-5};
        int xxx = -8;
        System.out.println(Arrays.toString(TwoSumMainSolution.twoSum(arr1, xxx)));
    }
}
class TwoSumMainSolution {
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