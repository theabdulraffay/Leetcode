class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int toret = 0;
        for(int i : map.keySet()) {
            if(map.containsKey(i + 1)) {
                toret = Math.max(toret, map.get(i) + map.get(i + 1));
            }
        }
        return toret;
        
    }
}
