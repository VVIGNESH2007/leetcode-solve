// Last updated: 7/14/2026, 12:17:42 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int w=(j-i)*Math.min(height[i],height[j]);
            max=Math.max(max,w);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}