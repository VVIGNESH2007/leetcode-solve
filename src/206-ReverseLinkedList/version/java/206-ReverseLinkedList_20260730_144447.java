// Last updated: 7/30/2026, 2:44:47 PM
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
12    public ListNode reverseList(ListNode head) {
13        if(head==null){
14            return null;
15        }
16        ListNode prev=null;
17        ListNode curr=head;
18        ListNode nex=head.next;
19        while(curr!=null){
20            curr.next=prev;
21            prev=curr;
22            curr=nex;
23            if(nex==null){
24                break;
25            }
26            nex=nex.next;
27        }
28        return prev;
29    }
30}