/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> parents = new HashSet<>();
        Map<Integer, List<int[]>> childrenMap = new HashMap<>();

        for (int[] desc : descriptions) {
            parents.add(desc[0]);
            childrenMap.computeIfAbsent(desc[0], k -> new ArrayList<>()).add(desc);
        }

        for (int[] desc : descriptions) {
            parents.remove(desc[1]);
        }

        int rootVal = parents.iterator().next();
        TreeNode root = new TreeNode(rootVal);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (childrenMap.containsKey(node.val)) {
                for (int[] childDesc : childrenMap.get(node.val)) {
                    TreeNode childNode = new TreeNode(childDesc[1]);
                    if (childDesc[2] == 1) {
                        node.left = childNode;
                    } else {
                        node.right = childNode;
                    }
                    stack.push(childNode);
                }
            }
        }

        return root;
    }
}
