<h2><a href="https://leetcode.com/problems/continuous-subarrays">2762. Continuous Subarrays</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code>. A subarray of <code>nums</code> is called continuous if:</p>
<ul>
    <li>Let <code>i</code>, <code>i + 1</code>, ..., <code>j</code> be the indices in the subarray. Then, for each pair of indices <code>i <= i1, i2 <= j</code>, <code>0 <= |nums[i1] - nums[i2]| <= 2</code>.</li>
</ul>
<p>Return the total number of continuous subarrays.</p>

<p>A subarray is a contiguous non-empty sequence of elements within an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,4,2,4]
<strong>Output:</strong> 8
<strong>Explanation:</strong> 
Continuous subarray of size 1: [5], [4], [2], [4].
Continuous subarray of size 2: [5,4], [4,2], [2,4].
Continuous subarray of size 3: [4,2,4].
There are no subarrays of size 4.
Total continuous subarrays = 4 + 3 + 1 = 8.
It can be shown that there are no more continuous subarrays.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> 6
<strong>Explanation:</strong> 
Continuous subarray of size 1: [1], [2], [3].
Continuous subarray of size 2: [1,2], [2,3].
Continuous subarray of size 3: [1,2,3].
Total continuous subarrays = 3 + 2 + 1 = 6.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
    <li><code>1 <= nums[i] <= 10<sup>9</sup></code></li>
</ul>
