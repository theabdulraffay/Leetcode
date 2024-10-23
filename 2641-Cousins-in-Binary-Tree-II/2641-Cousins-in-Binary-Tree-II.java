/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int n = que.size();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode temp = que.poll();
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
                sum += temp.val;
            }
            list.add(sum);
        }
        que.clear();
        que.add(root);
        int j = 1;
        while (!que.isEmpty()) {
            int n = que.size();
            for (int i = 0; i < n; i++) {
                int sum = 0;
                TreeNode temp = que.poll();
                if (temp.left != null) {
                    que.add(temp.left);
                    sum += temp.left.val;
                }
                if (temp.right != null) {
                    que.add(temp.right);
                    sum += temp.right.val;
                }

                if (temp.left != null)
                    temp.left.val = list.get(j) - sum;
                if (temp.right != null)
                    temp.right.val = list.get(j) - sum;
            }
            j++;
        }
        root.val = 0;

        return root;

    }
}
