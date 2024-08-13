<h2><a href="https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array">3217. Delete Nodes From Linked List Present in Array</a></h2>
<h3>Solved</h3>
<hr>
<p>You are given an array of integers <code>nums</code> and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in <code>nums</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3], head = [1,2,3,4,5]
<strong>Output:</strong> [4,5]
<strong>Explanation:</strong>
Remove the nodes with values 1, 2, and 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1], head = [1,2,1,2,1,2]
<strong>Output:</strong> [2,2,2]
<strong>Explanation:</strong>
Remove the nodes with value 1.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [5], head = [1,2,3,4]
<strong>Output:</strong> [1,2,3,4]
<strong>Explanation:</strong>
No node has value 5.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
  <li>1 ≤ <code>nums[i]</code> ≤ 10<sup>5</sup></li>
  <li>All elements in <code>nums</code> are unique.</li>
  <li>The number of nodes in the given list is in the range [1, 10<sup>5</sup>].</li>
  <li>1 ≤ <code>Node.val</code> ≤ 10<sup>5</sup></li>
  <li>The input is generated such that there is at least one node in the linked list that has a value not present in <code>nums</code>.</li>
</ul>
