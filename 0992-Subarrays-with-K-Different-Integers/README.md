<h2><a href="https://leetcode.com/problems/subarrays-with-k-different-integers">992. Subarrays with K Different Integers</a></h2>
<h3>Solved</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return the number of good subarrays of <code>nums</code>.</p>
<p>A good array is an array where the number of different integers in that array is exactly <code>k</code>.</p>
<p>For example, <code>[1,2,3,1,2]</code> has 3 different integers: 1, 2, and 3. A subarray is a contiguous part of an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,1,2,3], k = 2
<strong>Output:</strong> 7
<strong>Explanation:</strong> Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,1,3,4], k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; nums.length &le; 2 * 10<sup>4</sup></code></li>
  <li><code>1 &le; nums[i], k &le; nums.length</code></li>
</ul>
