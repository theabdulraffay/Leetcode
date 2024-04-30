<h2><a href="https://leetcode.com/problems/validate-binary-search-tree">98. Validate Binary Search Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary tree, determine if it is a valid binary search tree (BST).</p>
<p>A valid BST is defined as follows:</p>
<ul>
<li>The left subtree of a node contains only nodes with keys less than the node's key.</li>
<li>The right subtree of a node contains only nodes with keys greater than the node's key.</li>
<li>Both the left and right subtrees must also be binary search trees.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [2,1,3]
<strong>Output:</strong> true
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [5,1,4,null,null,3,6]
<strong>Output:</strong> false
<strong>Explanation:</strong> The root node's value is 5 but its right child's value is 4.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 10^4].</li>
<li>-2^31 <= Node.val <= 2^31 - 1</li>
</ul>
