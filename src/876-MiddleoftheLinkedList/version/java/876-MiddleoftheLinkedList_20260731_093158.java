// Last updated: 7/31/2026, 9:31:58 AM
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
12    public ListNode middleNode(ListNode head) {
13        int n=0;
14        ListNode t1=head;
15        while(t1!=null){
16            n++;
17            t1=t1.next;
18        }
19        n=(n/2);
20        t1=head;
21        int c=0;
22        while(c!=n){
23            c++;
24            t1=t1.next;
25        }
26        return t1;
27    }
28}