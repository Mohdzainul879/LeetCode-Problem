class Solution {
    public void moveZeroes(int[] nums) {
      move_zeros(nums);
      
        
    }

    public void move_zeros(int [] nums){
        int n  = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == 0){
                    if(nums[j]!=0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;

                    }
                }
            }
        }

    }
}
