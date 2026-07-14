// Last updated: 7/14/2026, 12:16:00 PM
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Dummy node before head
        ListNode dh = new ListNode(-1);
        dh.next = head;

        ListNode current = dh;

        while (current.next != null) {

            if (current.next.val == val) {
                // remove the node
                current.next = current.next.next;
            } 
            else {
                current = current.next;
            }
        }
        return dh.next;
    }
}