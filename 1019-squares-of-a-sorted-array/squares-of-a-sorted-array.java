class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0, right=n-1;
        while (left<right){
            nums[left]=nums[left]*nums[left];
            nums[right]=nums[right]*nums[right];
            left++;
            right--;
        }
        if(left==right)
            nums[left]=nums[left]*nums[left];
        Arrays.sort(nums);
        return nums;
    }
}