// Last updated: 8/10/2026, 3:54:29 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reverse(ListNode head){
13        ListNode prev=null;
14        ListNode curr=head;
15        while(curr!=null){
16            ListNode temp=curr.next;
17            curr.next=prev;
18            prev=curr;
19            curr=temp;
20        }
21    }
22    public ListNode reverseKGroup(ListNode head, int k) {
23        ListNode i=head;
24        ListNode j=head;
25        int c=0;
26        ListNode h=head;
27        while(h!=null){
28            c++;
29            h=h.next;
30        }
31        if(c<k){
32            return head;
33        }
34        for(int p=1;p<k;p++){
35            j=j.next;
36        }
37        ListNode ni=j.next;
38        j.next=null;
39        reverse(i);
40        i.next=reverseKGroup(ni,k);
41        return j;
42        
43    }
44}