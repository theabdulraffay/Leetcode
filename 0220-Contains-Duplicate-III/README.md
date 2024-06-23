<h2><a href="https://leetcode.com/problems/contains-duplicate-iii">220. Contains Duplicate III</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given an integer array <code>nums</code> and two integers <code>indexDiff</code> and <code>valueDiff</code>.</p>
<p>Find a pair of indices (i, j) such that:</p>
<ul>
<li><code>i != j</code></li>
<li><code>abs(i - j) <= indexDiff</code></li>
<li><code>abs(nums[i] - nums[j]) <= valueDiff</code></li>
</ul>
<p>Return true if such a pair exists or false otherwise.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
<strong>Output:</strong> true
<strong>Explanation:</strong> We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
<strong>Output:</strong> false
<strong>Explanation:</strong> After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>2 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>-10<sup>9</sup> ≤ <code>nums[i]</code> ≤ 10<sup>9</sup></li>
<li>1 ≤ <code>indexDiff</code> ≤ <code>nums.length</code></li>
<li>0 ≤ <code>valueDiff</code> ≤ 10<sup>9</sup></li>
</ul>
