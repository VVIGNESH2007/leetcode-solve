// Last updated: 12/09/2026, 09:21:57
1import java.util.*;
2
3class Solution {
4    public int[] maximumWeight(List<List<Integer>> intervals) {
5        int n=intervals.size();
6        int[][] a=new int[n][4];
7
8        for(int i=0;i<n;i++){
9            a[i][0]=intervals.get(i).get(0);
10            a[i][1]=intervals.get(i).get(1);
11            a[i][2]=intervals.get(i).get(2);
12            a[i][3]=i;
13        }
14
15        Arrays.sort(a,(x,y)->{
16            if(x[0]!=y[0]) return Integer.compare(x[0],y[0]);
17            return Integer.compare(x[1],y[1]);
18        });
19
20        int[] next=new int[n];
21
22        for(int i=0;i<n;i++){
23            int l=i+1,r=n;
24
25            while(l<r){
26                int m=l+(r-l)/2;
27
28                if(a[m][0]>a[i][1])
29                    r=m;
30                else
31                    l=m+1;
32            }
33
34            next[i]=l;
35        }
36
37        State[][] dp=new State[5][n+1];
38
39        for(int k=0;k<=4;k++){
40            for(int i=0;i<=n;i++)
41                dp[k][i]=new State(0,new int[0]);
42        }
43
44        for(int k=1;k<=4;k++){
45            for(int i=n-1;i>=0;i--){
46                State skip=dp[k][i+1];
47
48                State old=dp[k-1][next[i]];
49                int[] takeIndex=new int[old.index.length+1];
50
51                for(int j=0;j<old.index.length;j++)
52                    takeIndex[j]=old.index[j];
53
54                takeIndex[old.index.length]=a[i][3];
55
56                Arrays.sort(takeIndex);
57
58                State take=new State(
59                    old.score+a[i][2],
60                    takeIndex
61                );
62
63                if(take.score>skip.score)
64                    dp[k][i]=take;
65                else if(take.score<skip.score)
66                    dp[k][i]=skip;
67                else if(compare(take.index,skip.index)<0)
68                    dp[k][i]=take;
69                else
70                    dp[k][i]=skip;
71            }
72        }
73
74        return dp[4][0].index;
75    }
76
77    static int compare(int[] a,int[] b){
78        int n=Math.min(a.length,b.length);
79
80        for(int i=0;i<n;i++){
81            if(a[i]!=b[i])
82                return Integer.compare(a[i],b[i]);
83        }
84
85        return Integer.compare(a.length,b.length);
86    }
87
88    static class State {
89        long score;
90        int[] index;
91
92        State(long score,int[] index){
93            this.score=score;
94            this.index=index;
95        }
96    }
97}