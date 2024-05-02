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
    public boolean isCousins(TreeNode root, int x, int y) {
    	TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy));
    }


    boolean isSibling(TreeNode root, TreeNode xx, TreeNode yy) {
    	if (root == null) {
    		return false;
    	}
    	return (
    		(root.left == xx && root.right == yy) || (root.right == xx && root.left == yy) || isSibling(root.left, xx, yy) || isSibling(root.right, xx, yy)
    	);
    }

    TreeNode findNode(TreeNode root, int x) {
    	if (root == null) {
    		return null;
    	}
    	if (root.val == x) {
    		return root;
    	}
    	TreeNode left = findNode(root.left, x);
    	if (left != null) {
    		return left;
    	}
    	return findNode(root.right, x);
    }

    int level (TreeNode root, TreeNode xx, int level) {
    	if(root == null) {
    		return 0;
    	}
    	if (root == xx) {
    		return level;
    	}
    	int l = level(root.left, xx, level + 1);
    	if(l != 0) {
    		return l;
    	}
    	return level(root.right, xx, level + 1);
    }
}
