class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // Binary search for first occurrence
    private int findFirst(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                end = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return index;
    }

    // Binary search for last occurrence
    private int findLast(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                start = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return index;
    }
}
// Time Complexity: O(log n) for both findFirst and findLast methods
// Space Complexity: O(1) since we are using only a constant amount of extra space
// This solution efficiently finds the first and last positions of a target element in a sorted array using binary search.
