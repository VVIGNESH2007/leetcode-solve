// Last updated: 7/14/2026, 12:15:13 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push all digits of l1 into stack s1
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        // Push all digits of l2 into stack s2
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;

        // Pop from stacks and add digits
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            carry = sum / 10;
            int digit = sum % 10;

            // Insert new node at the front
            ListNode newNode = new ListNode(digit);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }
}