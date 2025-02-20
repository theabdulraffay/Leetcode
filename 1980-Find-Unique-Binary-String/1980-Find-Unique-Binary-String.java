class Solution {
    String helper(int n, HashSet set, String s) {
        if(s.length() == n) {
            if(!set.contains(s)) return s;
            return null;
        }
        String p = helper(n, set, s + '1');
        if(p != null) return p;
        return helper(n, set, s + '0');
    }
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        for(String i : nums) set.add(i);
        return helper(nums.length, set, "");
        
    }
}
