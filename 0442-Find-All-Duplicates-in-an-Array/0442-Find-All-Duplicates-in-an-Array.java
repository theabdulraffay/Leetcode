class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashSet<Integer> map = new HashSet<>();
        // List<Integer> n = new ArrayList<>();
        // for(int i : nums) {
        //     if(map.contains(i)){ //&& !unpair.contains(i)){
        //         n.add(i);
        //     }
        //     map.add(i);
        // }
        // return n;

        int size  = nums.length;
        boolean[] n = new boolean[size + 1];
        List<Integer> fina = new ArrayList<>();
        for(int i : nums) {
            if(n[i]) {
                fina.add(i);
            }
            n[i] = true;
        }
        return fina;


        
    }
}
