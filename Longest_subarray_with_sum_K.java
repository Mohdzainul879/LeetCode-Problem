class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int MaxLength = 0;
        for(int i=0; i<n; i++){
            int curr_sum = 0;
            for(int j=i; j<n; j++){
                curr_sum = curr_sum + nums[j];

                if(curr_sum == k){
                    MaxLength = Math.max(MaxLength, j-i+1);
                }


                }

    
        }

        return MaxLength;
        
       
    }
}
