// Last updated: 7/31/2026, 9:26:04 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode s=head;
15        ListNode f=head;
16        while(f!=null&&f.next!=null){
17            s=s.next;
18            f=f.next.next;
19            if(s==f){
20                return true;
21            }
22        }
23        return false;
24    }
25}