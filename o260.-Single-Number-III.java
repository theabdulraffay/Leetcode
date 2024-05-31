class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) return nums;
        int[] toReturn = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int c = 0;
        for(int i : nums) {
            if(map.get(i) == 1) {
                toReturn[c++] = i;
            }
        }

        return toReturn;

        
    }
}
