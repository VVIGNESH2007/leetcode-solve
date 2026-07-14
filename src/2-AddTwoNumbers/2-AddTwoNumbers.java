// Last updated: 7/14/2026, 12:17:49 PM
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
        ListNode p1=l1;
        ListNode p2=l2;
        int sum,c=0;
        ListNode dummy=new ListNode(0);
        ListNode h1=dummy;
        while(p1!=null&&p2!=null){
            sum=p1.val+p2.val+c;
            c=0;
            if(sum>9){
                c=sum/10;
                sum=sum%10;
                ListNode dum=new ListNode(sum);
                h1.next=dum;
                h1=h1.next;
            }else{
                ListNode dum=new ListNode(sum);
                h1.next=dum;
                h1=h1.next;
            }
            p1=p1.next;
            p2=p2.next;
        }
        while(p1!=null){
            sum=p1.val+c;
            c=sum/10;
            sum=sum%10;
            ListNode dum=new ListNode(sum);
            h1.next=dum;
            h1=h1.next;
            p1=p1.next;
        }
        while(p2!=null){
            sum=p2.val+c;
            c=sum/10;
            sum=sum%10;
            ListNode dum=new ListNode(sum);
            h1.next=dum;
            h1=h1.next;
            p2=p2.next;
        }
        if(c!=0){
            ListNode dum=new ListNode(c);
            h1.next=dum;
            h1=h1.next;
        }
        return dummy.next;
        

    }
}