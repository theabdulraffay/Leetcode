<h2><a href="https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit">1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit</a></h2>
<h3>Solved</h3>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>nums</code> and an integer <code>limit</code>, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to <code>limit</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [8,2,4,7], limit = 4
<strong>Output:</strong> 2 
<strong>Explanation:</strong> All subarrays are: 
[8] with maximum absolute diff |8-8| = 0 <= 4.
[8,2] with maximum absolute diff |8-2| = 6 > 4. 
[8,2,4] with maximum absolute diff |8-2| = 6 > 4.
[8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
[2] with maximum absolute diff |2-2| = 0 <= 4.
[2,4] with maximum absolute diff |2-4| = 2 <= 4.
[2,4,7] with maximum absolute diff |2-7| = 5 > 4.
[4] with maximum absolute diff |4-4| = 0 <= 4.
[4,7] with maximum absolute diff |4-7| = 3 <= 4.
[7] with maximum absolute diff |7-7| = 0 <= 4. 
Therefore, the size of the longest subarray is 2.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,1,2,4,7,2], limit = 5
<strong>Output:</strong> 4 
<strong>Explanation:</strong> The subarray [2,4,7,2] is the longest since the maximum absolute diff is |2-7| = 5 <= 5.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,2,2,2,4,4,2,2], limit = 0
<strong>Output:</strong> 3
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
  <li>1 ≤ <code>nums[i]</code> ≤ 10<sup>9</sup></li>
  <li>0 ≤ <code>limit</code> ≤ 10<sup>9</sup></li>
</ul>
