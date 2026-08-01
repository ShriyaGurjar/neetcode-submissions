class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        int buy=prices[0];
        
        for(int i=1;i<prices.length;i++){

            maxProf=Math.max(prices[i]-buy,maxProf);
            if(buy>prices[i]){
                buy=prices[i];
               
            }
        }
        return maxProf;
    }
}
