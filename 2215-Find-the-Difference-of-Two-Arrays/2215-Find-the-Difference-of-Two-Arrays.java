class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> m = new HashSet<>();

        for (int i : nums1) {
            s.add(i);
        }

        for (int i : nums2) {
            m.add(i);
        }

        List<List<Integer>> toret = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        for (int i : s) {
            if(!m.contains(i)) {
                first.add(i);
            }
        }
        toret.add(first);

        List<Integer> sec = new ArrayList<>();
        for (int i : m) {
            if(!s.contains(i)) {
                sec.add(i);
            }
        }
        toret.add(sec);
        return toret;

        
    }
}
