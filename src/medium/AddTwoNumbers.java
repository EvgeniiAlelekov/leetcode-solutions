package medium;

import java.util.logging.Logger;

/**
 * Link of the problem: <a href="https://leetcode.com/problems/add-two-numbers/">...</a>
 * <p>
 * Results of the execution:
 * Runtime: 3 ms, faster than 80.48% of Java online submissions for Add Two Numbers.
 * Memory Usage: 47.9 MB, less than 48.53% of Java online submissions for Add Two Numbers.
 * <p>
 * Author Evgenii Alelekov 02.08.2022
 */
public class AddTwoNumbers {
    private static final Logger LOGGER = Logger.getLogger(AddTwoNumbers.class.getName());
    public static void main(String[] args) {
        int l1n1 = 2;
        int l1n2 = 4;
        int l1n3 = 3;
        int l2n1 = 5;
        int l2n2 = 6;
        int l2n3 = 4;
        String resultMessage = AddTwoNumbersSolution.addTwoNumbers(new ListNode(l1n1, (new ListNode(l1n2,
                (new ListNode(l1n3))))), new ListNode(l2n1, (new ListNode(l2n2, (new ListNode(l2n3)))))).toString();
        LOGGER.info(resultMessage);
    }
}

class AddTwoNumbersSolution {
    /**
     * SonarLint says: Utility classes, which are collections of static members, are not meant to be instantiated.
     * Even abstract utility classes, which can be extended, should not have public constructors.
     * Java adds an implicit public constructor to every class which does not define at least one explicitly.
     * Hence, at least one non-public constructor should be defined.
     * */
    AddTwoNumbersSolution() {
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
