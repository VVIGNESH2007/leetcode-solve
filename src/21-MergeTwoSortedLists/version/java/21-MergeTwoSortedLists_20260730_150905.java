// Last updated: 7/30/2026, 3:09:05 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        
14        // Dummy node to simplify edge cases
15        ListNode dummy = new ListNode(-1);
16        ListNode current = dummy;
17        
18        while (list1 != null && list2 != null) {
19            
20            if (list1.val <= list2.val) {
21                current.next = list1;
22                list1 = list1.next;
23            } else {
24                current.next = list2;
25                list2 = list2.next;
26            }
27            
28            current = current.next;
29        }
30        
31        // Attach remaining nodes
32        if (list1 != null) {
33            current.next = list1;
34        } else {
35            current.next = list2;
36        }
37        
38        return dummy.next;
39    }
40}