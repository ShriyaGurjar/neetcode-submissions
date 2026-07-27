class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
      
        
        int prev2=nums[0];

        int prev1=Math.max(nums[1],prev2);
        int maxVal=prev1;
        
        for(int i=2;i<nums.length;i++){
            maxVal=Math.max(prev1,nums[i]+prev2);
           prev2=prev1;
           prev1=maxVal;

        }

        return maxVal;
    }
}
