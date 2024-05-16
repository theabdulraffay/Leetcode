<h2><a href="https://leetcode.com/problems/evaluate-boolean-binary-tree/">2331. Evaluate Boolean Binary Tree</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given the root of a full binary tree with the following properties:</p>
<ul>
<li>Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.</li>
<li>Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.</li>
</ul>
<p>The evaluation of a node is as follows:</p>
<ul>
<li>If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.</li>
<li>Otherwise, evaluate the node's two children and apply the boolean operation of its value with the children's evaluations.</li>
</ul>
<p>Return the boolean result of evaluating the root node.</p>
<p>A full binary tree is a binary tree where each node has either 0 or 2 children.</p>
<p>A leaf node is a node that has zero children.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [2,1,3,null,null,0,1]
<strong>Output:</strong> true
<strong>Explanation:</strong> The above diagram illustrates the evaluation process.
The AND node evaluates to False AND True = False.
The OR node evaluates to True OR False = True.
The root node evaluates to True, so we return true.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [0]
<strong>Output:</strong> false
<strong>Explanation:</strong> The root node is a leaf node and it evaluates to false, so we return false.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [1, 1000].</li>
<li>0 ≤ Node.val ≤ 3</li>
<li>Every node has either 0 or 2 children.</li>
<li>Leaf nodes have a value of 0 or 1.</li>
<li>Non-leaf nodes have a value of 2 or 3.</li>
</ul>
