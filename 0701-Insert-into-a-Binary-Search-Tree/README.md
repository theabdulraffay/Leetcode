<h2><a href="https://leetcode.com/problems/insert-into-a-binary-search-tree">701. Insert into a Binary Search Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.</p>
<p>Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> root = [4,2,7,1,3], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
<strong>Explanation:</strong> Another accepted tree is:
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> root = [40,20,60,10,30,50,70], val = 25
<strong>Output:</strong> [40,20,60,10,30,50,70,null,null,25]
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>The number of nodes in the tree will be in the range [0, 10^4].</li>
<li>-10^8 <= Node.val <= 10^8</li>
<li>All the values Node.val are unique.</li>
<li>-10^8 <= val <= 10^8</li>
<li>It's guaranteed that val does not exist in the original BST.</li>
</ul>
