<h2><a href="https://leetcode.com/problems/max-consecutive-ones-iii">1004. Max Consecutive Ones III</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary array <code>nums</code> and an integer <code>k</code>, return the maximum number of consecutive 1's in the array if you can flip at most <code>k</code> 0's.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
<strong>Output:</strong> 6
<strong>Explanation:</strong> [1,1,1,0,0,<b>1,1,1,1,1,1</b>]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
<strong>Output:</strong> 10
<strong>Explanation:</strong> [0,0,<b>1,1,1,1,1,1,1,1,1,1</b>,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li><code>nums[i]</code> is either 0 or 1.</li>
<li>0 ≤ <code>k</code> ≤ <code>nums.length</code></li>
</ul>
