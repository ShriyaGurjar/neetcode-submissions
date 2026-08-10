class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        map.put(1,0);
        map.put(0,0);
         
        int left=0;
        int right=0;
        int maxSize=0;
        while(right<nums.length){
           map.put(nums[right], map.get(nums[right])+1);
           
            while(k-map.get(0)<0){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            right++;
            maxSize=Math.max(maxSize,right-left);
        }
        return maxSize;
    }
}