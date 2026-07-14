// Last updated: 7/14/2026, 12:17:15 PM
class Solution {
    public String multiply(String num1, String num2) {
        // Edge case: if either number is "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n]; // maximum possible length

        // Multiply each digit
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1]; // add to existing value

                result[i + j + 1] = sum % 10;      // store unit digit
                result[i + j] += sum / 10;         // carry to the left
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        int k = 0;
        // Skip leading zeros
        while (k < result.length && result[k] == 0) {
            k++;
        }
        while (k < result.length) {
            sb.append(result[k++]);
        }

        return sb.toString();
    }
}