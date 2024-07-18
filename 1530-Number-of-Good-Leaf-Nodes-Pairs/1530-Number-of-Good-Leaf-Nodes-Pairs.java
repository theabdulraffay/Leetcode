/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int k, count;
    HashMap<TreeNode, List<Integer>> map;
    boolean recursion(TreeNode root) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        boolean left = recursion(root.left);
        boolean right = recursion(root.right);
        if(left && right) {
            List<Integer> l = another(root.left, 1);
            List<Integer> r = another(root.right, 1);

            for(int i = 0; i < l.size(); i++) {
                for(int j = 0; j < r.size(); j++) {
                    if(l.get(i) + r.get(j) <= k) { // Use 
                        count++;
                    }
                }
            }

            List<Integer> lo = new ArrayList<>();
            lo.addAll(r); lo.addAll(l);
            map.put(root, lo);        
        }
        return left || right;
    }

    List<Integer> another(TreeNode root, int length) {
        if(root == null) return null;
        if(map.containsKey(root)) {
            // List<Integer> list = new ArrayList<>();
            List<Integer> toret = map.get(root);
            for(int i = 0; i < toret.size(); i++) {
                toret.set(i, toret.get(i) + length);
            }
            return toret;

        }
        if(root.left == null && root.right == null) {
            return Arrays.asList(length);
        }
        List<Integer> left = another(root.left, length + 1);
        if(left != null) return left;
        return another(root.right, length + 1);
    }
    public int countPairs(TreeNode root, int distance) {
        k = distance;
        count = 0;
        map = new HashMap<>();
        recursion(root);
        return count;
    }
}
