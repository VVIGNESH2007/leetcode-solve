// Last updated: 7/31/2026, 3:13:53 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        if (head == null || left == right) return head;
4
5        // Step 1: Create a dummy node to seamlessly handle left = 1
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8        
9        // Step 2: Move 'prev' pointer to the node right before the sublist starts
10        ListNode prev = dummy;
11        for (int i = 1; i < left; i++) {
12            prev = prev.next;
13        }
14
15        // Step 3: Set up pointers for the sublist reversal
16        ListNode curr = prev.next; // The first node of the sublist to be reversed
17        ListNode nextNode = null;   // Temporary pointer to hold the rest of the list
18
19        // Step 4: Reverse the sublist in-place by shifting nodes one by one
20        for (int i = 0; i < right - left; i++) {
21            nextNode = curr.next;
22            curr.next = nextNode.next;
23            nextNode.next = prev.next;
24            prev.next = nextNode;
25        }
26
27        // Return the actual head of the modified list
28        return dummy.next;
29    }
30}
31