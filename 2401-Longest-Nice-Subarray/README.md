<h2><a href="https://leetcode.com/problems/longest-nice-subarray">2401. Longest Nice Subarray</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array <code>nums</code> consisting of positive integers.</p>
<p>We call a subarray of <code>nums</code> nice if the bitwise AND of every pair of elements that are in different positions in the subarray is equal to 0.</p>
<p>Return the length of the longest nice subarray.</p>

<p>A subarray is a contiguous part of an array.</p>

<p>Note that subarrays of length 1 are always considered nice.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,8,48,10]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
- 3 AND 8 = 0.
- 3 AND 48 = 0.
- 8 AND 48 = 0.
It can be proven that no longer nice subarray can be obtained, so we return 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,1,5,11,13]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
    <li><code>1 <= nums[i] <= 10<sup>9</sup></code></li>
</ul>
