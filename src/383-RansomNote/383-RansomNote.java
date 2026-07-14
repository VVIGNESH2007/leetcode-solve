// Last updated: 7/14/2026, 12:15:26 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[]arr=new int[26];
        for(int i=0;i<magazine.length();i++){
            char k=magazine.charAt(i);
            arr[k-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char k=ransomNote.charAt(i);
            arr[k-'a']--;
            if(arr[k-'a']<0){
                return false;
            }
        }
        return true;
        
    }
}