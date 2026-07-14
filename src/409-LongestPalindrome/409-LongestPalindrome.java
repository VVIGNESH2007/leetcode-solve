// Last updated: 7/14/2026, 12:15:21 PM
class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int ans = 0;
       boolean hasOdd = false;
       for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
       }
        for(int val : map.values()){
            if(val%2 == 0){
                ans+=val;
            }else{
                ans+=val-1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            ans+=1;
        }
        return ans;
    }
}