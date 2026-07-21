// Last updated: 7/21/2026, 9:33:57 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] sa=new int[26];
4        int[] ta=new int[26];
5        if(s.length()!=t.length()){
6            return false;
7        }
8        for(int i=0;i<s.length();i++){
9            char j=s.charAt(i);
10            char k=t.charAt(i);
11            sa[j-'a']+=1;
12            ta[k-'a']+=1;
13        }
14        return Arrays.equals(sa,ta);
15    }
16}