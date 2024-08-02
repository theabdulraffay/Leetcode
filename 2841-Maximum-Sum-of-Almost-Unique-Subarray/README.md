<h2><a href="https://leetcode.com/problems/maximum-sum-of-almost-unique-subarray">2841. Maximum Sum of Almost Unique Subarray</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code> and two positive integers <code>m</code> and <code>k</code>.</p>

<p>Return the maximum sum out of all almost unique subarrays of length <code>k</code> of <code>nums</code>. If no such subarray exists, return <code>0</code>.</p>

<p>A subarray of <code>nums</code> is almost unique if it contains at least <code>m</code> distinct elements.</p>

<p>A subarray is a contiguous non-empty sequence of elements within an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,6,7,3,1,7], m = 3, k = 4
<strong>Output:</strong> 18
<strong>Explanation:</strong> There are 3 almost unique subarrays of size k = 4. These subarrays are [2, 6, 7, 3], [6, 7, 3, 1], and [7, 3, 1, 7]. Among these subarrays, the one with the maximum sum is [2, 6, 7, 3] which has a sum of 18.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,9,9,2,4,5,4], m = 1, k = 3
<strong>Output:</strong> 23
<strong>Explanation:</strong> There are 5 almost unique subarrays of size k. These subarrays are [5, 9, 9], [9, 9, 2], [9, 2, 4], [2, 4, 5], and [4, 5, 4]. Among these subarrays, the one with the maximum sum is [5, 9, 9] which has a sum of 23.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,1,2,1,2,1], m = 3, k = 3
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no subarrays of size k = 3 that contain at least m = 3 distinct elements in the given array [1,2,1,2,1,2,1]. Therefore, no almost unique subarrays exist, and the maximum sum is 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 2 * 10<sup>4</sup></li>
<li>1 ≤ <code>m</code> ≤ <code>k</code> ≤ <code>nums.length</code></li>
<li>1 ≤ <code>nums[i]</code> ≤ 10<sup>9</sup></li>
</ul>
