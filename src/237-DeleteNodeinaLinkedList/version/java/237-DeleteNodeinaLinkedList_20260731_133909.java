// Last updated: 7/31/2026, 1:39:09 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution {
10    public void deleteNode(ListNode node) {
11        while(true){
12            node.val=node.next.val;
13            if(node.next.next==null){
14                break;
15            }
16            node=node.next;
17        }
18        node.next=null;
19    }
20}