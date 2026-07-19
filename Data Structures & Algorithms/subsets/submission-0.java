class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>finalList = new ArrayList<>();
      

      //choice one to come
      backtrack(0,new ArrayList<>() ,nums,finalList);
      return finalList;
    }
    public void backtrack(int index,List<Integer>curr,int[] nums,List<List<Integer>> finalList){
        
        finalList.add(new ArrayList<>(curr)); 


     for(int i=index;i<nums.length;i++){
        curr.add(nums[i]);

        backtrack(i+1,curr,nums,finalList);

        curr.remove(curr.size()-1);
     }

    }
 
}
