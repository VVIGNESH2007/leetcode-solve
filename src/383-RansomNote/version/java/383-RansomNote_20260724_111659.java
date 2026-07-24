// Last updated: 7/24/2026, 11:16:59 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int n=ransomNote.length();
4        int m=magazine.length();
5        int[] brr=new int[26];
6        for(int i=0;i<m;i++){
7            char ch=magazine.charAt(i);
8            brr[ch-'a']++;
9        }
10        for(int i=0;i<n;i++){
11            char ch=ransomNote.charAt(i);
12            if(brr[ch-'a']==0){
13                return false;
14            }
15            brr[ch-'a']--;
16        }
17        return true;
18
19    }
20}