// Last updated: 7/31/2026, 10:23:20 AM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        int m=0;
14        ListNode t1=head;
15        while(t1!=null){
16            m++;
17            t1=t1.next;
18        }
19        if(m==n){
20            return head.next;
21        }
22        m=m-n;
23        t1=head;
24        m--;
25        int c=0;
26        while(m!=c){
27            c++;
28            t1=t1.next;
29        }
30        t1.next=t1.next.next;
31        return head;
32    }
33}