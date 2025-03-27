class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> suffix = new HashMap<>();
        HashMap<Integer, Integer> prefix = new HashMap<>();

        for(int i : nums) suffix.put(i, suffix.getOrDefault(i, 0) + 1);


        for (int i = 0 ; i < nums.size(); i++) {
            int j =  nums.get(i);
            prefix.put(j, prefix.getOrDefault(j, 0) + 1);
            suffix.put(j, suffix.getOrDefault(j, 0) - 1);


            if (
                prefix.get(j)  * 2 > (i + 1) &&
                suffix.get(j)  * 2 > nums.size() - i - 1
            ) {
                return i;
            }
        }
        return -1;
        
    }
}
