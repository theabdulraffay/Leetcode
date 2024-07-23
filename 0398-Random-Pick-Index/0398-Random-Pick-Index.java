class Solution {
    int[] arr;
    HashMap<Integer, List<Integer>> map;
    Random rand;

    public Solution(int[] nums) {
        arr = nums;
        rand = new Random();
        map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> temp = map.get(target);
        int index = rand.nextInt(temp.size());
        return temp.get(index);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
