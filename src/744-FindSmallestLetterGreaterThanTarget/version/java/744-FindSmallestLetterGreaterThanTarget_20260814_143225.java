// Last updated: 8/14/2026, 2:32:25 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int[]arr=new int[26];
4        for(int i=0;i<letters.length;i++){
5            char c=letters[i];
6            arr[c-'a']++;
7        }
8        int n=target-'a'+1;
9        for(int i=n;i<26;i++){
10            if(arr[i]!=0){
11                char ch=(char)('a'+i);
12                return ch;
13            }
14        }
15        return letters[0];
16
17    }
18}