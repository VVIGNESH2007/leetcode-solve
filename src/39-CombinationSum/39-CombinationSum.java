// Last updated: 7/14/2026, 12:17:16 PM
import java.util.*;

class Solution {
    
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        
        backtrack(arr, target, 0, new ArrayList<>(), result);
        
        return result;
    }
    
    public void backtrack(int[] arr, int target, int index,
                          List<Integer> current,
                          List<List<Integer>> result){
        
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        if(target < 0) return;
        
        for(int i = index; i < arr.length; i++){
            
            current.add(arr[i]);
            
            backtrack(arr, target - arr[i], i, current, result);
            
            current.remove(current.size() - 1); // backtrack
        }
    }
}