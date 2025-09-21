class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen = new int[128]; // ASCII character map
        for (int i = 0; i < 128; i++) seen[i] = -1; // initialize to -1

        int count = 0;      // length of current substring
        int larcount = 0;   // max length
        int start = 0;      // start of current substring

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If character was seen in current window, move start
            if (seen[c] >= start) {
                start = seen[c] + 1;
                count = i - start; // reset current count
            }

            count++;
            larcount = Math.max(larcount, count);

            // Mark character as seen at current index
            seen[c] = i;
        }
        return larcount;
    }
}
