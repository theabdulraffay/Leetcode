<h2><a href="https://leetcode.com/problems/sort-array-by-increasing-frequency">1636. Sort Array by Increasing Frequency</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array of integers <code>nums</code>, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.</p>
<p>Return the sorted array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,2,2,2,3]
<strong>Output:</strong> [3,1,1,2,2,2]
<strong>Explanation:</strong> '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,3,1,3,2]
<strong>Output:</strong> [1,3,3,2,2]
<strong>Explanation:</strong> '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [-1,1,-6,4,5,-6,1,4,1]
<strong>Output:</strong> [5,-1,4,4,-6,-6,1,1,1]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 100</li>
<li>-100 ≤ <code>nums[i]</code> ≤ 100</li>
</ul>
