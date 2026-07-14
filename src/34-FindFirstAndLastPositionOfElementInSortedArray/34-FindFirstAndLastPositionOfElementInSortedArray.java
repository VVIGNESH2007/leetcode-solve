// Last updated: 7/14/2026, 12:17:22 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]res=new int[2];
        res[0]=-1;
        res[1]=-1;
        int f=0;
        int l=nums.length-1;
        while(f<=l){
            if(nums[f]!=target){
                f++;
            }
            if(nums[l]!=target){
                l--;
            }
            if(l>=0&&f<nums.length&&nums[l]==target&&nums[f]==target){
                res[0]=f;
                res[1]=l;
                return res;
            }
        }
        return res;
        
    }
}