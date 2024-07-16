<h2><a href="https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another">2096. Step-By-Step Directions From a Binary Tree Node to Another</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root of a binary tree with <code>n</code> nodes. Each node is uniquely assigned a value from <code>1</code> to <code>n</code>. You are also given an integer <code>startValue</code> representing the value of the start node <code>s</code>, and a different integer <code>destValue</code> representing the value of the destination node <code>t</code>.</p>

<p>Find the shortest path starting from node <code>s</code> and ending at node <code>t</code>. Generate step-by-step directions of such path as a string consisting of only the uppercase letters 'L', 'R', and 'U'. Each letter indicates a specific direction:</p>
<ul>
  <li>'L' means to go from a node to its left child node.</li>
  <li>'R' means to go from a node to its right child node.</li>
  <li>'U' means to go from a node to its parent node.</li>
</ul>
<p>Return the step-by-step directions of the shortest path from node <code>s</code> to node <code>t</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
<strong>Output:</strong> "UURL"
<strong>Explanation:</strong> The shortest path is: 3 → 1 → 5 → 2 → 6.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [2,1], startValue = 2, destValue = 1
<strong>Output:</strong> "L"
<strong>Explanation:</strong> The shortest path is: 2 → 1.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the tree is <code>n</code>.</li>
  <li><code>2 <= n <= 10^5</code></li>
  <li><code>1 <= Node.val <= n</code></li>
  <li>All the values in the tree are unique.</li>
  <li><code>1 <= startValue, destValue <= n</code></li>
  <li><code>startValue != destValue</code></li>
</ul>
