class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxA=0;

      while(left<right){
         int   area=(Math.min(heights[right],heights[left]))*(right-left);

        maxA= Math.max(maxA,area);

        if(heights[right]<heights[left] || heights[right]==heights[left]){
            right--;
        }else{
            left++;
        }
      }
      return maxA;
    }
}
