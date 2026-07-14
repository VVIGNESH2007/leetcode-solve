// Last updated: 7/14/2026, 12:15:51 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}

