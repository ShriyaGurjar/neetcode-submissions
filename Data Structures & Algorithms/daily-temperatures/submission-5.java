class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;

        int result[]=new int[n];
         result[n-1]=0;


        for(int i=n-2; i>=0; i--){
          if(temperatures[i]<temperatures[i+1]){
                 result[i]=1;
          }else {
            int j=i+1;
            while(j<n && temperatures[i]>=temperatures[j] ){
               if(result[j]==0){
                 j=n;
               }else{
                 j=j+result[j];
               }
            }
            if(j>=n){
                result[i]=0;
            }else{
                result[i]=j-i;
            }
           
          }
        }
        return result;
    }
}
