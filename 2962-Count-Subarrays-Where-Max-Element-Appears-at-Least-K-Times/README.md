<h2><a href="https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times">2962. Count Subarrays Where Max Element Appears at Least K Times</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code> and a positive integer <code>k</code>.</p>

<p>Return the number of subarrays where the maximum element of <code>nums</code> appears at least <code>k</code> times in that subarray.</p>

<p>A subarray is a contiguous sequence of elements within an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,2,3,3], k = 2
<strong>Output:</strong> 6
<strong>Explanation:</strong> The subarrays that contain the element 3 at least 2 times are: 
[1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3], and [3,3].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,4,2,1], k = 3
<strong>Output:</strong> 0
<strong>Explanation:</strong> No subarray contains the element 4 at least 3 times.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
<li><code>1 <= nums[i] <= 10<sup>6</sup></code></li>
<li><code>1 <= k <= 10<sup>5</sup></code></li>
</ul>
