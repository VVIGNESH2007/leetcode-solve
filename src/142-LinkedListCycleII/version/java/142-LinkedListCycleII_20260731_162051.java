// Last updated: 7/31/2026, 4:20:51 PM
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
13    public ListNode detectCycle(ListNode head) {
14        if(head==null||head.next==null){
15            return null;
16        }
17        if(head.next.next==head){
18            return head;
19        }
20        ListNode s=head;
21        ListNode f=head;
22        while(true){
23            if(f==null||f.next==null){
24                return null;
25            }
26            s=s.next;
27            f=f.next.next;
28            if(s==f){
29                break;
30            }
31        }
32        f=head;
33        while(s!=f){
34            s=s.next;
35            f=f.next;
36        }
37        return f;
38    }
39}