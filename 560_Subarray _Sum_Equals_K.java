class Solution {
    public int subarraySum(int[] nums, int k) {
         int n = nums.length;
         int count = 0;
         
         for(int i=0; i<n; i++){
            int curr_sum = 0;
            for(int j=i; j<n; j++){
                curr_sum = curr_sum+nums[j];
                if(curr_sum == k){
                    count++;
                }
            }
         }
        return count;
    }
}
