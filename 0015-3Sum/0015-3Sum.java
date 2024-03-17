class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    // set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // set.add(l);
                    j++;
                    k--;
                    if(!set.contains(l)) {
                        set.add(l);
                        list.add(l);
                    }
                } 
                else if (sum < 0){ j++; }
                else { k--; }
            }
        }
        
        // list.addAll(set);
        return list;
    }
}
