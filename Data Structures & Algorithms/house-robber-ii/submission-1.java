class Solution {
    public int rob(int[] nums) {
         if(nums.length==1){
            return nums[0];
        }

        int first=houseRobber(nums,0,nums.length-2);
        int second=houseRobber(nums,1,nums.length-1);

        return Math.max(first,second);
    }
    public int houseRobber(int nums[],int start,int n){
       
       int len=n-start+1;
         
         if(len==1){
            return nums[start];
         }
        int dp[]=new int[len];
       
        dp[0]=nums[start];
        dp[1]=Math.max(dp[0],nums[start+1]);

        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-1],nums[i+start]+dp[i-2]);
        }

        return  dp[len-1];
    }
}
