<h2><a href="https://leetcode.com/problems/delete-node-in-a-bst">450. Delete Node in a BST</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.</p>
<p>Basically, the deletion can be divided into two stages:</p>
<ol>
<li>Search for a node to remove.</li>
<li>If the node is found, delete the node.</li>
</ol>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [5,3,6,2,4,null,7], key = 3
<strong>Output:</strong> [5,4,6,2,null,null,7]
<strong>Explanation:</strong> Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [5,3,6,2,4,null,7], key = 0
<strong>Output:</strong> [5,3,6,2,4,null,7]
<strong>Explanation:</strong> The tree does not contain a node with value = 0.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [], key = 0
<strong>Output:</strong> []
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree is in the range [0, 10^4].</li>
<li>-10^5 ≤ Node.val ≤ 10^5</li>
<li>Each node has a unique value.</li>
<li><code>root</code> is a valid binary search tree.</li>
<li>-10^5 ≤ key ≤ 10^5</li>
</ul>
<p><strong>Follow up:</strong> Could you solve it with time complexity O(height of tree)?</p>
