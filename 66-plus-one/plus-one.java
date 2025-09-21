class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;         // add 1 and return
                return digits;
            }
            digits[i] = 0;            // if 9, make it 0 and carry 1 to next loop
        }

        // if all were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
