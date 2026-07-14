// Last updated: 7/14/2026, 12:17:27 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                j--;
            }else{
                i++;
            }
        }
        return j+1;

    }
}