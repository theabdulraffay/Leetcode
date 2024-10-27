<h2><a href="https://leetcode.com/problems/arithmetic-slices">413. Arithmetic Slices</a></h2>
<h3>Medium</h3>
<hr>
<p>An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.</p>

<p>For example, <code>[1,3,5,7,9]</code>, <code>[7,7,7,7]</code>, and <code>[3,-1,-5,-9]</code> are arithmetic sequences.</p>

<p>Given an integer array <code>nums</code>, return the number of arithmetic subarrays of <code>nums</code>.</p>

<p>A subarray is a contiguous subsequence of the array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> 3
<strong>Explanation:</strong> We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1]
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= nums.length <= 5000</code></li>
<li><code>-1000 <= nums[i] <= 1000</code></li>
</ul>
