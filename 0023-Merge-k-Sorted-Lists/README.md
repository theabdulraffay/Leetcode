<h2><a href="https://leetcode.com/problems/merge-k-sorted-lists/description/">23. Merge k Sorted Lists</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.</p>
<p>Merge all the linked-lists into one sorted linked-list and return it.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> lists = [[1,4,5],[1,3,4],[2,6]]
<strong>Output:</strong> [1,1,2,3,4,4,5,6]
<strong>Explanation:</strong> The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> lists = []
<strong>Output:</strong> []
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> lists = [[]]
<strong>Output:</strong> []
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>k == lists.length</li>
  <li>0 <= k <= 104</li>
  <li>0 <= lists[i].length <= 500</li>
  <li>-104 <= lists[i][j] <= 104</li>
  <li>lists[i] is sorted in ascending order.</li>
  <li>The sum of lists[i].length will not exceed 104.</li>
</ul>
