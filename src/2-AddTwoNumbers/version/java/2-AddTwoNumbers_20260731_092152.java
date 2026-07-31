// Last updated: 7/31/2026, 9:21:52 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode d=new ListNode(0);
14        ListNode t1=d;
15        ListNode ll1=l1;
16        ListNode ll2=l2;
17        int r=0;
18        while(ll1!=null&&ll2!=null){
19            int sum=r+ll1.val+ll2.val;
20            r=sum/10;
21            sum=sum%10;
22            ListNode n=new ListNode(sum);
23            t1.next=n;
24            t1=t1.next;
25            ll1=ll1.next;
26            ll2=ll2.next;
27        }
28        while(ll1!=null){
29            int sum=r+ll1.val;
30            r=sum/10;
31            sum=sum%10;
32            ListNode n=new ListNode(sum);
33            t1.next=n;
34            t1=t1.next;
35            ll1=ll1.next;
36        }
37        while(ll2!=null){
38            int sum=r+ll2.val;
39            r=sum/10;
40            sum=sum%10;
41            ListNode n=new ListNode(sum);
42            t1.next=n;
43            t1=t1.next;
44            ll2=ll2.next;
45        }
46        if(r!=0){
47            ListNode n=new ListNode(r);
48            t1.next=n;
49        }
50        return d.next;
51    }
52}