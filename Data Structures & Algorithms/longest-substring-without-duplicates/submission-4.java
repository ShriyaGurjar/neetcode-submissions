class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int l=0;
        HashSet<Character>set=new HashSet<>();

        for(int i=0;i<s.length();i++){
          while(set.contains(s.charAt(i))){
            set.remove(s.charAt(l));
            l++;
          }
          set.add(s.charAt(i));
          int length=i-l+1;
          maxLength=Math.max(length,maxLength);
          
        }
        return maxLength;
    }
}
