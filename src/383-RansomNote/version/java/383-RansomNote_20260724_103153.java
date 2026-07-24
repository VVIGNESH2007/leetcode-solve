// Last updated: 7/24/2026, 10:31:53 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        if(magazine.length()<ransomNote.length()){
4            return false;
5        }
6        int[]arr=new int[26];
7        for(int i=0;i<magazine.length();i++){
8            char k=magazine.charAt(i);
9            arr[k-'a']++;
10        }
11        for(int i=0;i<ransomNote.length();i++){
12            char k=ransomNote.charAt(i);
13            arr[k-'a']--;
14            if(arr[k-'a']<0){
15                return false;
16            }
17        }
18        return true;
19        
20    }
21}