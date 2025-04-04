<h2><a href="https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes">865. Smallest Subtree with all the Deepest Nodes</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary tree, the depth of each node is the shortest distance to the root.</p>
<p>Return the smallest subtree such that it contains all the deepest nodes in the original tree.</p>
<p>A node is called the deepest if it has the largest depth possible among any node in the entire tree.</p>
<p>The subtree of a node is a tree consisting of that node, plus the set of all descendants of that node.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4]
<strong>Output:</strong> [2,7,4]
<strong>Explanation:</strong> We return the node with value 2, colored in yellow in the diagram.
The nodes coloured in blue are the deepest nodes of the tree.
Notice that nodes 5, 3 and 2 contain the deepest nodes in the tree but node 2 is the smallest subtree among them, so we return it.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [1]
<strong>Explanation:</strong> The root is the deepest node in the tree.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [0,1,3,null,2]
<strong>Output:</strong> [2]
<strong>Explanation:</strong> The deepest node in the tree is 2, the valid subtrees are the subtrees of nodes 2, 1 and 0 but the subtree of node 2 is the smallest.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the tree will be in the range [1, 500].</li>
  <li>0 <= <code>Node.val</code> <= 500</li>
  <li>The values of the nodes in the tree are unique.</li>
</ul>
