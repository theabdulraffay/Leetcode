class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) set.add(i);

        int size = set.size();
        // set.clear();
        int count = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while(map.size() == size) {
                count += (nums.length - i);
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
         
        }
        return count;
        
    }
}
