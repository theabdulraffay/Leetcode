<h2><a href="https://leetcode.com/problems/increasing-triplet-subsequence">334. Increasing Triplet Subsequence</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5]
<strong>Output:</strong> true
<strong>Explanation:</strong> Any triplet where i < j < k is valid.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,4,3,2,1]
<strong>Output:</strong> false
<strong>Explanation:</strong> No triplet exists.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,5,0,4,6]
<strong>Output:</strong> true
<strong>Explanation:</strong> The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= nums.length <= 5 * 10^5</li>
<li>-2^31 <= nums[i] <= 2^31 - 1</li>
</ul>
<p><strong>Follow up:</strong> Could you implement a solution that runs in O(n) time complexity and O(1) space complexity?</p>
