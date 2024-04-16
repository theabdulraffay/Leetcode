class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length -2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index  == -1) { // This means that the array is in increasing order so we just reverse it such that it forms the first permutation
            int i = 0;
            int j = nums.length - 1;
            while (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
            }
            return;
        }
        for (int i = nums.length -1; i > index; i--) { // other wise we just swap the lowest integer greater than the index value we get from nums
            if (nums[i] > nums[index]) {
                int t = nums[i];
                nums[i] = nums[index];
                nums[index] = t;
                break;
            }
        }

        int i = index + 1;
        int j = nums.length - 1;
        while (i < j) { // then swap the whole remaining array
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        
    }
}
