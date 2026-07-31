// Last updated: 7/31/2026, 10:07:21 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode l1=headA;
15        ListNode l2=headB;
16        while(l1!=l2){
17            if(l1.next==null&&l2.next==null){
18                return null;
19            }
20            l1=(l1.next==null)?headB:l1.next;
21            l2=(l2.next==null)?headA:l2.next;
22        }
23        return l1;
24    }
25}