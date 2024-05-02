<h2><a href="https://leetcode.com/problems/cousins-in-binary-tree">993. Cousins in Binary Tree</a></h2>
<h3>Easy</h3>
<hr>
<p>Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.</p>
<p>Two nodes of a binary tree are cousins if they have the same depth with different parents.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3,4], x = 4, y = 3
<strong>Output:</strong> false
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3,null,4,null,5], x = 5, y = 4
<strong>Output:</strong> true
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3,null,4], x = 2, y = 3
<strong>Output:</strong> false
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [2, 100].</li>
<li>1 <= Node.val <= 100</li>
<li>Each node has a unique value.</li>
<li>x != y</li>
<li>x and y are exist in the tree.</li>
</ul>
