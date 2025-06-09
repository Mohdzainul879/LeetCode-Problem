class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr_count = 0;
        int max_count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++ ){
            if(nums[i] == 1){
                curr_count++;
                max_count = Math.max(max_count, curr_count);
            }
            else{
                curr_count = 0;
            }
        }

        return max_count;
    }
}