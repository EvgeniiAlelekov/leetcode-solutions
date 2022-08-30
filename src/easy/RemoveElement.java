package easy;

import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/remove-element/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
 * Memory Usage: 40.8 MB, less than 92.98% of Java online submissions for Remove Element.
 * <p>
 * Author Evgenii Alelekov 30.08.2022
 * */
public class RemoveElement {
    private static final Logger LOGGER = Logger.getLogger(RemoveElement.class.getName());
    public static void main(String[] args) {
        int[] inputArray = {7,7,9,7};
        int needDelete = 7;
        String resultMessage = String.valueOf(RemoveElementSolution.removeElement(inputArray, needDelete));
        LOGGER.info(resultMessage);
    }

    private static class RemoveElementSolution {
        private static int countRemoveElements;
        public static int removeElement(int[] inputArray, int needDelete) {
            for(int i=0; i<inputArray.length; i++){
                if(inputArray[i]==needDelete){
                    changeArray(inputArray, i, needDelete);
                    if(i>(inputArray.length - countRemoveElements)){
                        break;
                    }
                }
            }
            return inputArray.length - countRemoveElements;
        }

        private static void changeArray(int[] inputArray, int i, int needDelete) {
            int emptySlot = -1; //we can't wrap array to Integer
            for(int j = i; j < inputArray.length; j++){
                if(inputArray.length>(j+1)) {
                    inputArray[j] = inputArray[j+1];
                } else {
                    inputArray[j] = emptySlot;
                    countRemoveElements++;
                    if(inputArray[i]==needDelete) {
                        changeArray(inputArray,i,needDelete);
                    }
                }
            }
        }
    }
}
