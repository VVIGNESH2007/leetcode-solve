// Last updated: 7/22/2026, 11:06:58 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3        // Edge case: if either number is "0"
4        if (num1.equals("0") || num2.equals("0")) return "0";
5
6        int m = num1.length();
7        int n = num2.length();
8        int[] result = new int[m + n]; // maximum possible length
9
10        // Multiply each digit
11        for (int i = m - 1; i >= 0; i--) {
12            for (int j = n - 1; j >= 0; j--) {
13                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
14                int sum = mul + result[i + j + 1]; // add to existing value
15
16                result[i + j + 1] = sum % 10;      // store unit digit
17                result[i + j] += sum / 10;         // carry to the left
18            }
19        }
20
21        // Convert result array to string
22        StringBuilder sb = new StringBuilder();
23        int k = 0;
24        // Skip leading zeros
25        while (k < result.length && result[k] == 0) {
26            k++;
27        }
28        while (k < result.length) {
29            sb.append(result[k++]);
30        }
31
32        return sb.toString();
33    }
34}