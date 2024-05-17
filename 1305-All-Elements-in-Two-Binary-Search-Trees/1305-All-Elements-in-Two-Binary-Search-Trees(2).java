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
    void insert(TreeNode r1, List<Integer> m ) {
        if(r1 == null) return;
        insert(r1.left, m);
        m.add(r1.val);
        insert(r1.right, m);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> m = new ArrayList<Integer>();
        insert(root1, m);
        List<Integer> n = new ArrayList<Integer>();
        insert(root2, n);

        List<Integer> toRet = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < m.size() && j < n.size()) {
            if(m.get(i) < n.get(j)) {
                toRet.add(m.get(i));
                i++;
            } else {
                toRet.add(n.get(j));
                j++;
            }
        }

        while(i < m.size()) {
            toRet.add(m.get(i++));
        }

        while(j < n.size()) {
            toRet.add(n.get(j++));
        }




        // Collections.sort(l);
        return toRet;
    }
}
