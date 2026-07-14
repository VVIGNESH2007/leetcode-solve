// Last updated: 7/14/2026, 12:16:51 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode t=head;
        ListNode t1=head;
        while(t.next!=null){
            if(t.val==t.next.val){
                ListNode y=t.next.next;
                t.next=y;
            }else{
                t=t.next;
            }
        }
        return head;
        
    }
}