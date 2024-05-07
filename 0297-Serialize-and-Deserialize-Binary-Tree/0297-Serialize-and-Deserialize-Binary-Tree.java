/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    StringBuffer list = new StringBuffer();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        helper(root);
        return list.toString();
    }

    void helper(TreeNode root) {
        if(root == null) {
            list.append("null ");
            return;
        }
        list.append(String.valueOf(root.val));
        list.append(" ");
        helper(root.left);
        helper(root.right);

    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(" ");
        return helper2(s);
        
    }
    int index = 0;
    TreeNode helper2(String[] s) {
        if(s[index].equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s[index]));
        index++;
        root.left = helper2(s);
        index++;
        root.right = helper2(s);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
