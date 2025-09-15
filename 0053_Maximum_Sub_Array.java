class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize current sum and maximum sum
        int maxCur = nums[0];
        int maxSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // If adding current number is better than starting fresh
            if (maxCur + nums[i] > nums[i]) {
                maxCur = maxCur + nums[i];
            } else {
                maxCur = nums[i]; // start new subarray
            }
            
            // Update maximum sum so far
            if (maxCur > maxSoFar) {
                maxSoFar = maxCur;
            }
        }
        
        return maxSoFar;
    }
}
