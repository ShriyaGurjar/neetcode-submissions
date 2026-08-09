class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>set=new HashSet<>();
int count=0;
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }

        for(String word:words){
            for(int i=0;i<word.length();i++){
                if(!set.contains(word.charAt(i))){
                    break;
                }
                if(i==word.length()-1){
                   count++;
                }
            }
           
        }
        return count;
    }
}