// Last updated: 7/14/2026, 12:16:09 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int number:nums){
            if(count==0){
                candidate=number;
            }
            count+=(candidate==number)?1:-1;
        }
        return candidate;
        
    }
}