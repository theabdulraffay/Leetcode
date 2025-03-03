class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int m = 0;

        for (int i : nums) {
            if(i < pivot) arr[m++] = i;
        }
        for (int i : nums) {
            if(i == pivot) arr[m++] = i;
        }
        for (int i : nums) {
            if(i > pivot) arr[m++] = i;
        }
        return arr;
        
    }
}
