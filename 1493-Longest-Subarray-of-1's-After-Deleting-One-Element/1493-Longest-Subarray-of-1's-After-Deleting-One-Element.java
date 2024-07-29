class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) list.add(i);
        }
        list.add(nums.length);
        if(list.size() < 2) return nums.length - 1;

        max = Math.max(max, list.get(1) - 1);
        for(int i = 2; i < list.size(); i++){
            int num = list.get(i) - list.get(i - 2) - 2;
            max = Math.max(max, num);
        }
        return max;
        
    }
}
