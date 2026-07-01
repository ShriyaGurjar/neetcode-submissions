class Solution {
    public int longestConsecutive(int[] nums) {

        
        HashSet<Integer>set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

     int maxlength=0;
     for(int num:nums) {
        if(!set.contains(num-1)){
               int length=1;
               int i=num;
            while (set.contains(i+1)){
             
              length++;
              i++;
       }
       maxlength=Math.max(length,maxlength);
        }
            }
            
      return maxlength;
    }
}
