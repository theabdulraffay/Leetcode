<h2><a href="https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level">2471. Minimum Number of Operations to Sort a Binary Tree by Level</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root of a binary tree with unique values.</p>
<p>In one operation, you can choose any two nodes at the same level and swap their values.</p>
<p>Return the minimum number of operations needed to make the values at each level sorted in a strictly increasing order.</p>
<p>The level of a node is the number of edges along the path between it and the root node.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [1,4,3,7,6,8,5,null,null,null,null,9,null,10]
<strong>Output:</strong> 3
<strong>Explanation:</strong>
- Swap 4 and 3. The 2nd level becomes [3,4].
- Swap 7 and 5. The 3rd level becomes [5,6,8,7].
- Swap 8 and 7. The 3rd level becomes [5,6,7,8].
We used 3 operations so return 3.
It can be proven that 3 is the minimum number of operations needed.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [1,3,2,7,6,5,4]
<strong>Output:</strong> 3
<strong>Explanation:</strong>
- Swap 3 and 2. The 2nd level becomes [2,3].
- Swap 7 and 4. The 3rd level becomes [4,6,5,7].
- Swap 6 and 5. The 3rd level becomes [4,5,6,7].
We used 3 operations so return 3.
It can be proven that 3 is the minimum number of operations needed.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2,3,4,5,6]
<strong>Output:</strong> 0
<strong>Explanation:</strong> Each level is already sorted in increasing order so return 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range <code>[1, 10<sup>5</sup>]</code>.</li>
<li><code>1 <= Node.val <= 10<sup>5</sup></code></li>
<li>All the values of the tree are unique.</li>
</ul>
