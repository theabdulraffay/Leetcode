<h2><a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/">114. Flatten Binary Tree to Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary tree, flatten the tree into a "linked list":</p>
<ul>
<li>The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.</li>
<li>The "linked list" should be in the same order as a pre-order traversal of the binary tree.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,5,3,4,null,6]
<strong>Output:</strong> [1,null,2,null,3,null,4,null,5,null,6]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [0]
<strong>Output:</strong> [0]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [0, 2000].</li>
<li>-100 <= Node.val <= 100</li>
</ul>
<p><strong>Follow up:</strong> Can you flatten the tree in-place (with O(1) extra space)?</p>
