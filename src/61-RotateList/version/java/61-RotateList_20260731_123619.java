// Last updated: 7/31/2026, 12:36:19 PM
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
12    public ListNode rotate(ListNode head){
13        ListNode temp=head;
14        while(temp.next.next!=null){
15            temp=temp.next;
16        }
17        int value=temp.next.val;
18        temp.next=null;
19        temp=head;
20        ListNode n=new ListNode(value);
21        n.next=head;
22        return n;
23    }
24    public ListNode rotateRight(ListNode head, int k) {
25        if(k==0){
26            return head;
27        }
28        if(head==null){
29            return null;
30        }
31        ListNode temp=head;
32        int n=0;
33        while(temp!=null){
34            n++;
35            temp=temp.next;
36        }
37        k=k%n;
38        for(int i=0;i<k;i++){
39            head=rotate(head);
40        }
41        return head;
42    }
43}