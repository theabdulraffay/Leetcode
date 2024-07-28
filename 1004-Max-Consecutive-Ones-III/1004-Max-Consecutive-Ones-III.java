class Solution {
    public int longestOnes(int[] nums, int k) {
        if(k == nums.length) return k;
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i= 0; i < nums.length; i++) {
            if(nums[i] == 0) list.add(i);
        }
        list.add(nums.length);
        if(k >= list.size()) return nums.length;

        
        max = Math.max(max, list.get(k));

        for(int i = k + 1; i < list.size(); i++) {
            int ind = i - k - 1;
            int nu = list.get(i) - (list.get(ind) + 1);
            max = Math.max(max, nu);
        }
        return max;
    }
}
