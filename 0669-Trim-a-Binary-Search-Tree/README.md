<h2><a href="https://leetcode.com/problems/trim-a-binary-search-tree">669. Trim a Binary Search Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary search tree and the lowest and highest boundaries as <code>low</code> and <code>high</code>, trim the tree so that all its elements lie in [<code>low</code>, <code>high</code>]. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.</p>
<p>Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,0,2], low = 1, high = 2
<strong>Output:</strong> [1,null,2]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [3,0,4,null,2,null,null,1], low = 1, high = 3
<strong>Output:</strong> [3,2,null,1]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 10^4].</li>
<li>0 ≤ <code>Node.val</code> ≤ 10^4</li>
<li>The value of each node in the tree is unique.</li>
<li><code>root</code> is guaranteed to be a valid binary search tree.</li>
<li>0 ≤ <code>low</code> ≤ <code>high</code> ≤ 10^4</li>
</ul>
