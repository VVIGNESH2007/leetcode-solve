// Last updated: 9/7/2026, 9:52:59 AM
1class Solution {
2    public int[] finalPrices(int[] A) {
3        Stack<Integer> stack = new Stack<>();
4        for (int i = 0; i < A.length; i++) {
5            while (!stack.isEmpty() && A[stack.peek()] >= A[i])
6                A[stack.pop()] -= A[i];
7            stack.push(i);
8        }
9        return A;
10    }
11}