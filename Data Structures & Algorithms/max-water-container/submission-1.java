class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxAns=0;
        
         while(l<r){
            if(heights[l]< heights[r]){
                maxAns=Math.max(maxAns,heights[l]*(r-l));
                l++;
            }else{
                 maxAns=Math.max(maxAns,heights[r]*(r-l));
                 r--;
            }}

            return maxAns;
    }
}
