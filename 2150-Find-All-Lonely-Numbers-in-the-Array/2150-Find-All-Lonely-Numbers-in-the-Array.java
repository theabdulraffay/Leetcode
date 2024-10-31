class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i : nums) {
            if(map.get(i) == 1) {
                if(!set.contains(i + 1) && !set.contains(i - 1)) list.add(i);
            }
        }
        return list;

    }
}
