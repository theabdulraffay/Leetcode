class Solution {
    public boolean divideArray(int[] nums) {
        int c = 0,p=0;
        for(int i = 0; i < nums.length; i++) {
            c ^= nums[i];
            p ^= nums[i] + 1;
        }
        return c == 0 && p == 0;
        // HashSet<Integer> s =  new HashSet<>();
        // for(int i : nums) {
        //     if(s.contains(i)) s.remove(i);
        //     else s.add(i);
        // }
        // return s.isEmpty();
        
    }
}
