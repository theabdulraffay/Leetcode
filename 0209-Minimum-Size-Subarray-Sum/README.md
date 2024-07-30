<h2><a href="https://leetcode.com/problems/minimum-size-subarray-sum">209. Minimum Size Subarray Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of positive integers <code>nums</code> and a positive integer <code>target</code>, return the minimal length of a subarray whose sum is greater than or equal to <code>target</code>. If there is no such subarray, return 0 instead.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> target = 7, nums = [2,3,1,2,4,3]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The subarray [4,3] has the minimal length under the problem constraint.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> target = 4, nums = [1,4,4]
<strong>Output:</strong> 1
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> target = 11, nums = [1,1,1,1,1,1,1,1]
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>target</code> ≤ 10<sup>9</sup></li>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>1 ≤ <code>nums[i]</code> ≤ 10<sup>4</sup></li>
</ul>

<p><strong>Follow up:</strong> If you have figured out the O(n) solution, try coding another solution with a time complexity of O(n log(n)).</p>
