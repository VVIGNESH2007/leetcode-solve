// Last updated: 8/14/2026, 11:43:15 AM
1class Solution {
2    public int frequency(String s){
3        int[]arr=new int[26];
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            arr[ch-'a']++;
7        }
8        for(int i=0;i<26;i++){
9            if(arr[i]!=0){
10                return arr[i];
11            }
12        }
13        return arr[25];
14    }
15    public int count(int n,int[]arr){
16        int c=0;
17        for(int i=0;i<arr.length;i++){
18            if(arr[i]>n){
19                c++;
20            }
21        }
22        return c;
23    }
24    public int[] numSmallerByFrequency(String[] queries, String[] words) {
25        int[] fqueries=new int[queries.length];
26        int[] fwords=new int[words.length];
27        int[]ans=new int[queries.length];
28        for(int i=0;i<queries.length;i++){
29            fqueries[i]=frequency(queries[i]);
30        }
31        for(int i=0;i<words.length;i++){
32            fwords[i]=frequency(words[i]);
33        }
34        for(int i=0;i<queries.length;i++){
35            ans[i]=count(fqueries[i],fwords);
36        }
37        return ans;
38    }
39}