<h2><a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree">236. Lowest Common Ancestor of a Binary Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.</p>
<p>According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
<strong>Output:</strong> 3
<strong>Explanation:</strong> The LCA of nodes 5 and 1 is 3.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
<strong>Output:</strong> 5
<strong>Explanation:</strong> The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2], p = 1, q = 2
<strong>Output:</strong> 1
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [2, 105].</li>
<li>-109 ≤ Node.val ≤ 109</li>
<li>All Node.val are unique.</li>
<li>p != q</li>
<li>p and q will exist in the tree.</li>
</ul>
