class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
             int left=i+1;
             int right=nums.length-1;
             while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer>li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[left]);
                    li.add(nums[right]);
                    Collections.sort(li);
                    set.add(li);
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{
                    right--;
                }
             }
        }
        return new ArrayList<>(set);
    }
}
