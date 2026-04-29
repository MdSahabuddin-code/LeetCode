class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int max_diff=Integer.MAX_VALUE;
        int left, right, sum, res_sum=0;
        for (int i=0; i<n-2;i++){
            left=i+1;
            right=n-1;
            while (left<right){
                sum=nums[i]+nums[left]+nums[right];
                if (sum == target){
                    int diff=Math.abs(sum-target);
                    if(max_diff>diff){
                        max_diff=diff;
                        res_sum=sum;
                    }
                    left++;
                    right--;
                }
                else if (sum < target){
                    int diff=Math.abs(sum-target);
                    if(max_diff>diff){
                        max_diff=diff;
                        res_sum=sum;
                    }
                    left++;
                }
                else if (sum > target){
                    int diff=Math.abs(sum-target);
                    if(max_diff>diff){
                        max_diff=diff;
                        res_sum=sum;
                    }
                    right--;
                }
            }
        }
        return res_sum;
    }   
}