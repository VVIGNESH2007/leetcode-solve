// Last updated: 7/14/2026, 12:17:13 PM
class Solution {
    public void per(int[] num,boolean[] vis,List<Integer> n,List<List<Integer>> res){
        if(n.size()==num.length){
            res.add(new ArrayList<>(n));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(vis[i]){
                continue;
            }
            vis[i]=true;
            n.add(num[i]);
            per(num,vis,n,res);
            n.remove(n.size()-1);
            vis[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis=new boolean[nums.length];
        List<List<Integer>> res=new ArrayList<>();
        per(nums,vis,new ArrayList<>(),res);
        return res;
    }
}