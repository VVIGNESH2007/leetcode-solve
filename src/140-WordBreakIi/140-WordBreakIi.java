// Last updated: 7/14/2026, 12:16:20 PM
import java.util.*;

class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {

        List<String> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);

        backtrack(result, "", s, dict, 0);
        return result;
    }

    public void backtrack(List<String> result, String current, String s, Set<String> dict, int start){

        if(start == s.length()){
            result.add(current.trim());
            return;
        }

        for(int end = start + 1; end <= s.length(); end++){

            String word = s.substring(start, end);

            if(dict.contains(word)){
                backtrack(result, current + word + " ", s, dict, end);
            }
        }
    }
}