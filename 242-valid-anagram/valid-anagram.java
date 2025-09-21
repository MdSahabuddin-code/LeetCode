class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, cannot be an anagram
        if (s.length() != t.length()) return false;

        // Array for 26 lowercase English letters
        int[] freq = new int[26];

        // Count characters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;  // increase count for s
            freq[t.charAt(i) - 'a']--;  // decrease count for t
        }

        // If all values are 0 → anagram
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }
}
