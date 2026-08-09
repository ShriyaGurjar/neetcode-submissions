class NumArray {


      public static int n[];
    public NumArray(int[] nums) {
       this.n=nums;
        
    }
   
    public int sumRange(int left, int right) {
        if(n.length==0){
            return 0;
        }
        int sum=0;
    while(left<=right){
        sum+=n[left];
        left++;
    }
    return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */