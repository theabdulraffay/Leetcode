<h2><a href="https://leetcode.com/problems/cousins-in-binary-tree-ii">2641. Cousins in Binary Tree II</a></h2>
<h3>Medium</h3>
<hr>
<p>Given the root of a binary tree, replace the value of each node in the tree with the sum of all its cousins' values.</p>

<p>Two nodes of a binary tree are cousins if they have the same depth with different parents.</p>

<p>Return the root of the modified tree.</p>

<p>Note that the depth of a node is the number of edges in the path from the root node to it.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> root = [5,4,9,1,10,null,7]
<strong>Output:</strong> [0,0,0,7,7,null,11]
<strong>Explanation:</strong> The diagram above shows the initial binary tree and the binary tree after changing the value of each node.
- Node with value 5 does not have any cousins so its sum is 0.
- Node with value 4 does not have any cousins so its sum is 0.
- Node with value 9 does not have any cousins so its sum is 0.
- Node with value 1 has a cousin with value 7 so its sum is 7.
- Node with value 10 has a cousin with value 7 so its sum is 7.
- Node with value 7 has cousins with values 1 and 10 so its sum is 11.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [3,1,2]
<strong>Output:</strong> [0,0,0]
<strong>Explanation:</strong> The diagram above shows the initial binary tree and the binary tree after changing the value of each node.
- Node with value 3 does not have any cousins so its sum is 0.
- Node with value 1 does not have any cousins so its sum is 0.
- Node with value 2 does not have any cousins so its sum is 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range <code>[1, 10^5]</code>.</li>
<li><code>1 <= Node.val <= 10^4</code></li>
</ul>
