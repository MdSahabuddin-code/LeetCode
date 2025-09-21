class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size=m+n;
        int index=0;
        for(int i=0;i<size;i++){
            if(nums1[i]==0&& index<nums2.length){
                nums1[i]=nums2[index];
                index++;
            }
        }
        Arrays.sort(nums1);
    }
}