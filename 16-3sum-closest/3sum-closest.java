class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int max_diff=Integer.MAX_VALUE;
        int left, right, sum;
        int res_sum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            left = i + 1; right = n - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - res_sum)) {
                    res_sum = sum;
                }

                if (sum == target) return sum;

                if (sum < target) left++;
                else right--;
            }
        }
        return res_sum;  
    }
}