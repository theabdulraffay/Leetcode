class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> m = new HashSet<>();
        boolean[] m = new boolean[nums.length];
        for(int i : nums) {
            // if(m.contains(i)){
            if(m[i]){
                return i;
            }
            m[i] = true;
        }
        return -1;
    }
}
