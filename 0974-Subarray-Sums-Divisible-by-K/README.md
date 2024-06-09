<h2><a href="https://leetcode.com/problems/subarray-sums-divisible-by-k">974. Subarray Sums Divisible by K</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return the number of non-empty subarrays that have a sum divisible by <code>k</code>.</p>
<p>A subarray is a contiguous part of an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,5,0,-2,-3,1], k = 5
<strong>Output:</strong> 7
<strong>Explanation:</strong> There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5], k = 9
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ nums.length ≤ 3 * 10<sup>4</sup></li>
<li>-10<sup>4</sup> ≤ nums[i] ≤ 10<sup>4</sup></li>
<li>2 ≤ k ≤ 10<sup>4</sup></li>
</ul>
