// Last updated: 7/14/2026, 12:15:40 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]arr=new int[26];
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            arr[k-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char k=t.charAt(i);
            arr[k-'a']--;
            if(arr[k-'a']<0){
                return false;
            }
        }
        return true;
    }
}