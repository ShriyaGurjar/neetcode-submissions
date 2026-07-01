class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left=1;
        int right=piles[piles.length-1];
        int result=right;

        while(left<=right){
            int mid=left+(right-left)/2;
            int hours=checkHours(mid,piles);

            if(hours<=h){
                result=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
    public static int checkHours(int mid ,int piles[]){
        int hrs=0;
        for(int pile : piles){
           int total=(int) Math.ceil((double)pile/mid);
           hrs+=total;
        }
        return hrs;
    }

}
