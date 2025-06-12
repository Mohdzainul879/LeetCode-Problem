class Solution {
    public int maxSubArray(int[] nums) {
      int n = nums.length;
      int curr_sum = 0;
      int Max_sum = Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        curr_sum = curr_sum + nums[i];
        Max_sum = Math.max(Max_sum, curr_sum);
        if(curr_sum<0){
            curr_sum = 0;
        }
      }

      return Max_sum;
    
        
    }
}
