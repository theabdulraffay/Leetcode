<h2><a href="https://leetcode.com/problems/binary-subarrays-with-sum">930. Binary Subarrays With Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary array <code>nums</code> and an integer <code>goal</code>, return the number of non-empty subarrays with a sum equal to <code>goal</code>.</p>

<p>A subarray is a contiguous part of the array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,0,1,0,1], goal = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,0,0,0,0], goal = 0
<strong>Output:</strong> 15
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 3 * 10^4</code></li>
  <li><code>nums[i]</code> is either 0 or 1.</li>
  <li><code>0 <= goal <= nums.length</code></li>
</ul>
