class Solution {
    List<Integer> toret;
    int dp[];
    void helper(int[] nums, int i, int num, List<Integer> list) {
        if (i >= nums.length) {
            if(list.size() > toret.size()) {
                toret.clear();
                toret.addAll(list);
            }
            return;
        }
        if(list.size() > dp[i] && nums[i] % num == 0) {
            dp[i] = list.size();
            list.add(nums[i]);
            helper(nums, i + 1, nums[i], list);
            list.remove(list.size() - 1);
        }
        helper(nums, i + 1, num, list);
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        toret = new  ArrayList<>();
        Arrays.sort(nums);
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        helper(nums, 0, 1, new ArrayList<>());
        return toret;
    }
}
