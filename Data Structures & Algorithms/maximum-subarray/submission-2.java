class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int countSum=0;

        for(int num : nums){
            countSum+=num;
            maxSum=Math.max(maxSum,countSum);
            countSum=countSum<0?0:countSum;
        }
        return maxSum;
        
    }
}
