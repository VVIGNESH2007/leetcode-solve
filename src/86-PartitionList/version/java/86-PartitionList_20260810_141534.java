// Last updated: 8/10/2026, 2:15:34 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode l=new ListNode(0);
14        ListNode r=new ListNode(0);
15        ListNode h1=l;
16        ListNode h2=r;
17        ListNode h=head;
18        while(h!=null){
19            if(h.val<x){
20                ListNode l1=new ListNode(h.val);
21                h1.next=l1;
22                h1=h1.next;
23            }else{
24                ListNode l2=new ListNode(h.val);
25                h2.next=l2;
26                h2=h2.next;
27            }
28            h=h.next;
29        }
30        h1.next=r.next;
31        return l.next;
32    }
33}