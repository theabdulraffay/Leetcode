<h2><a href="https://leetcode.com/problems/recover-a-tree-from-preorder-traversal">1028. Recover a Tree From Preorder Traversal</a></h2>
<h3>Hard</h3>
<hr>
<p>We run a preorder depth-first search (DFS) on the root of a binary tree.</p>
<p>At each node in this traversal, we output <code>D</code> dashes (where <code>D</code> is the depth of this node), then we output the value of this node. If the depth of a node is <code>D</code>, the depth of its immediate child is <code>D + 1</code>. The depth of the root node is 0.</p>
<p>If a node has only one child, that child is guaranteed to be the left child.</p>
<p>Given the output traversal of this traversal, recover the tree and return its root.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> traversal = "1-2--3--4-5--6--7"
<strong>Output:</strong> [1,2,5,3,4,6,7]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> traversal = "1-2--3---4-5--6---7"
<strong>Output:</strong> [1,2,5,3,null,6,null,4,null,7]
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> traversal = "1-401--349---90--88"
<strong>Output:</strong> [1,401,null,349,88,90]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the original tree is in the range [1, 1000].</li>
  <li>1 <= <code>Node.val</code> <= 10<sup>9</sup></li>
</ul>
