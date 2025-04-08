class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                index = Math.max(index, map.get(nums[i]));
            }
            map.put(nums[i], i);
        }


        return index == -1 ? 0 : index/3 + 1;
        
    }
}
