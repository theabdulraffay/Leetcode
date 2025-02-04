<h2><a href="https://leetcode.com/problems/maximum-ascending-subarray-sum">1800. Maximum Ascending Subarray Sum</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array of positive integers <code>nums</code>, return the maximum possible sum of an ascending subarray in <code>nums</code>.</p>
<p>A subarray is defined as a contiguous sequence of numbers in an array.</p>
<p>A subarray <code>[numsl, numsl+1, ..., numsr-1, numsr]</code> is ascending if for all <code>i</code> where <code>l <= i < r</code>, <code>numsi < numsi+1</code>. Note that a subarray of size 1 is ascending.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,20,30,5,10,50]
<strong>Output:</strong> 65
<strong>Explanation:</strong> [5,10,50] is the ascending subarray with the maximum sum of 65.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,20,30,40,50]
<strong>Output:</strong> 150
<strong>Explanation:</strong> [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [12,17,15,13,10,11,12]
<strong>Output:</strong> 33
<strong>Explanation:</strong> [10,11,12] is the ascending subarray with the maximum sum of 33.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 100</code></li>
  <li><code>1 <= nums[i] <= 100</code></li>
</ul>
