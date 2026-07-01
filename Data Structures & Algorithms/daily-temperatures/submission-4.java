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
            if(result[j]==0){
                result[i]=0;
            }else{
                 while(j<n && temperatures[i]>=temperatures[j] ){
                j++;
            }
            result[i]=j-i;
            if(j==n){
                 result[i]=0;
            }
            }
           
          }
        }
        return result;
    }
}
