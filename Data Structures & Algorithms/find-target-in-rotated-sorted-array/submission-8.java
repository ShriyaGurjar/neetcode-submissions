class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int end=nums.length-1;

        while(low<=end){

            int  mid =low + (end-low)/2;

        if(nums[mid]==target){
            return mid;
        }
            if(nums[low]<=nums[mid]){
                //left half sorted
                if(nums[low]<=target && target <nums[mid]){
                    end=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                //right half is sorted
               if(nums[mid]<target && target <=nums[end]){
                   low=mid+1;
               }else{
                end=mid-1;
               }
            }
        }
        return -1;
    }
}
