// Last updated: 7/24/2026, 2:45:51 PM
1class Solution {
2    public boolean pali(int left,int right,String s){
3        while(left<right){
4            if(s.charAt(left)!=s.charAt(right)){
5                return false;
6            }
7            left++;
8            right--;
9        }
10        return true;
11    }
12    public int removePalindromeSub(String s) {
13        if(pali(0,s.length()-1,s)){
14            return 1;
15        }
16        return 2;
17    }
18}