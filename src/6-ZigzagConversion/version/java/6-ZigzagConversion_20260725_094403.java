// Last updated: 7/25/2026, 9:44:03 AM
1class Solution {
2    public String convert(String s, int numRows) {
3        int r=numRows;
4        if(r==1){
5            return s;
6        }
7        int n=s.length();
8        int c=(n/r)+n;
9        char[][] arr=new char[r][c];
10        int i=0;
11        int j=0;
12        int k=0;
13        while(i<r&&j<c&&k<n){
14            while(i<r&&k<n){
15                arr[i][j]=s.charAt(k++);
16                i++;
17            }
18            i--;
19            i--;
20            j++;
21            while(i!=0&&k<n&&j<c){
22                arr[i][j]=s.charAt(k++);
23                i--;
24                j++;
25            }
26        }
27        StringBuilder sb=new StringBuilder();
28        for(int x=0;x<r;x++){
29            for(int y=0;y<c;y++){
30                if(arr[x][y]!='\u0000'){
31                    sb.append(arr[x][y]);
32                }
33            }
34        }
35        return new String(sb);
36    }
37}