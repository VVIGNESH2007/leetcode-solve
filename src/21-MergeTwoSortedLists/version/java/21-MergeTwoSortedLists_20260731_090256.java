// Last updated: 7/31/2026, 9:02:56 AM
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
13        ListNode d= new ListNode(0);
14        ListNode t1=d;
15        ListNode l1=list1;
16        ListNode l2=list2;
17        while(l1!=null&&l2!=null){
18            if(l1.val<=l2.val){
19                ListNode n=new ListNode(l1.val);
20                t1.next=n;
21                t1=t1.next;
22                l1=l1.next;
23            }else{
24                ListNode n=new ListNode(l2.val);
25                t1.next=n;
26                t1=t1.next;
27                l2=l2.next;
28            }
29        }
30        if(l1==null&&l2==null){
31            return d.next;
32        }
33        while(l1!=null){
34            ListNode n=new ListNode(l1.val);
35            t1.next=n;
36            t1=t1.next;
37            l1=l1.next;
38        }
39        while(l2!=null){
40            ListNode n=new ListNode(l2.val);
41            t1.next=n;
42            t1=t1.next;
43            l2=l2.next;
44        }
45        return d.next;
46    }
47}