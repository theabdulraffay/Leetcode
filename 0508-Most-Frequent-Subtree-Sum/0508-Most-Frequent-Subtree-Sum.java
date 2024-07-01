class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0; // This will track the max frequency of rootsum
    int count = 0; // This is track the number of sums with max frequency
    int helper(TreeNode root) {
        if (root == null) return 0;
        
        int fi = helper(root.left);
        int se = helper(root.right);
        int sum = fi + se + root.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        int currFrequency = map.get(sum);

        if(max == currFrequency) { // if it is equal we simple increase the number of sum
            count++;
        }
        if(currFrequency > max) { // if it is greater we know this is new greater frequency this means this is the girst element so we change count to 1 and change the max value too
            count = 1;
            max = currFrequency;
        }
        return sum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        helper(root);
        // int max = 0;
        // for(int e : map.keySet()) {
        //     if (map.get(e) > max) max = map.get(e);
        // }
        int[] toret = new int[count];

        // List<Integer> l = new ArrayList<>();
        for(int e : map.keySet()) {
            if (map.get(e) == max) toret[--count] = e;
        }

        // for(int i = 0; i < toret.length; i++) {
        //     toret[i] = l.get(i);
        // }

        return toret;


        
    }
}
