<h2><a href="https://leetcode.com/problems/count-the-number-of-good-subarrays">2537. Count the Number of Good Subarrays</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return the number of good subarrays of <code>nums</code>.</p>
<p>A subarray <code>arr</code> is good if there are at least <code>k</code> pairs of indices <code>(i, j)</code> such that <code>i < j</code> and <code>arr[i] == arr[j]</code>.</p>
<p>A subarray is a contiguous non-empty sequence of elements within an array.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1,1,1], k = 10
<strong>Output:</strong> 1
<strong>Explanation:</strong> The only good subarray is the array nums itself.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,1,4,3,2,2,4], k = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 different good subarrays:
- [3,1,4,3,2,2] that has 2 pairs.
- [3,1,4,3,2,2,4] that has 3 pairs.
- [1,4,3,2,2,4] that has 2 pairs.
- [4,3,2,2,4] that has 2 pairs.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>nums[i]</code>, <code>k</code> <= 10<sup>9</sup></li>
</ul>
