class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();

        int right=0;
        int left=0;
        int maxLength=0;

        
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            right++;
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}
