// Last updated: 7/14/2026, 12:14:47 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int[]res=new int[nums.length];
        int j=nums.length-1;
        int k=nums.length-1;
        while(i<=j){
            int si=nums[i]*nums[i];
            int sj=nums[j]*nums[j];
            if(si<=sj){
                res[k]=sj;
                j--;
                k--;
            }
            else{
                res[k]=si;
                i++;
                k--;
            }
        }
        return res;
    }
}