// Last updated: 7/14/2026, 12:16:10 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[]res=new int[2];
        while(j<numbers.length){
            int sum =numbers[i]+numbers[j];
            if(sum==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
            if(sum<target){
                i++;
            }
            if(sum>target){
                j--;
            }
           

        }
        return res;
    }
}