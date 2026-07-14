// Last updated: 7/14/2026, 12:17:02 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode n1=head;
        int l=1;
        while(n1.next!=null){
            l++;
            n1=n1.next;
        }
        if(l<k){
            k=k%l;
        }
        for(int i=0;i<k;i++){
            ListNode t=head;
            while(t.next.next!=null){
                t=t.next;
            }
            t.next.next=head;
            head=t.next;
            t.next=null;

        }
        return head;
    }
}