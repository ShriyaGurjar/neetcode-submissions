class Solution {
    public boolean isPalindrome(String s) {
        String result=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char arr[]=result.toCharArray();


         int left=0;
         int right=arr.length-1;
         while(left<right){

            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
         }
         return true;
    }
}
