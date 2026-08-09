class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
int i=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            i++;
        }

        while(index<i){
            nums[index]=0;
            index++;
        }
    }
}