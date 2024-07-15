<h2><a href="https://leetcode.com/problems/create-binary-tree-from-descriptions">2196. Create Binary Tree From Descriptions</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 2D integer array <code>descriptions</code> where <code>descriptions[i] = [parent<sub>i</sub>, child<sub>i</sub>, isLeft<sub>i</sub>]</code> indicates that <code>parent<sub>i</sub></code> is the parent of <code>child<sub>i</sub></code> in a binary tree of unique values. Furthermore,</p>
<ul>
<li>If <code>isLeft<sub>i</sub> == 1</code>, then <code>child<sub>i</sub></code> is the left child of <code>parent<sub>i</sub></code>.</li>
<li>If <code>isLeft<sub>i</sub> == 0</code>, then <code>child<sub>i</sub></code> is the right child of <code>parent<sub>i</sub></code>.</li>
</ul>
<p>Construct the binary tree described by <code>descriptions</code> and return its root.</p>
<p>The test cases will be generated such that the binary tree is valid.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
<strong>Output:</strong> [50,20,80,15,17,19]
<strong>Explanation:</strong> The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> descriptions = [[1,2,1],[2,3,0],[3,4,1]]
<strong>Output:</strong> [1,2,null,null,3,4]
<strong>Explanation:</strong> The root node is the node with value 1 since it has no parent.
The resulting binary tree is shown in the diagram.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>descriptions.length</code> ≤ 10<sup>4</sup></li>
<li><code>descriptions[i].length == 3</code></li>
<li>1 ≤ <code>parent<sub>i</sub>, child<sub>i</sub></code> ≤ 10<sup>5</sup></li>
<li>0 ≤ <code>isLeft<sub>i</sub></code> ≤ 1</li>
<li>The binary tree described by <code>descriptions</code> is valid.</li>
</ul>
