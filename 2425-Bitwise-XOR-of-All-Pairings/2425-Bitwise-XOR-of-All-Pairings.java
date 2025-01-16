class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int c = 0;
        for (int i : nums1) {
                c ^= (n & 1) == 0 ? 0 : i;
        }

        for (int i : nums2) {
                c ^= (m & 1) == 0 ? 0 : i;
        }
        
        return c;
        
    }
}
