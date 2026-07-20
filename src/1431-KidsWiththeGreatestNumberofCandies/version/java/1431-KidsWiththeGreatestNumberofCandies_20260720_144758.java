// Last updated: 7/20/2026, 2:47:58 PM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        int n=candies.length;
4        int max=-1000;
5        for(int i=0;i<n;i++){
6            if(candies[i]>max){
7                max=candies[i];
8            }
9        }
10        List<Boolean> res=new ArrayList<>();
11        for(int i=0;i<n;i++){
12            if(candies[i]+extraCandies>=max){
13                res.add(true);
14            }else{
15                res.add(false);
16            }
17        }
18        return res;
19    }
20}