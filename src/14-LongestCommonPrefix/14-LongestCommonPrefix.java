// Last updated: 7/14/2026, 12:17:40 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
               // char k=strs[j].charAt(i);
                if(strs[j].length()==i||strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}