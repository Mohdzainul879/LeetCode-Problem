class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Actual_sum = n*(n+1)/2;
        int Curr_sum = 0;
        for(int i=0; i<n; i++){
            Curr_sum = Curr_sum+nums[i];
            }
            int missing_number = Actual_sum - Curr_sum;
            return missing_number;
           
        
    }
}