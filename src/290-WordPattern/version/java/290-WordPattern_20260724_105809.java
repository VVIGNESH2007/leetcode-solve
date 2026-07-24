// Last updated: 7/24/2026, 10:58:09 AM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        int n=pattern.length();
4        int m=s.length();
5        Map<Character,String> mp1=new HashMap<>();
6        Map<String,Character> mp2=new HashMap<>();
7        int x=0;
8        int y=0;
9        for(int i=0;i<n;i++){
10            if(y>m&&i<n){
11                return false;
12            }
13            while(y<m&&s.charAt(y)!=' '){
14                if(y==m-1){
15                    y++;
16                    break;
17                }
18                y++;
19            }
20            String z=s.substring(x,y);
21            char ch=pattern.charAt(i);
22            if((mp2.containsKey(z)&&mp2.get(z)!=(ch))||(mp1.containsKey(ch)&&!mp1.get(ch).equals(z))){
23                return false;
24            }
25            mp1.put(pattern.charAt(i),z);
26            mp2.put(z,pattern.charAt(i));
27            y++;
28            x=y;
29        }
30        if(y!=m+1){
31            return false;
32        }
33        return true;
34    }
35}