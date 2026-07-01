class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[]=new int[nums.length];
        int right[]=new int[nums.length];
        int left[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            
            int preffix=1;
            int suffix=1;

             for(int j=i+1;j<nums.length;j++){
             suffix*=nums[j];
             }
               left[i]= suffix;

             for(int j=i-1;j>=0;j--){
             preffix*=nums[j];
             }
              right[i]=preffix;
             

        }
        for(int i=0;i<output.length;i++){
                output[i]=right[i]*left[i];
        }
       
        return output;
    }
}  
