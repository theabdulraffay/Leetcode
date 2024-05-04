<h2><a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree">108. Convert Sorted Array to Binary Search Tree</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [-10,-3,0,5,9]
<strong>Output:</strong> [0,-3,9,-10,null,5]
<strong>Explanation:</strong> [0,-10,5,null,-3,null,9] is also accepted:
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3]
<strong>Output:</strong> [3,1]
<strong>Explanation:</strong> [1,null,3] and [3,1] are both height-balanced BSTs.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= nums.length <= 104</li>
<li>-104 <= nums[i] <= 104</li>
<li>nums is sorted in a strictly increasing order.</li>
</ul>
