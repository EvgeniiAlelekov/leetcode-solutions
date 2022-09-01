package easy;

import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/fibonacci-number/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
 * Memory Usage: 39.4 MB, less than 85.99% of Java online submissions for Fibonacci Number.
 * <p>
 * Author Evgenii Alelekov 01.09.2022
 * */
public class FibonacciNumber {
    private static final Logger LOGGER = Logger.getLogger(FibonacciNumber.class.getName());
    public static void main(String[] args) {
        int n = 10;
        String resultMessage = String.valueOf(FibonacciNumberSolution.fib(n));
        LOGGER.info(resultMessage);
    }

    private static class FibonacciNumberSolution {

        public static int fib(int n) {
            if(n<0) {
                throw new IllegalArgumentException("Value can't be negative");
            }
            int prev=0;
            int tmp=1;
            int next=n;
            for(int i=1; i<n; i++){
                next = tmp+prev;
                prev = tmp;
                tmp = next;
            }
            return next;
        }
    }
}
