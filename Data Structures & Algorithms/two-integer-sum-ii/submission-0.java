class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int ans=target - numbers[i];
            if(map.containsKey(ans)){
                int finalAns[]={map.get(ans),i+1};
               return finalAns;
            }
            map.put(numbers[i],i+1);
        }
        return new int[0];
    }
}
