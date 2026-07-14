// Last updated: 7/14/2026, 12:17:35 PM
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(result, new StringBuilder(), digits, map, 0);
        return result;
    }

    public void backtrack(List<String> result, StringBuilder current, String digits, String[] map, int index) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));   // choose
            backtrack(result, current, digits, map, index + 1);  // explore
            current.deleteCharAt(current.length() - 1);  // backtrack
        }
    }
}