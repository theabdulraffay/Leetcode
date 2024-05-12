<h2><a href="https://leetcode.com/problems/balance-a-binary-search-tree">1382. Balance a Binary Search Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.</p>
<p>A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,null,2,null,3,null,4,null,null]
<strong>Output:</strong> [2,1,3,null,null,null,4]
<strong>Explanation:</strong> This is not the only correct answer, [3,1,4,null,2] is also correct.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [2,1,3]
<strong>Output:</strong> [2,1,3]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 10^4].</li>
<li>1 ≤ <code>Node.val</code> ≤ 10^5</li>
</ul>
