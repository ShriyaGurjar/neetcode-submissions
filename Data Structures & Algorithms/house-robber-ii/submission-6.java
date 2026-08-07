class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int firstPart=houseRobber(0,nums.length-2,nums);
        int secondPart=houseRobber(1,nums.length-1,nums);

        return Math.max(firstPart,secondPart);
        
    }
    public int houseRobber(int start,int end,int nums[]){
        
       
        int prev2=0;
        int prev1=0;

        
        for(int i=start;i<=end;i++){
            int maxValue=Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=maxValue;
        }

        return prev1;
    }
}
