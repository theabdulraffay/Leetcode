<h2><a href="https://leetcode.com/problems/complete-binary-tree-inserter">919. Complete Binary Tree Inserter</a></h2>
<h3>Medium</h3>
<hr>
<p>A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.</p>
<p>Design an algorithm to insert a new node to a complete binary tree keeping it complete after the insertion.</p>
<p>Implement the CBTInserter class:</p>
<ul>
<li><code>CBTInserter(TreeNode root)</code> Initializes the data structure with the root of the complete binary tree.</li>
<li><code>int insert(int v)</code> Inserts a TreeNode into the tree with value <code>Node.val == val</code> so that the tree remains complete, and returns the value of the parent of the inserted TreeNode.</li>
<li><code>TreeNode get_root()</code> Returns the root node of the tree.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input</strong>
["CBTInserter", "insert", "insert", "get_root"]
[[[1, 2]], [3], [4], []]
<strong>Output</strong>
[null, 1, 2, [1, 2, 3, 4]]
<strong>Explanation:</strong>
CBTInserter cBTInserter = new CBTInserter([1, 2]);
cBTInserter.insert(3);  // return 1
cBTInserter.insert(4);  // return 2
cBTInserter.get_root(); // return [1, 2, 3, 4]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree will be in the range [1, 1000].</li>
<li>0 ≤ <code>Node.val</code> ≤ 5000</li>
<li><code>root</code> is a complete binary tree.</li>
<li>0 ≤ <code>val</code> ≤ 5000</li>
<li>At most 10<sup>4</sup> calls will be made to <code>insert</code> and <code>get_root</code>.</li>
</ul>
