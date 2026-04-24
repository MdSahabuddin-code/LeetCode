import java.util.*;

public class Solution {

    // Define the twoSum method
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices
                }
            }
        }
        return new int[]{}; // Return empty array if no solution found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Read array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the target
        int target = sc.nextInt();

        // Call twoSum method
        Solution sol = new Solution();
        int[] result = sol.twoSum(arr, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        }
    }
}
