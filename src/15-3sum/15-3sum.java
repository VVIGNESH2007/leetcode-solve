// Last updated: 7/14/2026, 12:17:38 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int k=n-1;
            int j=i+1;
            while(j<k){
                int rs=nums[i]+nums[j]+nums[k];
                if(rs<0){
                    j++;
                }else if(rs>0){
                    k--;
                }else{
                    List<Integer> nn=new ArrayList<>();
                    nn.add(nums[i]);
                    nn.add(nums[j]);
                    nn.add(nums[k]);
                    res.add(nn);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1]){
                        j++;
                    }
                }
                
            }
        }
        return res;
        
    }
}