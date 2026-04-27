class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int target = 0;

        List<int[]> result = new ArrayList<>();

        int i, left, right;

        for (i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            left = i + 1;
            right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        List<List<Integer>> finalResult = new ArrayList<>();
        for (int[] arr : result) {
            finalResult.add(Arrays.asList(arr[0], arr[1], arr[2]));
        }

        return finalResult;
    }
}