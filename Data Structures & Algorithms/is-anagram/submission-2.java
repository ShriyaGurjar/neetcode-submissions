class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()){
            return false;
         }
         char sArr[]=s.toCharArray();
          char tArr[]=t.toCharArray();
         int count[]=new int[26];
         for(char c : sArr){
           count[c-'a']++;
         }
           for(char c : tArr){
           count[c-'a']--;
         }
        
         for(int i=0; i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
         }
         return true;
    }
}
