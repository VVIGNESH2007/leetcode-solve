// Last updated: 9/7/2026, 12:18:51 PM
1class Solution {
2    public String intToRoman(int num) {
3        String[]arr={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
4        int[]brr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
5        StringBuilder sb=new StringBuilder();
6        for(int i=arr.length-1;i>=0;i--){
7            while(brr[i]<=num){
8                num=num-brr[i];
9                sb.append(arr[i]);
10            }
11        }
12        return sb.toString();
13    }
14}