<h2><a href="https://leetcode.com/problems/find-the-power-of-k-size-subarrays-ii">3255. Find the Power of K-Size Subarrays II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array of integers <code>nums</code> of length <code>n</code> and a positive integer <code>k</code>.</p>

<p>The power of an array is defined as:</p>
<ul>
    <li>Its maximum element if all of its elements are consecutive and sorted in ascending order.</li>
    <li><code>-1</code> otherwise.</li>
</ul>

<p>You need to find the power of all subarrays of <code>nums</code> of size <code>k</code>.</p>

<p>Return an integer array <code>results</code> of size <code>n - k + 1</code>, where <code>results[i]</code> is the power of <code>nums[i..(i + k - 1)]</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,3,2,5], k = 3
<strong>Output:</strong> [3,4,-1,-1,-1]

<strong>Explanation:</strong> 
There are 5 subarrays of nums of size 3:
[1, 2, 3] with the maximum element 3.
[2, 3, 4] with the maximum element 4.
[3, 4, 3] whose elements are not consecutive.
[4, 3, 2] whose elements are not sorted.
[3, 2, 5] whose elements are not consecutive.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,2,2,2,2], k = 4
<strong>Output:</strong> [-1,-1]
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,2,3,2,3,2], k = 2
<strong>Output:</strong> [-1,3,-1,3,-1]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= n == nums.length <= 10<sup>5</sup></code></li>
    <li><code>1 <= nums[i] <= 10<sup>6</sup></code></li>
    <li><code>1 <= k <= n</code></li>
</ul>
