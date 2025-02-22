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
    class Pair {
        int depth;
        int val;

        Pair(int x, int y) {
            val = x;
            depth = y;
        }
    }

    void helper(TreeNode node, int depth, Queue<Pair> que) {
        if (!que.isEmpty() && depth == que.peek().depth - 1) {
            node.left = new TreeNode(que.poll().val);
            helper(node.left, depth + 1, que);
        }

        if (!que.isEmpty() && depth == que.peek().depth - 1) {
            node.right = new TreeNode(que.poll().val);
            helper(node.right, depth + 1, que);
        }

    }

    public TreeNode recoverFromPreorder(String traversal) {
        Queue<Pair> list = new LinkedList<>();
        for (int i = 0; i < traversal.length(); i++) {
            int val = 0;
            int depth = 0;
            while (traversal.charAt(i) == '-') {
                depth++;
                i++;
            }
            while (i < traversal.length() && traversal.charAt(i) != '-') {
                val *= 10;
                val += (traversal.charAt(i) - '0');
                i++;
            }
            i--;
            list.add(new Pair(val, depth));
        }
        TreeNode root = new TreeNode(list.poll().val);
        helper(root, 0, list);
        return root;

    }
}
