class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];
        
        int i = 0, j = 0, k = 0;
        
        // Merge nums1 and nums2 in sorted order
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        
        // Copy remaining elements
        while (i < n1) nums3[k++] = nums1[i++];
        while (j < n2) nums3[k++] = nums2[j++];
        
        int len = n1 + n2;
        
        // Find median
        if (len % 2 == 1) {
            return nums3[len / 2]; // odd length
        } else {
            return (nums3[len / 2 - 1] + nums3[len / 2]) / 2.0; // even length
        }
    }
}
