class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i : nums) {
            if(i == pivot) list.addFirst(i);
            else if (i >  pivot) list.addLast(i);
        }

        int n = nums.length;
        for(int i = n - 1; i >= 0; i--) {
            if(nums[i] < pivot) list.addFirst(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            nums[i]  = list.removeFirst();
        }
        return nums;
        
    }
}
