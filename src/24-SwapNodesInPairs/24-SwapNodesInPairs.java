// Last updated: 7/14/2026, 12:17:29 PM
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
    public ListNode swapPairs(ListNode head) {
        // Dummy node to simplify handling of head swaps
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Traverse while there are at least two nodes to swap
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev two steps forward
            prev = first;
        }

        return dummy.next;
    }
}