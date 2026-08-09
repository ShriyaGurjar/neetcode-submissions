class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int largest=0;
        for(int num:nums){
            if(num==1){
                count+=1;
                largest=Math.max(count,largest);
            }else{
                count=0;
            }
            
        }
        return largest;
    }
}