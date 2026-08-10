// Last updated: 8/10/2026, 2:00:05 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        Queue<Integer> q=new ArrayDeque<>();
14        Stack<Integer> st=new Stack<>();
15        ListNode t=head;
16        while(t!=null){
17            if(!q.contains(t.val)){
18                q.offer(t.val);
19            }else{
20                st.push(t.val);
21            }
22            t=t.next;
23        }
24        ListNode dummy=new ListNode(0);
25        ListNode h1=dummy;
26        while(!q.isEmpty()){
27            System.out.print(q.peek());
28            if(!st.contains(q.peek())){
29                ListNode ll1=new ListNode(q.poll());
30                h1.next=ll1;
31                h1=h1.next;
32            }else{
33                q.poll();
34            }
35        }
36        return dummy.next;
37    }
38}