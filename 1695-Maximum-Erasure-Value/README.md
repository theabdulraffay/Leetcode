<h2><a href="https://leetcode.com/problems/maximum-erasure-value">1695. Maximum Erasure Value</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array of positive integers <code>nums</code> and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.</p>
<p>Return the maximum score you can get by erasing exactly one subarray.</p>
<p>An array <code>b</code> is called to be a subarray of <code>a</code> if it forms a contiguous subsequence of <code>a</code>, that is, if it is equal to <code>a[l], a[l+1], ..., a[r]</code> for some <code>(l, r)</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,2,4,5,6]
<strong>Output:</strong> 17
<strong>Explanation:</strong> The optimal subarray here is [2,4,5,6].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,2,1,2,5,2,1,2,5]
<strong>Output:</strong> 8
<strong>Explanation:</strong> The optimal subarray here is [5,2,1] or [1,2,5].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>1 ≤ <code>nums[i]</code> ≤ 10<sup>4</sup></li>
</ul>
