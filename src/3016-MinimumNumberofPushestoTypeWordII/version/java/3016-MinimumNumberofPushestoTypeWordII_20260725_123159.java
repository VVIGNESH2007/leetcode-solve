// Last updated: 7/25/2026, 12:31:59 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[]arr=new int[26];
4        for(int i=0;i<word.length();i++){
5            char ch=word.charAt(i);
6            arr[ch-'a']++;
7        }
8        Arrays.sort(arr);
9        int c=0;
10        int ans=0;
11        for(int i=25;i>=0;i--){
12            int t=(c/8)+1;
13            ans+=t*arr[i];
14            c++;
15        }
16        return ans;
17    }
18}