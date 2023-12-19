class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 0;
		int sp = nums.length;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])){
				sp--;
				continue;
			}
			set.add(nums[i]);
			nums[c++] = nums[i];
		}
        return sp;
    }
}
